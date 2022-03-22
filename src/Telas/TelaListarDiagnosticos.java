package Telas;

import DAO.DiagnosticoDAO;
import DAO.DoencaDAO;
import DAO.FuncionarioDAO;
import DAO.ProcedimentoDAO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListarDiagnosticos extends javax.swing.JFrame {

    private DefaultTableModel modeloDiagnostico;

    public TelaListarDiagnosticos() throws SQLException {
        this.modeloDiagnostico = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_DiagnosticosCadastrados.removeAll();
        tb_DiagnosticosCadastrados.setModel(modeloDiagnostico);
        modeloDiagnostico.addColumn("CÓDIGO");
        modeloDiagnostico.addColumn("STATUS");
        modeloDiagnostico.addColumn("DOENÇA");
        tb_DiagnosticosCadastrados.getColumnModel().getColumn(0).setPreferredWidth(5);
        tb_DiagnosticosCadastrados.getColumnModel().getColumn(1).setPreferredWidth(50);
        tb_DiagnosticosCadastrados.getColumnModel().getColumn(2).setPreferredWidth(50);
        modeloDiagnostico.setNumRows(0);
        popularTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_DiagnosticosCadastrados = new javax.swing.JTable();
        t_DiagnosticosListados = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_selecionar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        c_selecionar = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        l_descricao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_DiagnosticosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_DiagnosticosCadastrados);

        t_DiagnosticosListados.setEditable(false);
        t_DiagnosticosListados.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        t_DiagnosticosListados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_DiagnosticosListados.setText("Diagnósticos");
        t_DiagnosticosListados.setBorder(null);

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

        btnSelecionar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        c_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_selecionarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        l_descricao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        l_descricao.setText("DOENÇA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(t_DiagnosticosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_DiagnosticosListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_descricao)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(btnSelecionar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimpar))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_selecionarActionPerformed(java.awt.event.ActionEvent evt) {
        DiagnosticoDAO diagDAO = new DiagnosticoDAO();
        List<Tabelas.Diagnostico> diagList = new ArrayList<>();
        diagList = diagDAO.listar();

        int i = tb_DiagnosticosCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um diagnóstico.");
        } else {
            for (Tabelas.Diagnostico p : diagList) {
                if (p.getIdDiagnostico() == Integer.parseInt(tb_DiagnosticosCadastrados.getValueAt(tb_DiagnosticosCadastrados.getSelectedRow(), 0).toString())) {
                    TelaDiagnostico telaDiag = null;
                    telaDiag = new TelaDiagnostico(p);   
                    telaDiag.setVisible(true);
                    dispose();
                }
            }
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        TelaDiagnostico telaDiag = new TelaDiagnostico();
        telaDiag.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        DiagnosticoDAO diagDAO = new DiagnosticoDAO();
        List<Tabelas.Diagnostico> diagList = new ArrayList<>();
        diagList = diagDAO.listar();

        int i = tb_DiagnosticosCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um diagnóstico para remover.");
        } else {
            for (Tabelas.Diagnostico p : diagList) {
                if (p.getIdDiagnostico() == Integer.parseInt(tb_DiagnosticosCadastrados.getValueAt(tb_DiagnosticosCadastrados.getSelectedRow(), 0).toString())) {
                    diagDAO.excluir(p);
                    JOptionPane.showMessageDialog(null, "Diagnóstico removido com sucesso.");
                }
            }
            TelaListarDiagnosticos telaDiag = null;
            try {
                telaDiag = new TelaListarDiagnosticos();
            } catch (SQLException ex) {
                Logger.getLogger(TelaListarDiagnosticos.class.getName()).log(Level.SEVERE, null, ex);
            }
            telaDiag.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            DiagnosticoDAO diagDAO = new DiagnosticoDAO();
            popularTabelaSelecionar(diagDAO.RetornarDiagnosticoSelec(c_selecionar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarDiagnosticos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        c_selecionar.setText("");       
        c_selecionar.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void c_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_selecionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_selecionarActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaListarDiagnosticos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarDiagnosticos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void popularTabela() throws SQLException {
        modeloDiagnostico.setNumRows(0);
        DiagnosticoDAO diagDAO = new DiagnosticoDAO();
        List<Tabelas.Diagnostico> diagList = new ArrayList<>();
        diagList = diagDAO.listar();
        
        DoencaDAO doencaDAO = new DoencaDAO();
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = doencaDAO.listar();

        for (Tabelas.Diagnostico p : diagList) {
            for (Tabelas.Doenca doe : doencaList) {    
                if(doe.getIdDoenca() == p.getIdDoenca().getIdDoenca()){
                    modeloDiagnostico.addRow(new Object[]{p.getIdDiagnostico(), retornarStatus(p.getStatus()), p.getIdDoenca().getNome()});
                }
            }
        }
    }
    
    public void popularTabelaSelecionar(List lista) throws SQLException {
        modeloDiagnostico.setNumRows(0);
        List<Tabelas.Diagnostico> diagList = new ArrayList<>();
        diagList = lista;
        
        DoencaDAO doencaDAO = new DoencaDAO();
        List<Tabelas.Doenca> doencaList = new ArrayList<>();
        doencaList = doencaDAO.listar();

        for (Tabelas.Diagnostico p : diagList) {
            for (Tabelas.Doenca doe : doencaList) {    
                if(doe.getIdDoenca() == p.getIdDoenca().getIdDoenca()){
                    modeloDiagnostico.addRow(new Object[]{p.getIdDiagnostico(), retornarStatus(p.getStatus()), p.getIdDoenca().getNome()});
                }
            }
        }
    }
    
    public String retornarStatus(String status){
        switch (status) {
            case "C":
                return "CONFIRMADO";
            case "S":
                return "SUSPEITO";
            case "A":
                return "EM AVALIAÇÃO";
            case "N":
                return "NÃO CONFIRMADO";
        }
        return "";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cancelar;
    private javax.swing.JButton b_excluir;
    private javax.swing.JButton b_selecionar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFormattedTextField c_selecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_descricao;
    private javax.swing.JTextField t_DiagnosticosListados;
    private javax.swing.JTable tb_DiagnosticosCadastrados;
    // End of variables declaration//GEN-END:variables
}
