package Telas;

import DAO.MedicamentoDAO;
import DAO.ProcedimentoDAO;
import Tabelas.Medicamento;
import Tabelas.Procedimento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListarMedicamentos extends javax.swing.JFrame {

    private DefaultTableModel modeloMedicamento;
    boolean repaintTelaProc;
    Procedimento procedimento;

    public TelaListarMedicamentos() throws SQLException {
        this.modeloMedicamento = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        configInicial();
        this.repaintTelaProc = false;
    }
    
    public TelaListarMedicamentos(Boolean repaintTelaProc, Procedimento procedimento) throws SQLException {
        this.modeloMedicamento = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        configInicial();
        this.repaintTelaProc = repaintTelaProc;
        this.procedimento = procedimento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_MedCadastrados = new javax.swing.JTable();
        t_medicamentosListados = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_selecionar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c_selecionar = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_MedCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_MedCadastrados);

        t_medicamentosListados.setEditable(false);
        t_medicamentosListados.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        t_medicamentosListados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_medicamentosListados.setText("Medicamentos");
        t_medicamentosListados.setBorder(null);

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
                .addGap(297, 297, 297)
                .addComponent(t_medicamentosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c_selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addGap(6, 6, 6)
                        .addComponent(btnSelecionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(t_medicamentosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_selecionarActionPerformed(java.awt.event.ActionEvent evt) {
        MedicamentoDAO medDAO = new MedicamentoDAO();
        List<Tabelas.Medicamento> medList = new ArrayList<>();
        medList = medDAO.listar();

        int i = tb_MedCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um medicamento.");
        } else {
            for (Tabelas.Medicamento p : medList) {
                if (p.getIdMedicamento()== Integer.parseInt(tb_MedCadastrados.getValueAt(tb_MedCadastrados.getSelectedRow(), 0).toString())) {
                    TelaMedicamentos telaMed = null;
                    telaMed = new TelaMedicamentos(p, repaintTelaProc, procedimento);   
                    telaMed.setVisible(true);
                    dispose();
                }
            }
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        TelaMedicamentos telaMed = new TelaMedicamentos(repaintTelaProc, procedimento);
        telaMed.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        MedicamentoDAO medDAO = new MedicamentoDAO();
        List<Tabelas.Medicamento> medList = new ArrayList<>();
        medList = medDAO.listar();
        boolean excluiu = false;

        int i = tb_MedCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um medicamento para remover.");
        } else {
            for (Tabelas.Medicamento p : medList) {               
                if (p.getIdMedicamento() == Integer.parseInt(tb_MedCadastrados.getValueAt(tb_MedCadastrados.getSelectedRow(), 0).toString())) {
                    if(validarExclusao(p)){
                        medDAO.excluir(p);
                        JOptionPane.showMessageDialog(null, "Medicamento removido com sucesso.");
                        excluiu = true;
                    } else {                               
                        excluiu = false;
                        break;               
                    }    
                }                                        
            }
            if(excluiu){
                TelaListarMedicamentos med = null;
                try {
                    med = new TelaListarMedicamentos(repaintTelaProc, procedimento);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                }
                med.setVisible(true);
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
            MedicamentoDAO med = new MedicamentoDAO();
            popularTabelaSelecionar(med.retornarMedicamento(c_selecionar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaListarMedicamentos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void popularTabela() throws SQLException {
        modeloMedicamento.setNumRows(0);
        MedicamentoDAO medDAO = new MedicamentoDAO();
        List<Tabelas.Medicamento> medList = new ArrayList<>();
        medList = medDAO.listar();

        for (Tabelas.Medicamento p : medList) {
            modeloMedicamento.addRow(new Object[]{p.getIdMedicamento(), p.getNome()});
        }
    }
    
    public void popularTabelaSelecionar(List lista) throws SQLException {
        modeloMedicamento.setNumRows(0);
        List<Tabelas.Medicamento> medList = new ArrayList<>();
        medList = lista;
        for (Tabelas.Medicamento p : medList) {
            modeloMedicamento.addRow(new Object[]{p.getIdMedicamento(), p.getNome()});
        }
    }
    
    private boolean validarExclusao(Medicamento med){
        ProcedimentoDAO procDAO = new ProcedimentoDAO();
        List<Tabelas.Procedimento> procList = new ArrayList<>();
        procList = procDAO.listar();

        for (Tabelas.Procedimento p : procList) {
            if(p.getIdMedicamento() != null){
                if (p.getIdMedicamento().getIdMedicamento() == Integer.parseInt(tb_MedCadastrados.getValueAt(tb_MedCadastrados.getSelectedRow(), 0).toString())) {
                    JOptionPane.showMessageDialog(null, "Esse medicamento está vinculado a um procedimento, verifique!");
                    return false;
                }
            }
        }   
        return true;
    }
    
    private void configInicial() throws SQLException{
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_MedCadastrados.removeAll();
        tb_MedCadastrados.setModel(modeloMedicamento);
        modeloMedicamento.addColumn("CÓDIGO");
        modeloMedicamento.addColumn("NOME");
        tb_MedCadastrados.getColumnModel().getColumn(0).setPreferredWidth(5);
        tb_MedCadastrados.getColumnModel().getColumn(1).setPreferredWidth(40);
        modeloMedicamento.setNumRows(0);
        popularTabela();
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
    private javax.swing.JTextField t_medicamentosListados;
    private javax.swing.JTable tb_MedCadastrados;
    // End of variables declaration//GEN-END:variables
}
