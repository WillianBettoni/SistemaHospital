package Telas;

import DAO.LeitoDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import DAO.ProntuarioDAO;
import Tabelas.Leito;
import Tabelas.Medico;
import Tabelas.Paciente;
import Tabelas.Prontuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaProntuarios extends javax.swing.JFrame {

    public TelaProntuarios() {
        initComponents();
        carregaComboLeitos(0);
        carregaComboMedicos(0);
        carregaComboPaciente(0);
        eIdProntuario.setVisible(false);
        c_dataEntrada.requestFocus();
    }
    
    public TelaProntuarios(Prontuario prontuario) {
        initComponents();
        c_dataEntrada.setDate(prontuario.getDataEntrada());
        c_dataAlta.setDate(prontuario.getDataAlta());
        eIdProntuario.setText(String.valueOf(prontuario.getIdProntuario()));
        eIdProntuario.setVisible(false);
        c_dataEntrada.requestFocus();               
        carregaComboMedicos(prontuario.getIdMedico().getIdMedico());
        carregaComboLeitos(prontuario.getIdLeito().getIdLeito());
        carregaComboPaciente(prontuario.getIdPaciente().getIdPaciente());      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        t_titulo = new javax.swing.JTextField();
        t_dataEntrada = new javax.swing.JTextField();
        t_Medico = new javax.swing.JTextField();
        cb_Medico = new javax.swing.JComboBox<>();
        b_incluir = new javax.swing.JButton();
        b_consulta = new javax.swing.JButton();
        eIdProntuario = new javax.swing.JTextField();
        c_dataEntrada = new com.toedter.calendar.JDateChooser();
        btnLimpar = new javax.swing.JButton();
        c_dataAlta = new com.toedter.calendar.JDateChooser();
        t_dataAlta = new javax.swing.JTextField();
        cb_Leito = new javax.swing.JComboBox<>();
        t_Leito = new javax.swing.JTextField();
        cb_Paciente = new javax.swing.JComboBox<>();
        t_Paciente = new javax.swing.JTextField();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        t_titulo.setEditable(false);
        t_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        t_titulo.setText("PRONTUÁRIO");
        t_titulo.setBorder(null);

        t_dataEntrada.setEditable(false);
        t_dataEntrada.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_dataEntrada.setText("Data Entrada");
        t_dataEntrada.setBorder(null);

        t_Medico.setEditable(false);
        t_Medico.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Medico.setText("Médico");
        t_Medico.setBorder(null);

        cb_Medico.setNextFocusableComponent(cb_Leito);
        cb_Medico.setPreferredSize(new java.awt.Dimension(31, 24));

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

        eIdProntuario.setEnabled(false);

        c_dataEntrada.setNextFocusableComponent(c_dataAlta);
        c_dataEntrada.setPreferredSize(new java.awt.Dimension(95, 24));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        c_dataAlta.setNextFocusableComponent(cb_Medico);
        c_dataAlta.setPreferredSize(new java.awt.Dimension(95, 24));

        t_dataAlta.setEditable(false);
        t_dataAlta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_dataAlta.setText("Data Alta");
        t_dataAlta.setBorder(null);

        cb_Leito.setNextFocusableComponent(cb_Paciente);
        cb_Leito.setPreferredSize(new java.awt.Dimension(31, 24));

        t_Leito.setEditable(false);
        t_Leito.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Leito.setText("Leito");
        t_Leito.setBorder(null);

        cb_Paciente.setNextFocusableComponent(b_incluir);
        cb_Paciente.setPreferredSize(new java.awt.Dimension(31, 24));

        t_Paciente.setEditable(false);
        t_Paciente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Paciente.setText("Paciente");
        t_Paciente.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(t_dataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(t_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(c_dataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_Medico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                                .addComponent(b_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)
                        .addComponent(eIdProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_Leito, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Leito, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_Paciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eIdProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t_dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(t_dataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c_dataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_dataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cb_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Leito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Leito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_incluir)
                    .addComponent(b_consulta)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_incluirActionPerformed
        Prontuario prontuario = new Prontuario();        
        if (fazVerificacoes()) {
            setsProntuario(prontuario);
            if ((eIdProntuario.getText().isEmpty()) || (Integer.parseInt(eIdProntuario.getText()) == 0)) {
                ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
                prontuarioDAO.incluir(prontuario);
                limparCampos();
            } else {
                ProntuarioDAO alterar = new ProntuarioDAO();
                prontuario.setIdProntuario(Integer.parseInt(eIdProntuario.getText()));
                alterar.update(prontuario);
                limparCampos();
            }
        }
    }//GEN-LAST:event_b_incluirActionPerformed

    private void b_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_consultaActionPerformed
        TelaListarProntuarios prontuario = null;
        try {
            prontuario = new TelaListarProntuarios();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarProntuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        prontuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_consultaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        c_dataEntrada.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private boolean fazVerificacoes() {
        if (c_dataEntrada.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Informe a data de entrada!");
            c_dataEntrada.requestFocus();
            return false;
        }        
        if(cb_Medico.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há médicos cadastrados, verifique!");
            cb_Medico.requestFocus();
            return false;
        } 
        if(cb_Leito.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há leitos cadastrados, verifique!");
            cb_Leito.requestFocus();
            return false;
        } 
        if(cb_Paciente.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há pacientes cadastrados, verifique!");
            cb_Paciente.requestFocus();
            return false;
        }  
        if(c_dataAlta.getDate() != null){
            if(c_dataEntrada.getDate().compareTo(c_dataAlta.getDate()) == 1){
                JOptionPane.showMessageDialog(null, "Data de entrada não pode ser maior que a data de alta do paciente!");
                c_dataEntrada.requestFocus();
                return false;
            }
        }
        return true;
    }

    private void limparCampos() {
        eIdProntuario.setText(null);
        c_dataEntrada.setDate(null);
        c_dataAlta.setDate(null);
        cb_Medico.setSelectedIndex(0);
        cb_Leito.setSelectedIndex(0);
        cb_Paciente.setSelectedIndex(0);
    }
           
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProntuarios().setVisible(true);
            }
        });
    }
    
    private void carregaComboMedicos(int idMedico){        
        MedicoDAO medDAO = new MedicoDAO();
        List<Tabelas.Medico> medList = new ArrayList<>();
        medList = medDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Medico.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Medico p : medList) {
            comboModel.addElement(p);
            if(idMedico == p.getIdMedico()){
                cb_Medico.setSelectedItem(p);
            }
        }
    }
    
    private void carregaComboLeitos(int idLeito){        
        LeitoDAO leitoDAO = new LeitoDAO();
        List<Tabelas.Leito> leitoList = new ArrayList<>();
        leitoList = leitoDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Leito.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Leito p : leitoList) {
            comboModel.addElement(p);
            if(idLeito == p.getIdLeito()){
                cb_Leito.setSelectedItem(p);
            }
        }
    }
    
    private void carregaComboPaciente(int idPaciente){        
        PacienteDAO pacienteDAO = new PacienteDAO();
        List<Tabelas.Paciente> pacList = new ArrayList<>();
        pacList = pacienteDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Paciente.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Paciente p : pacList) {
            comboModel.addElement(p);
            if(idPaciente == p.getIdPaciente()){
                cb_Paciente.setSelectedItem(p);
            }
        }
    }
    
    private void setsProntuario(Prontuario prontuario){
        prontuario.setDataEntrada(c_dataEntrada.getDate()); 
        if(c_dataAlta.getDate() != null)
            prontuario.setDataAlta(c_dataAlta.getDate());        
        Medico medico = (Medico) cb_Medico.getSelectedItem();
        prontuario.setIdMedico(medico);        
        Leito leito = (Leito) cb_Leito.getSelectedItem();
        prontuario.setIdLeito(leito);       
        Paciente paciente = (Paciente) cb_Paciente.getSelectedItem();
        prontuario.setIdPaciente(paciente);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_consulta;
    private javax.swing.JButton b_incluir;
    private javax.swing.JButton btnLimpar;
    private com.toedter.calendar.JDateChooser c_dataAlta;
    private com.toedter.calendar.JDateChooser c_dataEntrada;
    private javax.swing.JComboBox<String> cb_Leito;
    private javax.swing.JComboBox<String> cb_Medico;
    private javax.swing.JComboBox<String> cb_Paciente;
    private javax.swing.JTextField eIdProntuario;
    private javax.swing.JTextField t_Leito;
    private javax.swing.JTextField t_Medico;
    private javax.swing.JTextField t_Paciente;
    private javax.swing.JTextField t_dataAlta;
    private javax.swing.JTextField t_dataEntrada;
    private javax.swing.JTextField t_titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
