package Telas;

import DAO.PacienteDAO;
import DAO.ProntuarioDAO;
import Tabelas.Paciente;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class TelaListarPacientes extends javax.swing.JFrame {

    private DefaultTableModel modeloPaciente;

    public TelaListarPacientes() throws SQLException {
        this.modeloPaciente = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tb_PacientesCadastrados.removeAll();
        tb_PacientesCadastrados.setModel(modeloPaciente);
        modeloPaciente.addColumn("CÓDIGO");
        modeloPaciente.addColumn("NOME");
        modeloPaciente.addColumn("CPF");
        modeloPaciente.addColumn("DATA NASC.");
        tb_PacientesCadastrados.getColumnModel().getColumn(0).setPreferredWidth(5);
        tb_PacientesCadastrados.getColumnModel().getColumn(1).setPreferredWidth(40);
        tb_PacientesCadastrados.getColumnModel().getColumn(2).setPreferredWidth(20);
        tb_PacientesCadastrados.getColumnModel().getColumn(3).setPreferredWidth(20);
        modeloPaciente.setNumRows(0);
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
        tb_PacientesCadastrados = new javax.swing.JTable();
        t_PacientesListados = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_selecionar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        cb_selecao = new javax.swing.JComboBox<>();
        btnSelecionar = new javax.swing.JButton();
        c_selecionar = new javax.swing.JFormattedTextField();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_PacientesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_PacientesCadastrados);

        t_PacientesListados.setEditable(false);
        t_PacientesListados.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        t_PacientesListados.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_PacientesListados.setText("Pacientes");
        t_PacientesListados.setBorder(null);

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

        cb_selecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));
        cb_selecao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_selecaoItemStateChanged(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb_selecao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(329, 329, 329)
                .addComponent(t_PacientesListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_PacientesListados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_selecao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        PacienteDAO pacienteDAO = new PacienteDAO();
        List<Tabelas.Paciente> pacList = new ArrayList<>();
        pacList = pacienteDAO.listar();

        int i = tb_PacientesCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um paciente.");
        } else {
            for (Tabelas.Paciente p : pacList) {
                if (p.getIdPaciente() == Integer.parseInt(tb_PacientesCadastrados.getValueAt(tb_PacientesCadastrados.getSelectedRow(), 0).toString())) {
                    TelaPaciente telaPac = null;
                    telaPac = new TelaPaciente(p);   
                    telaPac.setVisible(true);
                    dispose();
                }
            }
        }
    }

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        TelaPaciente telaPac = new TelaPaciente();
        telaPac.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        PacienteDAO pacDAO = new PacienteDAO();
        List<Tabelas.Paciente> pacList = new ArrayList<>();
        pacList = pacDAO.listar();
        boolean excluiu = false;

        int i = tb_PacientesCadastrados.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um paciente para remover.");
        } else {
            for (Tabelas.Paciente p : pacList) {               
                if (p.getIdPaciente() == Integer.parseInt(tb_PacientesCadastrados.getValueAt(tb_PacientesCadastrados.getSelectedRow(), 0).toString())) {
                    if(validarExclusao(p)){
                        pacDAO.excluir(p);
                        JOptionPane.showMessageDialog(null, "Paciente removido com sucesso.");
                        excluiu = true;
                    } else {                               
                        excluiu = false;
                        break;               
                    }    
                }                                        
            }
            if(excluiu){
                TelaListarPacientes pac = null;
                try {
                    pac = new TelaListarPacientes();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarPacientes.class.getName()).log(Level.SEVERE, null, ex);
                }
                pac.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        try {
            PacienteDAO pacDAO = new PacienteDAO();
            popularTabelaSelecionar(pacDAO.RetornarPacienteSelec(c_selecionar.getText(), cb_selecao.getSelectedIndex()));
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void cb_selecaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_selecaoItemStateChanged
        if(cb_selecao.getSelectedIndex()==1){
            c_selecionar.setFormatterFactory(null);  
            MaskFormatter format;  
            try {
                format = new MaskFormatter("###.###.###-##");
                c_selecionar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(format));  
                c_selecionar.setValue(null); 
            } catch (ParseException ex) {
                Logger.getLogger(TelaListarPacientes.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }else{
            c_selecionar.setFormatterFactory(null);
            c_selecionar.setText("");
        }
    }//GEN-LAST:event_cb_selecaoItemStateChanged

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        if(cb_selecao.getSelectedIndex()==1){
            c_selecionar.setValue(null);
        }else{
            c_selecionar.setFormatterFactory(null);
            c_selecionar.setText("");
        }
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
                    new TelaListarPacientes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarPacientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void popularTabela() throws SQLException {
        modeloPaciente.setNumRows(0);
        PacienteDAO pacienteDAO = new PacienteDAO();
        List<Tabelas.Paciente> pacList = new ArrayList<>();
        pacList = pacienteDAO.listar();

        for (Tabelas.Paciente p : pacList) {
            modeloPaciente.addRow(new Object[]{p.getIdPaciente(), p.getNome(), p.getNumCPF(), retornarDataFormatada(p.getDataNascimento())});
        }
    }
    
    public void popularTabelaSelecionar(List lista) throws SQLException {
        modeloPaciente.setNumRows(0);
        List<Tabelas.Paciente> pacList = new ArrayList<>();
        pacList = lista;

        for (Tabelas.Paciente p : pacList) {
            modeloPaciente.addRow(new Object[]{p.getIdPaciente(), p.getNome(), p.getNumCPF(), retornarDataFormatada(p.getDataNascimento())});
        }
    }
    
    public String retornarDataFormatada(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }
    
    private boolean validarExclusao(Paciente paciente){
        ProntuarioDAO prontuarioDAO = new ProntuarioDAO();
        List<Tabelas.Prontuario> pronList = new ArrayList<>();
        pronList = prontuarioDAO.listar();

        for (Tabelas.Prontuario p : pronList) {
            if (p.getIdPaciente().getIdPaciente() == Integer.parseInt(tb_PacientesCadastrados.getValueAt(tb_PacientesCadastrados.getSelectedRow(), 0).toString())) {
                JOptionPane.showMessageDialog(null, "Esse paciente está vinculado a um prontuário, verifique!");
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFormattedTextField c_selecionar;
    private javax.swing.JComboBox<String> cb_selecao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_PacientesListados;
    private javax.swing.JTable tb_PacientesCadastrados;
    // End of variables declaration//GEN-END:variables
}
