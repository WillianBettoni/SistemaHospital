package Telas;

import DAO.QuartoDAO;
import DAO.TipoQuartoDAO;
import Tabelas.TipoQuarto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListarTipoQuarto extends javax.swing.JFrame {

    private DefaultTableModel modeloTipoQuarto;

    public TelaListarTipoQuarto() throws SQLException {
        this.modeloTipoQuarto = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_TiposCadastrados.removeAll();
        tb_TiposCadastrados.setModel(modeloTipoQuarto);
        modeloTipoQuarto.addColumn("CÓDIGO");
        modeloTipoQuarto.addColumn("NOME");
        tb_TiposCadastrados.getColumnModel().getColumn(0).setPreferredWidth(5);
        tb_TiposCadastrados.getColumnModel().getColumn(1).setPreferredWidth(40);
        modeloTipoQuarto.setNumRows(0);
        popularTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TiposCadastrados = new javax.swing.JTable();
        t_tipoQuartosListados = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_selecionar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        c_selecionar = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_TiposCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_TiposCadastrados);

        t_tipoQuartosListados.setEditable(false);
        t_tipoQuartosListados.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        t_tipoQuartosListados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_tipoQuartosListados.setText("Tipos de Quartos");
        t_tipoQuartosListados.setBorder(null);

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

        btnLimpar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSelecionar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c_selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelecionar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_tipoQuartosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_tipoQuartosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSelecionar)
                                .addComponent(btnLimpar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_selecionarActionPerformed(java.awt.event.ActionEvent evt) {
        TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();
        List<Tabelas.TipoQuarto> tipoList = new ArrayList<>();
        tipoList = tipoQuartoDAO.listar();

        int i = tb_TiposCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um tipo de quarto.");
        } else {
            for (Tabelas.TipoQuarto p : tipoList) {
                if (p.getIdTipoQuarto()== Integer.parseInt(tb_TiposCadastrados.getValueAt(tb_TiposCadastrados.getSelectedRow(), 0).toString())) {
                    TelaTipoQuarto telaTipo = null;
                    telaTipo = new TelaTipoQuarto(p);   
                    telaTipo.setVisible(true);
                    dispose();
                }
            }
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        TelaTipoQuarto telaTipo = new TelaTipoQuarto();
        telaTipo.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        TipoQuartoDAO tipoDAO = new TipoQuartoDAO();
        List<Tabelas.TipoQuarto> tipoList = new ArrayList<>();
        tipoList = tipoDAO.listar();
        boolean excluiu = false;

        int i = tb_TiposCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um tipo de quarto para remover.");
        } else {
            for (Tabelas.TipoQuarto p : tipoList) {               
                if (p.getIdTipoQuarto() == Integer.parseInt(tb_TiposCadastrados.getValueAt(tb_TiposCadastrados.getSelectedRow(), 0).toString())) {
                    if(validarExclusao(p)){
                        tipoDAO.excluir(p);
                        JOptionPane.showMessageDialog(null, "Tipo de quarto removido com sucesso.");
                        excluiu = true;
                    } else {                               
                        excluiu = false;
                        break;               
                    }    
                }                                        
            }
            if(excluiu){
                TelaListarTipoQuarto tipo = null;
                try {
                    tipo = new TelaListarTipoQuarto();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarTipoQuarto.class.getName()).log(Level.SEVERE, null, ex);
                }
                tipo.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        c_selecionar.setText("");
        c_selecionar.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            TipoQuartoDAO tipo = new TipoQuartoDAO();
            popularTabelaSelecionar(tipo.retornarTipo(c_selecionar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarTipoQuarto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaListarTipoQuarto().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarTipoQuarto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void popularTabela() throws SQLException {
        modeloTipoQuarto.setNumRows(0);
        TipoQuartoDAO tipoDAO = new TipoQuartoDAO();
        List<Tabelas.TipoQuarto> tipoList = new ArrayList<>();
        tipoList = tipoDAO.listar();
        for (Tabelas.TipoQuarto p : tipoList) {
            modeloTipoQuarto.addRow(new Object[]{p.getIdTipoQuarto(), p.getNome()});
        }
    }
    
    public void popularTabelaSelecionar(List lista) throws SQLException {
        modeloTipoQuarto.setNumRows(0);
        List<Tabelas.TipoQuarto> funcList = new ArrayList<>();
        funcList = lista;
        for (Tabelas.TipoQuarto p : funcList) {
            modeloTipoQuarto.addRow(new Object[]{p.getIdTipoQuarto(), p.getNome()});
        }
    }
    
    private boolean validarExclusao(TipoQuarto tipo){
        QuartoDAO quartoDAO = new QuartoDAO();
        List<Tabelas.Quarto> quartoList = new ArrayList<>();
        quartoList = quartoDAO.listar();

        for (Tabelas.Quarto p : quartoList) {
            if (p.getIdTipoQuarto().getIdTipoQuarto() == Integer.parseInt(tb_TiposCadastrados.getValueAt(tb_TiposCadastrados.getSelectedRow(), 0).toString())) {
                JOptionPane.showMessageDialog(null, "Esse tipo está vinculado a um quarto, verifique!");
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
    private javax.swing.JFormattedTextField c_selecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_tipoQuartosListados;
    private javax.swing.JTable tb_TiposCadastrados;
    // End of variables declaration//GEN-END:variables
}
