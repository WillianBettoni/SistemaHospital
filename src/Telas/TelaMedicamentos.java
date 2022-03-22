package Telas;

import Tabelas.Medicamento;
import DAO.MedicamentoDAO;
import Tabelas.Procedimento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaMedicamentos extends javax.swing.JFrame {

    boolean repaintTelaProc;
    Procedimento procedimento;
    
    public TelaMedicamentos() {
        initComponents();        
        eIDMedicamento.setVisible(false);
        edNomeMedicamento.requestFocus();  
        this.repaintTelaProc = false;
    }
    
    public TelaMedicamentos(Medicamento med, Boolean repaintTelaProc, Procedimento procedimento) {
        initComponents();  
        edNomeMedicamento.setText(med.getNome());
        eIDMedicamento.setText(String.valueOf(med.getIdMedicamento()));
        eIDMedicamento.setVisible(false);
        edNomeMedicamento.requestFocus();  
        this.repaintTelaProc = repaintTelaProc;
        this.procedimento = procedimento;
    }
    
    public TelaMedicamentos(Boolean repaintTelaProc, Procedimento procedimento) {
        initComponents();  
        eIDMedicamento.setVisible(false);
        edNomeMedicamento.requestFocus();  
        this.repaintTelaProc = repaintTelaProc;
        this.procedimento = procedimento;
    }
    
    public TelaMedicamentos(Medicamento med) {
        initComponents();
        edNomeMedicamento.setText(med.getNome());
        eIDMedicamento.setText(String.valueOf(med.getIdMedicamento()));
        eIDMedicamento.setVisible(false);
        edNomeMedicamento.requestFocus();
        repaintTelaProc = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        edNomeMedicamento = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        lbNomeMedicamento = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        eIDMedicamento = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        edNomeMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edNomeMedicamentoKeyTyped(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lbNomeMedicamento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbNomeMedicamento.setText("Nome do Medicamento");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        eIDMedicamento.setEditable(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edNomeMedicamento)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbNomeMedicamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eIDMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeMedicamento)
                    .addComponent(eIDMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edNomeMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnLimpar)
                    .addComponent(btnConsultar))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if(edNomeMedicamento.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um medicamento!");
        }else{    
            Medicamento medicamento = new Medicamento();
            medicamento.setNome(edNomeMedicamento.getText());

            MedicamentoDAO medDAO = new MedicamentoDAO();
            if ((eIDMedicamento.getText().isEmpty()) || (Integer.parseInt(eIDMedicamento.getText()) == 0)) {
                if(!validarMedicamento()){
                    medDAO.incluir(medicamento);
                }else{
                    JOptionPane.showMessageDialog(null, "Já existe medicamento gravado com esse nome, verifique!");
                }
            }else{
                medicamento.setIdMedicamento(Integer.parseInt(eIDMedicamento.getText()));
                medDAO.update(medicamento);
            }
            eIDMedicamento.setText("");
            edNomeMedicamento.setText("");
        }
        edNomeMedicamento.requestFocus();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edNomeMedicamento.setText("");
        eIDMedicamento.setText("");
        edNomeMedicamento.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        TelaListarMedicamentos med = null;
        try {
            med = new TelaListarMedicamentos(repaintTelaProc, procedimento);
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarTipoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        med.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void edNomeMedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edNomeMedicamentoKeyTyped
        int numeroMaximo = 179;
        if (edNomeMedicamento.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_edNomeMedicamentoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(repaintTelaProc){
            TelaProcedimentos telaProc = new TelaProcedimentos(procedimento);
            telaProc.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedicamentos().setVisible(true);
            }
        });
    }
    
    private boolean validarMedicamento() {
        MedicamentoDAO medDAO = new MedicamentoDAO();
        List<Tabelas.Medicamento> medList = new ArrayList<>();
        medList = medDAO.listar();
        boolean existente = false;

        for (Tabelas.Medicamento p : medList) {
            if (this.edNomeMedicamento.getText().equals(p.getNome())) {
                if (!this.eIDMedicamento.getText().equals(Integer.toString(p.getIdMedicamento()))) {
                    existente = true;
                    return existente;
                }
            }
        }
        return existente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField eIDMedicamento;
    private javax.swing.JTextField edNomeMedicamento;
    private javax.swing.JLabel lbNomeMedicamento;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
