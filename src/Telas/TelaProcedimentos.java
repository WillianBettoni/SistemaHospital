package Telas;

import DAO.FuncionarioDAO;
import DAO.MedicamentoDAO;
import DAO.ProcedimentoDAO;
import DAO.ProntuarioDAO;
import Tabelas.Funcionario;
import Tabelas.Medicamento;
import Tabelas.Procedimento;
import Tabelas.Prontuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaProcedimentos extends javax.swing.JFrame {

    public TelaProcedimentos() {
        initComponents();
        carregaComboResponsavel(0);
        carregaComboMedicamento(0);
        carregaComboProntuario(0);
        eIdProcedimento.setVisible(false);
        c_descricao.requestFocus();
    }
    
    public TelaProcedimentos(Procedimento procedimento) {
        initComponents();
        c_descricao.setText(procedimento.getDescricao());
        c_observacao.setText(procedimento.getObservacao());
        c_dataInicial.setDate(procedimento.getDataInicial());
        c_dataFinal.setDate(procedimento.getDataFinal());
        eIdProcedimento.setText(String.valueOf(procedimento.getIdProcedimento()));
        eIdProcedimento.setVisible(false);
        c_descricao.requestFocus();       
        carregaComboResponsavel(procedimento.getIdFuncionario().getIdFuncionario());
        carregaComboProntuario(procedimento.getIdProntuario().getIdProntuario());
        if(procedimento.getIdMedicamento() != null){
            carregaComboMedicamento(procedimento.getIdMedicamento().getIdMedicamento());
        }else{
            cb_InserirMedicamento.setSelected(false);
            cb_Medicamento.setSelectedIndex(-1);
            cb_Medicamento.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        t_titulo = new javax.swing.JTextField();
        t_observacao = new javax.swing.JTextField();
        t_dataInicial = new javax.swing.JTextField();
        t_Responsavel = new javax.swing.JTextField();
        c_observacao = new javax.swing.JTextField();
        cb_Responsavel = new javax.swing.JComboBox<>();
        b_incluir = new javax.swing.JButton();
        b_consulta = new javax.swing.JButton();
        eIdProcedimento = new javax.swing.JTextField();
        c_dataInicial = new com.toedter.calendar.JDateChooser();
        btnLimpar = new javax.swing.JButton();
        t_descricao = new javax.swing.JTextField();
        c_descricao = new javax.swing.JTextField();
        c_dataFinal = new com.toedter.calendar.JDateChooser();
        t_dataFinal = new javax.swing.JTextField();
        cb_Medicamento = new javax.swing.JComboBox<>();
        t_observacao1 = new javax.swing.JTextField();
        b_NovoMedicamento = new javax.swing.JButton();
        cb_InserirMedicamento = new javax.swing.JCheckBox();
        cb_Prontuario = new javax.swing.JComboBox<>();
        t_Prontuario = new javax.swing.JTextField();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        t_titulo.setEditable(false);
        t_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        t_titulo.setText("PROCEDIMENTOS");
        t_titulo.setBorder(null);

        t_observacao.setEditable(false);
        t_observacao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_observacao.setText("Observação");
        t_observacao.setBorder(null);

        t_dataInicial.setEditable(false);
        t_dataInicial.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_dataInicial.setText("Data Inicial");
        t_dataInicial.setBorder(null);

        t_Responsavel.setEditable(false);
        t_Responsavel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Responsavel.setText("Funcionário");
        t_Responsavel.setBorder(null);

        c_observacao.setNextFocusableComponent(cb_InserirMedicamento);
        c_observacao.setPreferredSize(new java.awt.Dimension(6, 24));
        c_observacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_observacaoKeyTyped(evt);
            }
        });

        cb_Responsavel.setNextFocusableComponent(cb_Medicamento);
        cb_Responsavel.setPreferredSize(new java.awt.Dimension(31, 24));

        b_incluir.setText("Gravar");
        b_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_incluirActionPerformed(evt);
            }
        });

        b_consulta.setText("Consultar");
        b_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_consultaActionPerformed(evt);
            }
        });

        eIdProcedimento.setEnabled(false);

        c_dataInicial.setNextFocusableComponent(c_dataFinal);
        c_dataInicial.setPreferredSize(new java.awt.Dimension(95, 24));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        t_descricao.setEditable(false);
        t_descricao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_descricao.setText("Descrição");
        t_descricao.setBorder(null);

        c_descricao.setNextFocusableComponent(c_dataInicial);
        c_descricao.setPreferredSize(new java.awt.Dimension(6, 24));
        c_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_descricaoKeyTyped(evt);
            }
        });

        c_dataFinal.setNextFocusableComponent(cb_Responsavel);
        c_dataFinal.setPreferredSize(new java.awt.Dimension(95, 24));

        t_dataFinal.setEditable(false);
        t_dataFinal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_dataFinal.setText("Data Final");
        t_dataFinal.setBorder(null);

        cb_Medicamento.setNextFocusableComponent(cb_Prontuario);
        cb_Medicamento.setPreferredSize(new java.awt.Dimension(31, 24));

        t_observacao1.setEditable(false);
        t_observacao1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_observacao1.setText("Medicamento");
        t_observacao1.setBorder(null);

        b_NovoMedicamento.setText("Novo Medicamento");
        b_NovoMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_NovoMedicamentoActionPerformed(evt);
            }
        });

        cb_InserirMedicamento.setSelected(true);
        cb_InserirMedicamento.setText("Vincular Medicamento?");
        cb_InserirMedicamento.setNextFocusableComponent(b_incluir);
        cb_InserirMedicamento.setPreferredSize(new java.awt.Dimension(161, 26));
        cb_InserirMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_InserirMedicamentoActionPerformed(evt);
            }
        });

        cb_Prontuario.setNextFocusableComponent(c_observacao);
        cb_Prontuario.setPreferredSize(new java.awt.Dimension(31, 24));

        t_Prontuario.setEditable(false);
        t_Prontuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Prontuario.setText("Prontuário");
        t_Prontuario.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c_observacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_observacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(t_dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(t_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(c_dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cb_Responsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(t_Prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_Medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_NovoMedicamento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 55, Short.MAX_VALUE)
                                        .addComponent(b_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cb_Prontuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(eIdProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_InserirMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_observacao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eIdProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(t_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(t_dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c_dataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_dataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cb_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_observacao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_observacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(c_observacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(cb_InserirMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_incluir)
                    .addComponent(b_consulta)
                    .addComponent(btnLimpar)
                    .addComponent(b_NovoMedicamento))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_incluirActionPerformed
        Procedimento procedimento = new Procedimento();        
        if (fazVerificacoes()) {
            setsProcedimento(procedimento);
            if ((eIdProcedimento.getText().isEmpty()) || (Integer.parseInt(eIdProcedimento.getText()) == 0)) {
                ProcedimentoDAO procDAO = new ProcedimentoDAO();
                procDAO.incluir(procedimento);
                limparCampos();
            } else {
                ProcedimentoDAO alterar = new ProcedimentoDAO();
                procedimento.setIdProcedimento(Integer.parseInt(eIdProcedimento.getText()));
                alterar.update(procedimento);
                limparCampos();
            }
        }
    }//GEN-LAST:event_b_incluirActionPerformed

    private void b_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_consultaActionPerformed
        TelaListarProcedimentos historico = null;
        try {
            historico = new TelaListarProcedimentos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarProcedimentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        historico.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_consultaActionPerformed

    private void c_observacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_observacaoKeyTyped
        int numeroMaximo = 44;
        if (c_observacao.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_c_observacaoKeyTyped

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        c_descricao.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void c_descricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_descricaoKeyTyped
        int numeroMaximo = 44;
        if (c_descricao.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_c_descricaoKeyTyped

    private void b_NovoMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_NovoMedicamentoActionPerformed
        Procedimento procedimento = new Procedimento();   
        if ((eIdProcedimento.getText() != null) && (!eIdProcedimento.getText().isEmpty()))
            procedimento.setIdProcedimento(Integer.parseInt(eIdProcedimento.getText()));
        setsProcedimento(procedimento);
        TelaMedicamentos medicamento = new TelaMedicamentos(true, procedimento); 
        medicamento.setVisible(true); 
        dispose();
    }//GEN-LAST:event_b_NovoMedicamentoActionPerformed

    private void cb_InserirMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_InserirMedicamentoActionPerformed
        if(cb_InserirMedicamento.isSelected()){
            if(cb_Medicamento.getItemCount() == 0)
                carregaComboMedicamento(0);
            cb_Medicamento.setEnabled(true);
            cb_Medicamento.setSelectedIndex(0);
        }else {
            cb_Medicamento.setSelectedIndex(-1);
            cb_Medicamento.setEnabled(false);
        }
    }//GEN-LAST:event_cb_InserirMedicamentoActionPerformed

    private boolean fazVerificacoes() {
        if (c_descricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe uma descrição!");
            c_descricao.requestFocus();
            return false;
        };  
        if (c_dataInicial.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Informe a data inicial do procedimento!");
            c_dataInicial.requestFocus();
            return false;
        }        
        if (c_dataFinal.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Informe a data final do procedimento!");
            c_dataFinal.requestFocus();
            return false;
        } 
        if(cb_Responsavel.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados, verifique!");
            cb_Responsavel.requestFocus();
            return false;
        } 
        if(cb_Prontuario.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há prontuários cadastrados, verifique!");
            cb_Prontuario.requestFocus();
            return false;
        } 
        if(c_dataInicial.getDate().compareTo(c_dataFinal.getDate()) == 1){
            JOptionPane.showMessageDialog(null, "Data inicial não pode ser maior que a data final do procedimento!");
            c_dataInicial.requestFocus();
            return false;
        }
        return true;
    }

    private void limparCampos() {
        eIdProcedimento.setText(null);
        c_dataInicial.setDate(null);
        c_dataFinal.setDate(null);
        c_descricao.setText(null);
        c_observacao.setText(null);
        cb_Responsavel.setSelectedIndex(0);
        cb_Prontuario.setSelectedIndex(0);
        cb_Medicamento.setSelectedIndex(0);
        cb_Medicamento.setEnabled(true);
        cb_InserirMedicamento.setSelected(true);
    }
           
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProcedimentos().setVisible(true);
            }
        });
    }
    
    private void carregaComboResponsavel(int idResponsavel){        
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        List<Tabelas.Funcionario> funcList = new ArrayList<>();
        funcList = funcDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Responsavel.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Funcionario p : funcList) {
            comboModel.addElement(p);
            if(idResponsavel == p.getIdFuncionario()){
                cb_Responsavel.setSelectedItem(p);
            }
        }
    }
    
    private void carregaComboMedicamento(int idMedicamento){        
        MedicamentoDAO medDAO = new MedicamentoDAO();
        List<Tabelas.Medicamento> medList = new ArrayList<>();
        medList = medDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Medicamento.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Medicamento p : medList) {
            comboModel.addElement(p);
            if(idMedicamento == p.getIdMedicamento()){
                cb_Medicamento.setSelectedItem(p);
            }
        }
    }
    
    private void carregaComboProntuario(int idProntuario){        
        ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
        List<Tabelas.Prontuario> pronList = new ArrayList<>();
        pronList = prontuarioDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Prontuario.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Prontuario p : pronList) {
            comboModel.addElement(p);
            if(idProntuario == p.getIdProntuario()){
                    cb_Prontuario.setSelectedItem(p);
            }
        }
    }
    
    private void setsProcedimento(Procedimento procedimento){
        procedimento.setDescricao(c_descricao.getText());
        procedimento.setObservacao(c_observacao.getText());
        procedimento.setDataInicial(c_dataInicial.getDate()); 
        procedimento.setDataFinal(c_dataFinal.getDate());
        Funcionario func = (Funcionario) cb_Responsavel.getSelectedItem();
        procedimento.setIdFuncionario(func);        
        Prontuario pront = (Prontuario) cb_Prontuario.getSelectedItem();
        procedimento.setIdProntuario(pront);      
        if(cb_InserirMedicamento.isSelected()){
            Medicamento med = (Medicamento) cb_Medicamento.getSelectedItem();
            procedimento.setIdMedicamento(med);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_NovoMedicamento;
    private javax.swing.JButton b_consulta;
    private javax.swing.JButton b_incluir;
    private javax.swing.JButton btnLimpar;
    private com.toedter.calendar.JDateChooser c_dataFinal;
    private com.toedter.calendar.JDateChooser c_dataInicial;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JTextField c_observacao;
    private javax.swing.JCheckBox cb_InserirMedicamento;
    private javax.swing.JComboBox<String> cb_Medicamento;
    private javax.swing.JComboBox<String> cb_Prontuario;
    private javax.swing.JComboBox<String> cb_Responsavel;
    private javax.swing.JTextField eIdProcedimento;
    private javax.swing.JTextField t_Prontuario;
    private javax.swing.JTextField t_Responsavel;
    private javax.swing.JTextField t_dataFinal;
    private javax.swing.JTextField t_dataInicial;
    private javax.swing.JTextField t_descricao;
    private javax.swing.JTextField t_observacao;
    private javax.swing.JTextField t_observacao1;
    private javax.swing.JTextField t_titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
