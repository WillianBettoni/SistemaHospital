package Telas;

import DAO.MedicoDAO;
import DAO.ProntuarioDAO;
import Tabelas.Medico;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class TelaListarMedicos extends javax.swing.JFrame {

    private DefaultTableModel modeloMedico;

    public TelaListarMedicos() throws SQLException {
        this.modeloMedico = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_MedicosCadastrados.removeAll();
        tb_MedicosCadastrados.setModel(modeloMedico);
        modeloMedico.addColumn("CÓDIGO");
        modeloMedico.addColumn("NOME");
        modeloMedico.addColumn("CPF");
        modeloMedico.addColumn("ESPECIALIDADE");
        modeloMedico.addColumn("CRM");
        tb_MedicosCadastrados.getColumnModel().getColumn(0).setPreferredWidth(5);
        tb_MedicosCadastrados.getColumnModel().getColumn(1).setPreferredWidth(40);
        tb_MedicosCadastrados.getColumnModel().getColumn(2).setPreferredWidth(20);
        tb_MedicosCadastrados.getColumnModel().getColumn(3).setPreferredWidth(30);
        tb_MedicosCadastrados.getColumnModel().getColumn(3).setPreferredWidth(20);
        modeloMedico.setNumRows(0);
        popularTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_MedicosCadastrados = new javax.swing.JTable();
        t_MedicosListados = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_selecionar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        cb_selecao = new javax.swing.JComboBox<>();
        btnSelecionar = new javax.swing.JButton();
        c_selecionar = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_MedicosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_MedicosCadastrados);

        t_MedicosListados.setEditable(false);
        t_MedicosListados.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        t_MedicosListados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_MedicosListados.setText("Médicos");
        t_MedicosListados.setBorder(null);

        b_cancelar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        b_cancelar.setText("Cancelar");
        b_cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_selecionar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        b_selecionar.setText("Selecionar");
        b_selecionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_selecionarActionPerformed(evt);
            }
        });

        b_excluir.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        b_excluir.setText("Excluir");
        b_excluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_excluirActionPerformed(evt);
            }
        });

        cb_selecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));
        cb_selecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_selecaoItemStateChanged(evt);
            }
        });

        btnSelecionar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        c_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_selecionarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_selecao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(t_MedicosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_MedicosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_selecao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(btnSelecionar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimpar))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_selecionarActionPerformed(java.awt.event.ActionEvent evt) {
        MedicoDAO medicoDAO = new MedicoDAO();
        List<Tabelas.Medico> medList = new ArrayList<>();
        medList = medicoDAO.listar();

        int i = tb_MedicosCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um médico.");
        } else {
            for (Tabelas.Medico p : medList) {
                if (p.getIdMedico() == Integer.parseInt(tb_MedicosCadastrados.getValueAt(tb_MedicosCadastrados.getSelectedRow(), 0).toString())) {
                    TelaMedico telaMed = null;
                    telaMed = new TelaMedico(p);   
                    telaMed.setVisible(true);
                    dispose();
                }
            }
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        TelaMedico telaMed = new TelaMedico();
        telaMed.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        MedicoDAO medicoDAO = new MedicoDAO();
        List<Tabelas.Medico> medList = new ArrayList<>();
        medList = medicoDAO.listar();
        boolean excluiu = false;

        int i = tb_MedicosCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um médico para remover.");
        } else {
            for (Tabelas.Medico p : medList) {               
                if (p.getIdMedico() == Integer.parseInt(tb_MedicosCadastrados.getValueAt(tb_MedicosCadastrados.getSelectedRow(), 0).toString())) {
                    if(validarExclusao(p)){
                        medicoDAO.excluir(p);
                        JOptionPane.showMessageDialog(null, "Médico removido com sucesso.");
                        excluiu = true;
                    } else {                               
                        excluiu = false;
                        break;               
                    }    
                }                                        
            }
            if(excluiu){
                TelaListarMedicos medico = null;
                try {
                    medico = new TelaListarMedicos();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarMedicos.class.getName()).log(Level.SEVERE, null, ex);
                }
                medico.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            MedicoDAO pacDAO = new MedicoDAO();
            popularTabelaSelecionar(pacDAO.RetornarMedicoSelec(c_selecionar.getText(), cb_selecao.getSelectedIndex()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void cb_selecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_selecaoItemStateChanged
        if(cb_selecao.getSelectedIndex()==1){
            c_selecionar.setFormatterFactory(null);  
            MaskFormatter format;  
            try {
                format = new MaskFormatter("###.###.###-##");
                c_selecionar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(format));  
                c_selecionar.setValue(null); 
            } catch (ParseException ex) {
                Logger.getLogger(TelaListarMedicos.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }else{
            c_selecionar.setFormatterFactory(null);
            c_selecionar.setText("");
        }
    }//GEN-LAST:event_cb_selecaoItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        if(cb_selecao.getSelectedIndex()==1){
            c_selecionar.setValue(null);
        }else{
            c_selecionar.setFormatterFactory(null);
            c_selecionar.setText("");
        }
        c_selecionar.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void c_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_selecionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_selecionarActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaListarMedicos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarMedicos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void popularTabela() throws SQLException {
        modeloMedico.setNumRows(0);
        MedicoDAO medDAO = new MedicoDAO();
        List<Tabelas.Medico> medList = new ArrayList<>();
        medList = medDAO.listar();

        for (Tabelas.Medico p : medList) {
            modeloMedico.addRow(new Object[]{p.getIdMedico(), p.getNome(), p.getNumCPF(), p.getEspecialidade(), p.getCRM()});
        }
    }
    
    public void popularTabelaSelecionar(List lista) throws SQLException {
        modeloMedico.setNumRows(0);
        List<Tabelas.Medico> medList = new ArrayList<>();
        medList = lista;

        for (Tabelas.Medico p : medList) {
            modeloMedico.addRow(new Object[]{p.getIdMedico(), p.getNome(), p.getNumCPF(), p.getEspecialidade(), p.getCRM()});
        }
    }
    
    private boolean validarExclusao(Medico medico){
        ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
        List<Tabelas.Prontuario> pronList = new ArrayList<>();
        pronList = prontuarioDAO.listar();

        for (Tabelas.Prontuario p : pronList) {
            if (p.getIdMedico().getIdMedico() == Integer.parseInt(tb_MedicosCadastrados.getValueAt(tb_MedicosCadastrados.getSelectedRow(), 0).toString())) {
                JOptionPane.showMessageDialog(null, "Esse médico está vinculado a um prontuário, verifique!");
                return false;
            }
        }   
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_excluir;
    private javax.swing.JButton b_selecionar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFormattedTextField c_selecionar;
    private javax.swing.JComboBox<String> cb_selecao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_MedicosListados;
    private javax.swing.JTable tb_MedicosCadastrados;
    // End of variables declaration//GEN-END:variables
}
