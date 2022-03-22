package Telas;

import DAO.DiagnosticoDAO;
import DAO.DoencaDAO;
import Tabelas.Diagnostico;
import Tabelas.Doenca;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListarDoencas extends javax.swing.JFrame {

    private DefaultTableModel modeloDoenca;
    boolean repaintTelaDiag;
    Diagnostico diagnostico;

    public TelaListarDoencas() throws SQLException {
        this.modeloDoenca = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        configInicial();
        this.repaintTelaDiag = false;
    }
    
    public TelaListarDoencas(Boolean repaintTelaDiag, Diagnostico diagnostico) throws SQLException {
        this.modeloDoenca = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        configInicial();
        this.repaintTelaDiag = repaintTelaDiag;
        this.diagnostico = diagnostico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DoencasCadastradas = new javax.swing.JTable();
        t_doencasListadas = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_selecionar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c_selecionar = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_DoencasCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_DoencasCadastradas);

        t_doencasListadas.setEditable(false);
        t_doencasListadas.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        t_doencasListadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_doencasListadas.setText("Doenças");
        t_doencasListadas.setBorder(null);

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

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("NOME");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(t_doencasListadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c_selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(t_doencasListadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSelecionar)
                        .addComponent(btnLimpar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_selecionarActionPerformed(java.awt.event.ActionEvent evt) {
        DoencaDAO doencaDAO = new DoencaDAO();
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = doencaDAO.listar();

        int i = tb_DoencasCadastradas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma doença.");
        } else {
            for (Tabelas.Doenca p : doencaList) {
                if (p.getIdDoenca()== Integer.parseInt(tb_DoencasCadastradas.getValueAt(tb_DoencasCadastradas.getSelectedRow(), 0).toString())) {
                    TelaDoencas telaDoenca = null;
                    telaDoenca = new TelaDoencas(p, repaintTelaDiag, diagnostico);   
                    telaDoenca.setVisible(true);
                    dispose();
                }
            }
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        TelaDoencas telaDoenca = new TelaDoencas(repaintTelaDiag, diagnostico);
        telaDoenca.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        DoencaDAO doencaDAO = new DoencaDAO();
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = doencaDAO.listar();
        boolean excluiu = false;

        int i = tb_DoencasCadastradas.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione uma doença para remover.");
        } else {
            for (Tabelas.Doenca p : doencaList) {               
                if (p.getIdDoenca() == Integer.parseInt(tb_DoencasCadastradas.getValueAt(tb_DoencasCadastradas.getSelectedRow(), 0).toString())) {
                    if(validarExclusao(p)){
                        doencaDAO.excluir(p);
                        JOptionPane.showMessageDialog(null, "Doença removida com sucesso.");
                        excluiu = true;
                    } else {                               
                        excluiu = false;
                        break;               
                    }    
                }                                        
            }
            if(excluiu){
                TelaListarDoencas doenca = null;
                try {
                    doenca = new TelaListarDoencas(repaintTelaDiag, diagnostico);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarDoencas.class.getName()).log(Level.SEVERE, null, ex);
                }
                doenca.setVisible(true);
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
            DAO.DoencaDAO doenca = new DoencaDAO();
            popularTabelaSelecionar(doenca.retornarDoenca( c_selecionar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaListarDoencas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarDoencas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void popularTabela() throws SQLException {
        modeloDoenca.setNumRows(0);
        DoencaDAO doencaDAO = new DoencaDAO();
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = doencaDAO.listar();

        for (Tabelas.Doenca p : doencaList) {
            modeloDoenca.addRow(new Object[]{p.getIdDoenca(), p.getNome()});
        }
    }
    
    public void popularTabelaSelecionar(List lista) throws SQLException {
        modeloDoenca.setNumRows(0);
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = lista;

        for (Tabelas.Doenca p : doencaList) {
            modeloDoenca.addRow(new Object[]{p.getIdDoenca(), p.getNome()});
        }
    }
    
    public void configInicial() throws SQLException{
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_DoencasCadastradas.removeAll();
        tb_DoencasCadastradas.setModel(modeloDoenca);
        modeloDoenca.addColumn("CÓDIGO");
        modeloDoenca.addColumn("NOME");
        tb_DoencasCadastradas.getColumnModel().getColumn(0).setPreferredWidth(5);
        tb_DoencasCadastradas.getColumnModel().getColumn(1).setPreferredWidth(40);
        modeloDoenca.setNumRows(0);
        popularTabela();
    }
    
    private boolean validarExclusao(Doenca doenca){
        DiagnosticoDAO diagDAO = new DiagnosticoDAO();
        List<Tabelas.Diagnostico> diagList = new ArrayList<>();
        diagList = diagDAO.listar();

        for (Tabelas.Diagnostico p : diagList) {
            if(p.getIdDoenca() != null){
                if (p.getIdDoenca().getIdDoenca() == Integer.parseInt(tb_DoencasCadastradas.getValueAt(tb_DoencasCadastradas.getSelectedRow(), 0).toString())) {
                    JOptionPane.showMessageDialog(null, "Essa doença está vinculada a um diagnóstico, verifique!");
                    return false;
                }
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
    private javax.swing.JTextField t_doencasListadas;
    private javax.swing.JTable tb_DoencasCadastradas;
    // End of variables declaration//GEN-END:variables
}
