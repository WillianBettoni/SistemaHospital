package Telas;

import DAO.TipoFuncionarioDAO;
import Tabelas.TipoFuncionario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaTipoFuncionario extends javax.swing.JFrame {
   
    public TelaTipoFuncionario() {
        initComponents();
        eIdTipo.setVisible(false);
        eDescricao.requestFocus();
    }
    
    public TelaTipoFuncionario(TipoFuncionario tipoFunc) {
        initComponents();
        eDescricao.setText(tipoFunc.getDescricao());
        eIdTipo.setText(String.valueOf(tipoFunc.getIdTipoFuncionario()));
        eIdTipo.setVisible(false);
        eDescricao.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        lbTipoFuncionario = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        eDescricao = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        eIdTipo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        lbTipoFuncionario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbTipoFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTipoFuncionario.setText("Tipo do Funcionário");
        lbTipoFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        eDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eDescricaoKeyTyped(evt);
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
                    .addComponent(eDescricao)
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
                .addComponent(eDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(eDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um tipo de funcionário!");
        }else{        
            TipoFuncionario tipoFunc = new TipoFuncionario();
            tipoFunc.setDescricao(eDescricao.getText());

            TipoFuncionarioDAO tipoFuncDAO = new TipoFuncionarioDAO();
            
            if ((eIdTipo.getText().isEmpty()) || (Integer.parseInt(eIdTipo.getText()) == 0)) {
                if(!validarTipoFuncionario()){        
                    tipoFuncDAO.incluir(tipoFunc);
                }else{
                    JOptionPane.showMessageDialog(null, "Já existe tipo de funcionário gravado com essa descrição, verifique!");
                }
            }else{
                tipoFunc.setIdTipoFuncionario(Integer.parseInt(eIdTipo.getText()));
                tipoFuncDAO.update(tipoFunc);
            }
            eIdTipo.setText("");
            eDescricao.setText("");
        }      
        eDescricao.requestFocus();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        eDescricao.setText("");
        eIdTipo.setText("");
        eDescricao.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        TelaListarTipoFuncionario tipo = null;
        try {
            tipo = new TelaListarTipoFuncionario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarTipoFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        tipo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void eDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eDescricaoKeyTyped
        int numeroMaximo = 44;
        if (eDescricao.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_eDescricaoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTipoFuncionario().setVisible(true);
            }
        });
    }
    
    private boolean validarTipoFuncionario() {
        TipoFuncionarioDAO tipoFuncDAO = new TipoFuncionarioDAO();
        List<Tabelas.TipoFuncionario> tipoList = new ArrayList<>();
        tipoList = tipoFuncDAO.listar();
        boolean existente = false;

        for (Tabelas.TipoFuncionario p : tipoList) {
            if (this.eDescricao.getText().equals(p.getDescricao())) {
                if (!this.eIdTipo.getText().equals(Integer.toString(p.getIdTipoFuncionario()))) {
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
    private javax.swing.JTextField eDescricao;
    private javax.swing.JTextField eIdTipo;
    private javax.swing.JLabel lbTipoFuncionario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
