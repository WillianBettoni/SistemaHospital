package Telas;

import DAO.QuartoDAO;
import DAO.TipoQuartoDAO;
import Tabelas.Quarto;
import Tabelas.TipoQuarto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaQuarto extends javax.swing.JFrame {

    public TelaQuarto() {
        initComponents();
        carregaCombo(0);
        eIdQuarto.setVisible(false);
        c_descricao.requestFocus();
    }
    
    public TelaQuarto(Quarto quarto) {
        initComponents();
        c_descricao.setText(quarto.getDescricao());
        eIdQuarto.setText(String.valueOf(quarto.getIdQuarto()));
        eIdQuarto.setVisible(false);
        c_descricao.requestFocus();       
        carregaCombo(quarto.getIdTipoQuarto().getIdTipoQuarto());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        t_titulo = new javax.swing.JTextField();
        t_descricao = new javax.swing.JTextField();
        t_tipo = new javax.swing.JTextField();
        c_descricao = new javax.swing.JTextField();
        cb_tipoQuarto = new javax.swing.JComboBox<>();
        b_incluir = new javax.swing.JButton();
        b_consulta = new javax.swing.JButton();
        eIdQuarto = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        t_titulo.setEditable(false);
        t_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        t_titulo.setText("QUARTOS");
        t_titulo.setBorder(null);

        t_descricao.setEditable(false);
        t_descricao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_descricao.setText("Descrição");
        t_descricao.setBorder(null);

        t_tipo.setEditable(false);
        t_tipo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_tipo.setText("Tipo");
        t_tipo.setBorder(null);

        c_descricao.setMinimumSize(new java.awt.Dimension(6, 24));
        c_descricao.setPreferredSize(new java.awt.Dimension(6, 24));
        c_descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_descricaoKeyTyped(evt);
            }
        });

        cb_tipoQuarto.setMinimumSize(new java.awt.Dimension(31, 24));
        cb_tipoQuarto.setPreferredSize(new java.awt.Dimension(31, 24));

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

        eIdQuarto.setEnabled(false);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 52, Short.MAX_VALUE)
                                .addComponent(b_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_tipoQuarto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(eIdQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eIdQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        Quarto quarto = new Quarto();
        if (fazVerificacoes()) {
            quarto.setDescricao(c_descricao.getText());
            TipoQuarto tipo = (TipoQuarto) cb_tipoQuarto.getSelectedItem();
            quarto.setIdTipoQuarto(tipo);
            if ((eIdQuarto.getText().isEmpty()) || (Integer.parseInt(eIdQuarto.getText()) == 0)) {
                QuartoDAO quartoDAO = new QuartoDAO();
                quartoDAO.incluir(quarto);
                limparCampos();
            } else {
                QuartoDAO alterar = new QuartoDAO();
                quarto.setIdQuarto(Integer.parseInt(eIdQuarto.getText()));
                alterar.update(quarto);
                limparCampos();
            }
        }       
    }//GEN-LAST:event_b_incluirActionPerformed

    private void b_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_consultaActionPerformed
        TelaListarQuartos quartos = null;
        try {
            quartos = new TelaListarQuartos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        quartos.setVisible(true);
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
            JOptionPane.showMessageDialog(null, "Informe a descrição do quarto!");
            c_descricao.requestFocus();
            return false;
        };
        if(cb_tipoQuarto.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há tipos de quartos cadastrados, verifique!");
            cb_tipoQuarto.requestFocus();
            return false;
        }
        return true;
    }

    private void limparCampos() {
        eIdQuarto.setText(null);
        c_descricao.setText(null);
        cb_tipoQuarto.setSelectedIndex(0);
    }
           
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuarto().setVisible(true);
            }
        });
    }
    
    private void carregaCombo(int idTipoQuarto){        
        TipoQuartoDAO tipoDAO = new TipoQuartoDAO();
        List<Tabelas.TipoQuarto> tipoList = new ArrayList<>();
        tipoList = tipoDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_tipoQuarto.getModel();
        comboModel.removeAllElements();
        for (Tabelas.TipoQuarto p : tipoList) {
            comboModel.addElement(p);
            if(idTipoQuarto == p.getIdTipoQuarto()){
                cb_tipoQuarto.setSelectedItem(p);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_consulta;
    private javax.swing.JButton b_incluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField c_descricao;
    private javax.swing.JComboBox<String> cb_tipoQuarto;
    private javax.swing.JTextField eIdQuarto;
    private javax.swing.JTextField t_descricao;
    private javax.swing.JTextField t_tipo;
    private javax.swing.JTextField t_titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
