package Telas;

import DAO.LeitoDAO;
import DAO.QuartoDAO;
import Tabelas.Quarto;
import Tabelas.Leito;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaLeito extends javax.swing.JFrame {

    public TelaLeito() {
        initComponents();
        carregaCombo(0);
        eIdLeito.setVisible(false);
        c_descricao.requestFocus();
    }
    
    public TelaLeito(Leito leito) {
        initComponents();
        c_descricao.setText(leito.getDescricao());
        eIdLeito.setText(String.valueOf(leito.getIdLeito()));
        eIdLeito.setVisible(false);
        c_descricao.requestFocus();       
        carregaCombo(leito.getIdQuarto().getIdQuarto());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        t_titulo = new javax.swing.JTextField();
        t_descricao = new javax.swing.JTextField();
        t_Quarto = new javax.swing.JTextField();
        c_descricao = new javax.swing.JTextField();
        cb_Quarto = new javax.swing.JComboBox<>();
        b_incluir = new javax.swing.JButton();
        b_consulta = new javax.swing.JButton();
        eIdLeito = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        t_titulo.setEditable(false);
        t_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        t_titulo.setText("LEITOS");
        t_titulo.setBorder(null);

        t_descricao.setEditable(false);
        t_descricao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_descricao.setText("Descrição");
        t_descricao.setBorder(null);

        t_Quarto.setEditable(false);
        t_Quarto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_Quarto.setText("Quarto");
        t_Quarto.setBorder(null);

        c_descricao.setMinimumSize(new java.awt.Dimension(6, 24));
        c_descricao.setPreferredSize(new java.awt.Dimension(6, 24));
        c_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_descricaoKeyTyped(evt);
            }
        });

        cb_Quarto.setMinimumSize(new java.awt.Dimension(31, 24));
        cb_Quarto.setPreferredSize(new java.awt.Dimension(31, 24));

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

        eIdLeito.setEnabled(false);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(b_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cb_Quarto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t_Quarto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210)
                .addComponent(eIdLeito, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eIdLeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_Quarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Quarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_consulta)
                    .addComponent(btnLimpar)
                    .addComponent(b_incluir))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_incluirActionPerformed
        Leito leito = new Leito();
        if (fazVerificacoes()) {
            leito.setDescricao(c_descricao.getText());
            Quarto quarto = (Quarto) cb_Quarto.getSelectedItem();
            leito.setIdQuarto(quarto);
            if ((eIdLeito.getText().isEmpty()) || (Integer.parseInt(eIdLeito.getText()) == 0)) {
                LeitoDAO leitoDAO = new LeitoDAO();
                leitoDAO.incluir(leito);
                limparCampos();
            } else {
                LeitoDAO alterar = new LeitoDAO();
                leito.setIdLeito(Integer.parseInt(eIdLeito.getText()));
                alterar.update(leito);
                limparCampos();
            }
        }       
    }//GEN-LAST:event_b_incluirActionPerformed

    private void b_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_consultaActionPerformed
        TelaListarLeitos leitos = null;
        try {
            leitos = new TelaListarLeitos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        leitos.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_consultaActionPerformed

    private void c_descricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_descricaoKeyTyped
        int numeroMaximo = 44;
        if (c_descricao.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_c_descricaoKeyTyped

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        c_descricao.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private boolean fazVerificacoes() {
        if (c_descricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a descrição do leito!");
            c_descricao.requestFocus();
            return false;
        };
        if(cb_Quarto.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há quartos cadastrados, verifique!");
            cb_Quarto.requestFocus();
            return false;
        }
        return true;
    }

    private void limparCampos() {
        eIdLeito.setText(null);
        c_descricao.setText(null);
        cb_Quarto.setSelectedIndex(0);
    }
           
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLeito().setVisible(true);
            }
        });
    }
    
    private void carregaCombo(int idQuarto){        
        QuartoDAO quartoDAO = new QuartoDAO();
        List<Tabelas.Quarto> tipoList = new ArrayList<>();
        tipoList = quartoDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_Quarto.getModel();
        comboModel.removeAllElements();
        for (Tabelas.Quarto p : tipoList) {
            comboModel.addElement(p);
            if(idQuarto == p.getIdQuarto()){
                cb_Quarto.setSelectedItem(p);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_consulta;
    private javax.swing.JButton b_incluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JComboBox<String> cb_Quarto;
    private javax.swing.JTextField eIdLeito;
    private javax.swing.JTextField t_Quarto;
    private javax.swing.JTextField t_descricao;
    private javax.swing.JTextField t_titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
