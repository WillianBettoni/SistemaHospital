package Telas;

import DAO.DoencaDAO;
import Tabelas.Diagnostico;
import Tabelas.Doenca;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaDoencas extends javax.swing.JFrame {
   
    boolean repaintTelaDiag;
    Diagnostico diagnostico;
    
    public TelaDoencas() {
        initComponents();
        eIdDoenca.setVisible(false);
        edNomeDoenca.requestFocus();
        this.repaintTelaDiag = false;
    }
    
    public TelaDoencas(Doenca doenca) {
        initComponents();
        edNomeDoenca.setText(doenca.getNome());
        eIdDoenca.setText(String.valueOf(doenca.getIdDoenca()));
        eIdDoenca.setVisible(false);
        edNomeDoenca.requestFocus();
        this.repaintTelaDiag = false;
    }
    
    public TelaDoencas(Boolean repaintTelaDiag, Diagnostico diagnostico) {
        initComponents();  
        eIdDoenca.setVisible(false);
        edNomeDoenca.requestFocus();  
        this.repaintTelaDiag = repaintTelaDiag;
        this.diagnostico = diagnostico;
    }
    
    public TelaDoencas(Doenca doenca, Boolean repaintTelaDiag, Diagnostico diagnostico) {
        initComponents();  
        edNomeDoenca.setText(doenca.getNome());
        eIdDoenca.setText(String.valueOf(doenca.getIdDoenca()));
        eIdDoenca.setVisible(false);
        edNomeDoenca.requestFocus();  
        this.repaintTelaDiag = repaintTelaDiag;
        this.diagnostico = diagnostico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lbDoenca = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        edNomeDoenca = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        eIdDoenca = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbDoenca.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbDoenca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDoenca.setText("Nome da Doença");
        lbDoenca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        edNomeDoenca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edNomeDoencaKeyTyped(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        eIdDoenca.setEditable(false);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar))
                    .addComponent(edNomeDoenca)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eIdDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDoenca)
                    .addComponent(eIdDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edNomeDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnLimpar)
                    .addComponent(btnConsultar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if(edNomeDoenca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite uma doença!");
        }else{        
            Doenca doenca = new Doenca();
            doenca.setNome(edNomeDoenca.getText());

            DoencaDAO doencaDAO = new DoencaDAO();
            if ((eIdDoenca.getText().isEmpty()) || (Integer.parseInt(eIdDoenca.getText()) == 0)) {
                if(!validarDoenca()){        
                    doencaDAO.incluir(doenca);
                }else{
                    JOptionPane.showMessageDialog(null, "Já existe doença gravada com esse nome, verifique!");
                }
            }else{
                doenca.setIdDoenca(Integer.parseInt(eIdDoenca.getText()));
                doencaDAO.update(doenca);
            }
            eIdDoenca.setText("");
            edNomeDoenca.setText("");
        }      
        edNomeDoenca.requestFocus();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edNomeDoenca.setText("");
        eIdDoenca.setText("");
        edNomeDoenca.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        TelaListarDoencas doencas = null;
        try {
            doencas = new TelaListarDoencas();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarTipoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        doencas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void edNomeDoencaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edNomeDoencaKeyTyped
        int numeroMaximo = 44;
        if (edNomeDoenca.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_edNomeDoencaKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(repaintTelaDiag){
            TelaDiagnostico telaDiag = new TelaDiagnostico(diagnostico);
            telaDiag.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoencas().setVisible(true);
            }
        });
    }
    
    private boolean validarDoenca() {
        DoencaDAO doencaDAO = new DoencaDAO();
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = doencaDAO.listar();
        boolean existente = false;

        for (Tabelas.Doenca p : doencaList) {
            if (this.edNomeDoenca.getText().equals(p.getNome())) {
                if (!this.eIdDoenca.getText().equals(Integer.toString(p.getIdDoenca()))) {
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
    private javax.swing.JTextField eIdDoenca;
    private javax.swing.JTextField edNomeDoenca;
    private javax.swing.JLabel lbDoenca;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
