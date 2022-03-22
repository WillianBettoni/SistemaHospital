package Telas;

import DAO.MedicoDAO;
import Tabelas.Medico;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import sun.security.validator.ValidatorException;

public class TelaMedico extends javax.swing.JFrame {

    public TelaMedico() {
        initComponents();
        eIDMedico.setVisible(false);
        c_nome.requestFocus();
    }
    
    public TelaMedico(Medico medico) {
        initComponents();
        c_nome.setText(medico.getNome());
        c_CRM.setText(medico.getCRM());
        c_especialidade.setText(medico.getEspecialidade());
        c_CPF.setText(medico.getNumCPF());
        c_email.setText(medico.getEmail());
        eIDMedico.setText(String.valueOf(medico.getIdMedico()));
        eIDMedico.setVisible(false);
        c_nome.requestFocus();       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        t_titulo = new javax.swing.JTextField();
        t_nome = new javax.swing.JTextField();
        c_nome = new javax.swing.JTextField();
        b_incluir = new javax.swing.JButton();
        b_consulta = new javax.swing.JButton();
        eIDMedico = new javax.swing.JTextField();
        c_email = new javax.swing.JTextField();
        t_CPF = new javax.swing.JLabel();
        t_email = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        c_CPF = new javax.swing.JFormattedTextField();
        c_CRM = new javax.swing.JTextField();
        c_especialidade = new javax.swing.JTextField();
        t_especialidade = new javax.swing.JLabel();
        t_CRM = new javax.swing.JLabel();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        t_titulo.setEditable(false);
        t_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        t_titulo.setText("MÉDICOS");
        t_titulo.setBorder(null);

        t_nome.setEditable(false);
        t_nome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_nome.setText("Nome");
        t_nome.setBorder(null);

        c_nome.setNextFocusableComponent(c_CPF);
        c_nome.setPreferredSize(new java.awt.Dimension(6, 23));
        c_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_nomeKeyTyped(evt);
            }
        });

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

        eIDMedico.setEnabled(false);

        c_email.setNextFocusableComponent(b_incluir);
        c_email.setPreferredSize(new java.awt.Dimension(6, 23));
        c_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_emailKeyTyped(evt);
            }
        });

        t_CPF.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_CPF.setText("CPF");

        t_email.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_email.setText("E-mail");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        try {
            c_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        c_CPF.setNextFocusableComponent(c_especialidade);
        c_CPF.setPreferredSize(new java.awt.Dimension(63, 23));

        c_CRM.setNextFocusableComponent(c_email);
        c_CRM.setPreferredSize(new java.awt.Dimension(6, 23));
        c_CRM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_CRMKeyTyped(evt);
            }
        });

        c_especialidade.setNextFocusableComponent(c_CRM);
        c_especialidade.setPreferredSize(new java.awt.Dimension(6, 23));
        c_especialidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_especialidadeKeyTyped(evt);
            }
        });

        t_especialidade.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_especialidade.setText("Especialidade");

        t_CRM.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_CRM.setText("CRM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216)
                .addComponent(eIDMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_CRM)
                            .addComponent(c_CRM, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_email)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_CPF)
                            .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183)
                        .addComponent(t_especialidade)
                        .addGap(153, 153, 153))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(b_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(b_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_especialidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eIDMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_CPF)
                    .addComponent(t_especialidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_email)
                    .addComponent(t_CRM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_CRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
        Medico medico = new Medico();
        try {
            if (fazVerificacoes()) {
                medico.setNome(c_nome.getText());
                medico.setNumCPF(c_CPF.getText());
                medico.setEmail(c_email.getText());
                medico.setCRM(c_CRM.getText());
                medico.setEspecialidade(c_especialidade.getText());
                if ((eIDMedico.getText().isEmpty()) || (Integer.parseInt(eIDMedico.getText()) == 0)) {
                    MedicoDAO medicoDAO = new MedicoDAO();
                    medicoDAO.incluir(medico);
                    limparCampos();
                } else {
                    MedicoDAO alterar = new MedicoDAO();
                    medico.setIdMedico(Integer.parseInt(eIDMedico.getText()));
                    alterar.update(medico);
                    limparCampos();
                }
            }
        } catch (ValidatorException ex) {
            Logger.getLogger(TelaMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_incluirActionPerformed

    private void b_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_consultaActionPerformed
        TelaListarMedicos medicos = null;
        try {
            medicos = new TelaListarMedicos();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
        medicos.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_consultaActionPerformed

    private void c_nomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_nomeKeyTyped
        int numeroMaximo = 44;
        if (c_nome.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_c_nomeKeyTyped

    private void c_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_emailKeyTyped
        int numeroMaximo = 44;
        if (c_email.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_c_emailKeyTyped

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        c_nome.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void c_CRMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_CRMKeyTyped
        int numeroMaximo = 44;
        if (c_CRM.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_c_CRMKeyTyped

    private void c_especialidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_especialidadeKeyTyped
        int numeroMaximo = 44;
        if (c_especialidade.getText().length() > numeroMaximo) {
            evt.consume();
        }
    }//GEN-LAST:event_c_especialidadeKeyTyped

    private boolean fazVerificacoes() throws ValidatorException {
        if (c_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome do médico!");
            c_nome.requestFocus();
            return false;
        };
        String cpf = c_CPF.getText(); 
        cpf = cpf.trim().replace(".", "").replace("-", "");
        if (cpf.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CPF do médico!");
            c_CPF.requestFocus();
            return false;
        }
        if (c_especialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a especialidade do médico!");
            c_especialidade.requestFocus();
            return false;
        }
        if (c_CRM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CRM do médico!");
            c_CRM.requestFocus();
            return false;
        }
        if (c_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o e-mail do médico!");
            c_email.requestFocus();
            return false;
        }       
        if(!validaEmail()){
            JOptionPane.showMessageDialog(null, "E-mail informado é inválido!");
            c_email.requestFocus();
            return false;
        }
        if(!isValidCPF(c_CPF.getText())){
            JOptionPane.showMessageDialog(null, "CPF informado é inválido!");
            c_CPF.requestFocus();
            return false;
        }
        return true;
    }

    private void limparCampos() {
        eIDMedico.setText(null);
        c_nome.setText(null);
        c_CPF.setText(null);
        c_email.setText(null);
        c_especialidade.setText(null);
        c_CRM.setText(null);
    }
       
    private static int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int indice=str.length()-1, digito; indice >= 0; indice-- ) {
            digito = Integer.parseInt(str.substring(indice,indice+1));
            soma += digito*peso[peso.length-str.length()+indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }
    
    private static boolean isValidCPF(String cpf) {
        int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
          
        cpf = cpf.trim().replace(".", "").replace("-", "");
        if ((cpf==null) || (cpf.length()!=11)) return false;

        for (int j = 0; j < 10; j++)
            if (padLeft(Integer.toString(j), Character.forDigit(j, 10)).equals(cpf))
                return false;

        Integer digito1 = calcularDigito(cpf.substring(0,9), pesoCPF);
        Integer digito2 = calcularDigito(cpf.substring(0,9) + digito1, pesoCPF);
        return cpf.equals(cpf.substring(0,9) + digito1.toString() + digito2.toString());
    }
    
    private static String padLeft(String text, char character) {
        return String.format("%11s", text).replace(' ', character);
    }
        
    public boolean validaEmail() throws ValidatorException {	
	String digitado = c_email.getText();
	Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
	Matcher m = p.matcher(digitado);
	boolean matchFound = m.matches();

	if (!matchFound) {
            return false;						
	}
        return true;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMedico().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_consulta;
    private javax.swing.JButton b_incluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JFormattedTextField c_CPF;
    private javax.swing.JTextField c_CRM;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_especialidade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField eIDMedico;
    private javax.swing.JLabel t_CPF;
    private javax.swing.JLabel t_CRM;
    private javax.swing.JLabel t_email;
    private javax.swing.JLabel t_especialidade;
    private javax.swing.JTextField t_nome;
    private javax.swing.JTextField t_titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
