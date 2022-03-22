package Telas;

import DAO.TipoQuartoDAO;
import Tabelas.TipoQuarto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaTipoQuarto extends javax.swing.JFrame {
   
    public TelaTipoQuarto() {
        initComponents();
        eIdTipo.setVisible(false);
        eNome.requestFocus();
    }
    
    public TelaTipoQuarto(TipoQuarto tipoQuarto) {
        initComponents();
        eNome.setText(tipoQuarto.getNome());
        eIdTipo.setText(String.valueOf(tipoQuarto.getIdTipoQuarto()));
        eIdTipo.setVisible(false);
        eNome.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lbTipoFuncionario = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        eNome = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        eIdTipo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        lbTipoFuncionario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbTipoFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTipoFuncionario.setText("Tipo do Quarto");
        lbTipoFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        eNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eNomeKeyTyped(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        eIdTipo.setEditable(false);

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
                        .addComponent(lbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eIdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoFuncionario)
                    .addComponent(eIdTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(eNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(eNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um tipo de quarto!");
        }else{        
            TipoQuarto tipoQuarto = new TipoQuarto();
            tipoQuarto.setNome(eNome.getText());

            TipoQuartoDAO tipoFuncDAO = new TipoQuartoDAO();
            
            if ((eIdTipo.getText().isEmpty()) || (Integer.parseInt(eIdTipo.getText()) == 0)) {
                if(!validarTipoQuarto()){        
                    tipoFuncDAO.incluir(tipoQuarto);
                }else{
                    JOptionPane.showMessageDialog(null, "Já existe tipo de quarto gravado com esse nome, verifique!");
                }
            }else{
                tipoQuarto.setIdTipoQuarto(Integer.parseInt(eIdTipo.getText()));
                tipoFuncDAO.update(tipoQuarto);
            }
            eIdTipo.setText("");
            eNome.setText("");
        }      
        eNome.requestFocus();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        eNome.setText("");
        eIdTipo.setText("");
        eNome.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        TelaListarTipoQuarto tipo = null;
        try {
            tipo = new TelaListarTipoQuarto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarTipoQuarto.class.getName()).log(Level.SEVERE, null, ex);
        }
        tipo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void eNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eNomeKeyTyped
        int numeroMaximo = 44;
        if (eNome.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_eNomeKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipoQuarto().setVisible(true);
            }
        });
    }
    
    private boolean validarTipoQuarto() {
        TipoQuartoDAO tipoDAO = new TipoQuartoDAO();
        List<Tabelas.TipoQuarto> tipoList = new ArrayList<>();
        tipoList = tipoDAO.listar();
        boolean existente = false;

        for (Tabelas.TipoQuarto p : tipoList) {
            if (this.eNome.getText().equals(p.getNome())) {
                if (!this.eIdTipo.getText().equals(Integer.toString(p.getIdTipoQuarto()))) {
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
    private javax.swing.JTextField eIdTipo;
    private javax.swing.JTextField eNome;
    private javax.swing.JLabel lbTipoFuncionario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
