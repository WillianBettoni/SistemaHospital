package Telas;

import DAO.DiagnosticoDAO;
import DAO.DoencaDAO;
import DAO.ProntuarioDAO;
import Tabelas.Diagnostico;
import Tabelas.Doenca;
import Tabelas.Prontuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaDiagnostico extends javax.swing.JFrame {

    public TelaDiagnostico() {
        initComponents();
        carregaComboDoenca(0);
        carregaComboProntuario(0);
        eIdDiagnostico.setVisible(false);
        cb_Doenca.requestFocus();
    }

    public TelaDiagnostico(Diagnostico diagnostico) {
        initComponents();
        eIdDiagnostico.setText(String.valueOf(diagnostico.getIdDiagnostico()));
        eIdDiagnostico.setVisible(false);
        cb_Doenca.requestFocus();
        carregaComboProntuario(diagnostico.getIdProntuario().getIdProntuario());
        carregaComboDoenca(diagnostico.getIdDoenca().getIdDoenca());
        switch (diagnostico.getStatus()) {
            case "C":
                cb_Status.setSelectedIndex(0);
                break;
            case "S":
                cb_Status.setSelectedIndex(1);
                break;
            case "A":
                cb_Status.setSelectedIndex(2);
                break;
            case "N":
                cb_Status.setSelectedIndex(3);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        t_titulo = new javax.swing.JTextField();
        b_incluir = new javax.swing.JButton();
        b_consulta = new javax.swing.JButton();
        eIdDiagnostico = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        cb_Doenca = new javax.swing.JComboBox<>();
        t_Doenca = new javax.swing.JTextField();
        b_NovaDoenca = new javax.swing.JButton();
        cb_Prontuario = new javax.swing.JComboBox<>();
        t_Prontuario = new javax.swing.JTextField();
        cb_Status = new javax.swing.JComboBox<>();
        t_Status = new javax.swing.JTextField();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        t_titulo.setEditable(false);
        t_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        t_titulo.setText("DIAGNÓSTICO");
        t_titulo.setBorder(null);

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

        eIdDiagnostico.setEnabled(false);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        cb_Doenca.setNextFocusableComponent(cb_Prontuario);
        cb_Doenca.setPreferredSize(new java.awt.Dimension(31, 24));

        t_Doenca.setEditable(false);
        t_Doenca.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Doenca.setText("Doença");
        t_Doenca.setBorder(null);

        b_NovaDoenca.setText("Nova Doença");
        b_NovaDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_NovaDoencaActionPerformed(evt);
            }
        });

        cb_Prontuario.setNextFocusableComponent(cb_Status);
        cb_Prontuario.setPreferredSize(new java.awt.Dimension(31, 24));

        t_Prontuario.setEditable(false);
        t_Prontuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Prontuario.setText("Prontuário");
        t_Prontuario.setBorder(null);

        cb_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confirmado", "Suspeito", "Em avaliação", "Não confirmado" }));
        cb_Status.setNextFocusableComponent(b_incluir);
        cb_Status.setPreferredSize(new java.awt.Dimension(31, 24));

        t_Status.setEditable(false);
        t_Status.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Status.setText("Status");
        t_Status.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_NovaDoenca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(eIdDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(t_Prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_Prontuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(381, 381, 381)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eIdDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Prontuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(t_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_incluir)
                    .addComponent(b_consulta)
                    .addComponent(btnLimpar)
                    .addComponent(b_NovaDoenca))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_incluirActionPerformed
        Diagnostico diagnostico = new Diagnostico();
        if (fazVerificacoes()) {
            setsProcedimento(diagnostico);
            if ((eIdDiagnostico.getText().isEmpty()) || (Integer.parseInt(eIdDiagnostico.getText()) == 0)) {
                DiagnosticoDAO diagDAO = new DiagnosticoDAO();
                diagDAO.incluir(diagnostico);
                limparCampos();
            } else {
                DiagnosticoDAO alterar = new DiagnosticoDAO();
                diagnostico.setIdDiagnostico(Integer.parseInt(eIdDiagnostico.getText()));
                alterar.update(diagnostico);
                limparCampos();
            }
        }
    }//GEN-LAST:event_b_incluirActionPerformed

    private void b_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_consultaActionPerformed
        TelaListarDiagnosticos diag = null;
        try {
            diag = new TelaListarDiagnosticos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarDiagnosticos.class.getName()).log(Level.SEVERE, null, ex);
        }
        diag.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_consultaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        cb_Doenca.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void b_NovaDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_NovaDoencaActionPerformed
        Diagnostico diagnostico = new Diagnostico();   
        if ((eIdDiagnostico.getText() != null) && (!eIdDiagnostico.getText().isEmpty()))
            diagnostico.setIdDiagnostico(Integer.parseInt(eIdDiagnostico.getText()));
        setsProcedimento(diagnostico);
        TelaDoencas doenca = new TelaDoencas(true, diagnostico); 
        doenca.setVisible(true); 
        dispose();
    }//GEN-LAST:event_b_NovaDoencaActionPerformed

    private boolean fazVerificacoes() {
        if (cb_Doenca.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Não há doenças cadastradas, verifique!");
            cb_Doenca.requestFocus();
            return false;
        }
        if (cb_Prontuario.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Não há prontuários cadastrados, verifique!");
            cb_Prontuario.requestFocus();
            return false;
        }
        return true;
    }

    private void limparCampos() {
        eIdDiagnostico.setText(null);
        cb_Prontuario.setSelectedIndex(0);
        cb_Doenca.setSelectedIndex(0);
        cb_Status.setSelectedIndex(0);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDiagnostico().setVisible(true);
            }
        });
    }

    private void carregaComboDoenca(int idDoenca) {
        DoencaDAO doencaDAO = new DoencaDAO();
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = doencaDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Doenca.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Doenca p : doencaList) {
            comboModel.addElement(p);
            if (idDoenca == p.getIdDoenca()) {
                cb_Doenca.setSelectedItem(p);
            }
        }
    }

    private void carregaComboProntuario(int idProntuario) {
        ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
        List<Tabelas.Prontuario> pronList = new ArrayList<>();
        pronList = prontuarioDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Prontuario.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Prontuario p : pronList) {
            comboModel.addElement(p);
            if (idProntuario == p.getIdProntuario()) {
                cb_Prontuario.setSelectedItem(p);
            }
        }
    }

    private void setsProcedimento(Diagnostico diagnostico) {
        Doenca doenca = (Doenca) cb_Doenca.getSelectedItem();
        diagnostico.setIdDoenca(doenca);
        Prontuario pront = (Prontuario) cb_Prontuario.getSelectedItem();
        diagnostico.setIdProntuario(pront);

        String status = "";
        switch (cb_Status.getSelectedIndex()) {
            case 0:
                status = "C";
                break;
            case 1:
                status = "S";
                break;
            case 2:
                status = "A";
                break;
            case 3:
                status = "N";
                break;
        }
        diagnostico.setStatus(status);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_NovaDoenca;
    private javax.swing.JButton b_consulta;
    private javax.swing.JButton b_incluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cb_Doenca;
    private javax.swing.JComboBox<String> cb_Prontuario;
    private javax.swing.JComboBox<String> cb_Status;
    private javax.swing.JTextField eIdDiagnostico;
    private javax.swing.JTextField t_Doenca;
    private javax.swing.JTextField t_Prontuario;
    private javax.swing.JTextField t_Status;
    private javax.swing.JTextField t_titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
