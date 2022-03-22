package Telas;

import Telas.TelaDoencas;
import Telas.TelaMedicamentos;
import Telas.TelaSobre;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        setSize(400, 320);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImagem = new javax.swing.JLabel();
        c_opcoesMenu = new javax.swing.JMenuBar();
        b_relatorios = new javax.swing.JMenu();
        b_Medicamentos = new javax.swing.JMenuItem();
        b_Doencas = new javax.swing.JMenuItem();
        b_Funcionario = new javax.swing.JMenuItem();
        b_TipoFuncionario = new javax.swing.JMenuItem();
        b_TipoQuarto = new javax.swing.JMenuItem();
        b_Quarto = new javax.swing.JMenuItem();
        b_Leito = new javax.swing.JMenuItem();
        b_Paciente = new javax.swing.JMenuItem();
        b_Medico = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        b_Procedimentos = new javax.swing.JMenuItem();
        b_Prontuarios = new javax.swing.JMenuItem();
        b_diagnostico = new javax.swing.JMenuItem();
        b_sobre = new javax.swing.JMenu();
        b_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/LogoHosp.png"))); // NOI18N
        lbImagem.setText("jLabel2");
        getContentPane().add(lbImagem);
        lbImagem.setBounds(80, 40, 190, 140);

        b_relatorios.setText("Cadastros");
        b_relatorios.setFocusable(false);
        b_relatorios.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b_relatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b_relatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        b_Medicamentos.setText("Medicamentos");
        b_Medicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_MedicamentosMouseClicked(evt);
            }
        });
        b_Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_MedicamentosActionPerformed(evt);
            }
        });
        b_relatorios.add(b_Medicamentos);

        b_Doencas.setText("Doenças");
        b_Doencas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_DoencasMouseClicked(evt);
            }
        });
        b_Doencas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_DoencasActionPerformed(evt);
            }
        });
        b_relatorios.add(b_Doencas);

        b_Funcionario.setText("Funcionário");
        b_Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_FuncionarioActionPerformed(evt);
            }
        });
        b_relatorios.add(b_Funcionario);

        b_TipoFuncionario.setText("Tipo Funcionário");
        b_TipoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_TipoFuncionarioActionPerformed(evt);
            }
        });
        b_relatorios.add(b_TipoFuncionario);

        b_TipoQuarto.setText("Tipo Quarto");
        b_TipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_TipoQuartoActionPerformed(evt);
            }
        });
        b_relatorios.add(b_TipoQuarto);

        b_Quarto.setText("Quarto");
        b_Quarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_QuartoActionPerformed(evt);
            }
        });
        b_relatorios.add(b_Quarto);

        b_Leito.setText("Leito");
        b_Leito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LeitoActionPerformed(evt);
            }
        });
        b_relatorios.add(b_Leito);

        b_Paciente.setText("Paciente");
        b_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_PacienteActionPerformed(evt);
            }
        });
        b_relatorios.add(b_Paciente);

        b_Medico.setText("Médico");
        b_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_MedicoActionPerformed(evt);
            }
        });
        b_relatorios.add(b_Medico);

        c_opcoesMenu.add(b_relatorios);

        jMenu1.setText("Lançamentos");
        jMenu1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        b_Procedimentos.setText("Procedimentos");
        b_Procedimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ProcedimentosActionPerformed(evt);
            }
        });
        jMenu1.add(b_Procedimentos);

        b_Prontuarios.setText("Prontuários");
        b_Prontuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ProntuariosActionPerformed(evt);
            }
        });
        jMenu1.add(b_Prontuarios);

        b_diagnostico.setText("Diagnósticos");
        b_diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_diagnosticoActionPerformed(evt);
            }
        });
        jMenu1.add(b_diagnostico);

        c_opcoesMenu.add(jMenu1);

        b_sobre.setText("Sobre");
        b_sobre.setFocusable(false);
        b_sobre.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b_sobre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b_sobre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_sobreMouseClicked(evt);
            }
        });
        c_opcoesMenu.add(b_sobre);

        b_sair.setText("Sair");
        b_sair.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        b_sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b_sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_sairMouseClicked(evt);
            }
        });
        c_opcoesMenu.add(b_sair);

        setJMenuBar(c_opcoesMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sobreMouseClicked
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_b_sobreMouseClicked

    private void b_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_b_sairMouseClicked

    private void b_MedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_MedicamentosMouseClicked

    }//GEN-LAST:event_b_MedicamentosMouseClicked

    private void b_DoencasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_DoencasActionPerformed
        TelaDoencas doencas = new TelaDoencas();
        doencas.setVisible(true);
    }//GEN-LAST:event_b_DoencasActionPerformed

    private void b_DoencasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_DoencasMouseClicked

    }//GEN-LAST:event_b_DoencasMouseClicked

    private void b_TipoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TipoFuncionarioActionPerformed
        TelaTipoFuncionario tipoFunc = new TelaTipoFuncionario();
        tipoFunc.setVisible(true);
    }//GEN-LAST:event_b_TipoFuncionarioActionPerformed

    private void b_FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_FuncionarioActionPerformed
        TelaFuncionario telaFunc = new TelaFuncionario();
        telaFunc.setVisible(true);
    }//GEN-LAST:event_b_FuncionarioActionPerformed

    private void b_TipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_TipoQuartoActionPerformed
        TelaTipoQuarto telaTipoQuarto = new TelaTipoQuarto();
        telaTipoQuarto.setVisible(true);
    }//GEN-LAST:event_b_TipoQuartoActionPerformed

    private void b_QuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_QuartoActionPerformed
        TelaQuarto telaQuarto = new TelaQuarto();
        telaQuarto.setVisible(true);
    }//GEN-LAST:event_b_QuartoActionPerformed

    private void b_LeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LeitoActionPerformed
        TelaLeito telaLeito = new TelaLeito();
        telaLeito.setVisible(true);
    }//GEN-LAST:event_b_LeitoActionPerformed

    private void b_ProcedimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ProcedimentosActionPerformed
        TelaProcedimentos telaProcedimentos = new TelaProcedimentos();
        telaProcedimentos.setVisible(true);
    }//GEN-LAST:event_b_ProcedimentosActionPerformed

    private void b_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_PacienteActionPerformed
        TelaPaciente telaPaciente = new TelaPaciente();
        telaPaciente.setVisible(true);
    }//GEN-LAST:event_b_PacienteActionPerformed

    private void b_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_MedicoActionPerformed
        TelaMedico telaMedico = new TelaMedico();
        telaMedico.setVisible(true);
    }//GEN-LAST:event_b_MedicoActionPerformed

    private void b_MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_MedicamentosActionPerformed
        TelaMedicamentos telaMedic = new TelaMedicamentos();
        telaMedic.setVisible(true);
    }//GEN-LAST:event_b_MedicamentosActionPerformed

    private void b_ProntuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ProntuariosActionPerformed
        TelaProntuarios telaProntuario = new TelaProntuarios();
        telaProntuario.setVisible(true);
    }//GEN-LAST:event_b_ProntuariosActionPerformed

    private void b_diagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_diagnosticoActionPerformed
        TelaDiagnostico telaDiagnostico = new TelaDiagnostico();
        telaDiagnostico.setVisible(true);
    }//GEN-LAST:event_b_diagnosticoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem b_Doencas;
    private javax.swing.JMenuItem b_Funcionario;
    private javax.swing.JMenuItem b_Leito;
    private javax.swing.JMenuItem b_Medicamentos;
    private javax.swing.JMenuItem b_Medico;
    private javax.swing.JMenuItem b_Paciente;
    private javax.swing.JMenuItem b_Procedimentos;
    private javax.swing.JMenuItem b_Prontuarios;
    private javax.swing.JMenuItem b_Quarto;
    private javax.swing.JMenuItem b_TipoFuncionario;
    private javax.swing.JMenuItem b_TipoQuarto;
    private javax.swing.JMenuItem b_diagnostico;
    private javax.swing.JMenu b_relatorios;
    private javax.swing.JMenu b_sair;
    private javax.swing.JMenu b_sobre;
    private javax.swing.JMenuBar c_opcoesMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lbImagem;
    // End of variables declaration//GEN-END:variables
}
