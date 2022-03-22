package Telas;

import DAO.DiagnosticoDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import DAO.ProcedimentoDAO;
import DAO.ProntuarioDAO;
import Tabelas.Prontuario;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListarProntuarios extends javax.swing.JFrame {

    private DefaultTableModel modeloProntuario;

    public TelaListarProntuarios() throws SQLException {
        this.modeloProntuario = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_ProntuariosCadastrados.removeAll();
        tb_ProntuariosCadastrados.setModel(modeloProntuario);
        modeloProntuario.addColumn("CÓDIGO");
        modeloProntuario.addColumn("DATA ENTRADA");
        modeloProntuario.addColumn("DATA ALTA");
        modeloProntuario.addColumn("PACIENTE");
        tb_ProntuariosCadastrados.getColumnModel().getColumn(0).setPreferredWidth(5);
        tb_ProntuariosCadastrados.getColumnModel().getColumn(1).setPreferredWidth(20);
        tb_ProntuariosCadastrados.getColumnModel().getColumn(2).setPreferredWidth(20);
        tb_ProntuariosCadastrados.getColumnModel().getColumn(3).setPreferredWidth(40);
        modeloProntuario.setNumRows(0);
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
        tb_ProntuariosCadastrados = new javax.swing.JTable();
        t_Prontuarios = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_selecionar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        c_selecionar = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();
        l_Paciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_ProntuariosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_ProntuariosCadastrados);

        t_Prontuarios.setEditable(false);
        t_Prontuarios.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        t_Prontuarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_Prontuarios.setText("Prontuários");
        t_Prontuarios.setBorder(null);

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

        l_Paciente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        l_Paciente.setText("PACIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_Paciente)
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
                .addGap(313, 313, 313)
                .addComponent(t_Prontuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_Prontuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_Paciente)))
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
        ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
        List<Tabelas.Prontuario> prontuarioList = new ArrayList<>();
        prontuarioList = prontuarioDAO.listar();

        int i = tb_ProntuariosCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um prontuário.");
        } else {
            for (Tabelas.Prontuario p : prontuarioList) {
                if (p.getIdProntuario() == Integer.parseInt(tb_ProntuariosCadastrados.getValueAt(tb_ProntuariosCadastrados.getSelectedRow(), 0).toString())) {
                    TelaProntuarios telaProntuarios = null;
                    telaProntuarios = new TelaProntuarios(p);   
                    telaProntuarios.setVisible(true);
                    dispose();
                }
            }
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        TelaProntuarios telaProntuarios = new TelaProntuarios();
        telaProntuarios.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        ProntuarioDAO prontDAO = new ProntuarioDAO();
        List<Tabelas.Prontuario> prontList = new ArrayList<>();
        prontList = prontDAO.listar();
        boolean excluiu = false;

        int i = tb_ProntuariosCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um prontuário para remover.");
        } else {
            for (Tabelas.Prontuario p : prontList) {               
                if (p.getIdProntuario() == Integer.parseInt(tb_ProntuariosCadastrados.getValueAt(tb_ProntuariosCadastrados.getSelectedRow(), 0).toString())) {
                    if(validarExclusao(p)){
                        prontDAO.excluir(p);
                        JOptionPane.showMessageDialog(null, "Prontuário removido com sucesso.");
                        excluiu = true;
                    } else {                               
                        excluiu = false;
                        break;               
                    }    
                }                                        
            }
            if(excluiu){
                TelaListarProntuarios pront = null;
                try {
                    pront = new TelaListarProntuarios();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarProntuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                pront.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
            popularTabelaSelecionar(prontuarioDAO.RetornarProntuarioSelec(c_selecionar.getText()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarProntuarios.class.getName()).log(Level.SEVERE, null, ex);
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
                    new TelaListarProntuarios().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarProntuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void popularTabela() throws SQLException {
        modeloProntuario.setNumRows(0);
        ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
        List<Tabelas.Prontuario> prontuarioList = new ArrayList<>();
        prontuarioList = prontuarioDAO.listar();
                           
        PacienteDAO pacienteDAO = new PacienteDAO();
        List<Tabelas.Paciente> pacList = new ArrayList<>();
        pacList = pacienteDAO.listar();
        
        for (Tabelas.Prontuario p : prontuarioList) {
            for (Tabelas.Paciente pac : pacList) {
                if(pac.getIdPaciente()==p.getIdPaciente().getIdPaciente()){    
                    modeloProntuario.addRow(new Object[]{p.getIdProntuario(), retornarDataFormatada(p.getDataEntrada()), retornarDataFormatada(p.getDataAlta()), p.getIdPaciente().getNome()});
                }    
            } 
        }
    }
    
    public void popularTabelaSelecionar(List lista) throws SQLException {
        modeloProntuario.setNumRows(0);
        List<Tabelas.Prontuario> pronList = new ArrayList<>();
        pronList = lista;
        
        PacienteDAO pacienteDAO = new PacienteDAO();
        List<Tabelas.Paciente> pacList = new ArrayList<>();
        pacList = pacienteDAO.listar();

        for (Tabelas.Prontuario p : pronList) {
            for (Tabelas.Paciente pac : pacList) { 
                if(pac.getIdPaciente()==p.getIdPaciente().getIdPaciente()){    
                    modeloProntuario.addRow(new Object[]{p.getIdProntuario(), retornarDataFormatada(p.getDataEntrada()), retornarDataFormatada(p.getDataAlta()), p.getIdPaciente().getNome()});
                } 
            }
        }
    }
    
    public String retornarDataFormatada(Date data) {
        if(data != null){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(data);
        }
        return "";
    }
    
    private boolean validarExclusao(Prontuario prontuario){
        ProcedimentoDAO procDAO = new ProcedimentoDAO();
        List<Tabelas.Procedimento> procList = new ArrayList<>();
        procList = procDAO.listar();
        
        DiagnosticoDAO diagDAO = new DiagnosticoDAO();
        List<Tabelas.Diagnostico> diagList = new ArrayList<>();
        diagList = diagDAO.listar();
        
        boolean procedimento = false;
        boolean diagnostico = false;

        for (Tabelas.Procedimento p : procList) {
            if (p.getIdProntuario().getIdProntuario() == Integer.parseInt(tb_ProntuariosCadastrados.getValueAt(tb_ProntuariosCadastrados.getSelectedRow(), 0).toString())) {
                procedimento = true;
                break;                
            }
        }   
        
        for (Tabelas.Diagnostico p : diagList) {
            if (p.getIdProntuario().getIdProntuario() == Integer.parseInt(tb_ProntuariosCadastrados.getValueAt(tb_ProntuariosCadastrados.getSelectedRow(), 0).toString())) {
                diagnostico = true;
                break;                
            }
        } 
        
        if(procedimento||diagnostico){
            String msg = "Esse prontuário está vinculado a um ";
            if(procedimento&&diagnostico){
                msg = msg + "procedimento e a um diagnóstico";
            } else {
                if(procedimento){
                    msg = msg + "procedimento";
                } else {
                    msg = msg + "diagnóstico";
                }
            }
            msg = msg + ", verifique!";
            JOptionPane.showMessageDialog(null, msg);
            return false;
        }
        return true;
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
    private javax.swing.JLabel l_Paciente;
    private javax.swing.JTextField t_Prontuarios;
    private javax.swing.JTable tb_ProntuariosCadastrados;
    // End of variables declaration//GEN-END:variables
}
