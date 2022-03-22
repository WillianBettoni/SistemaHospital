package Telas;

import DAO.FuncionarioDAO;
import DAO.TipoFuncionarioDAO;
import Tabelas.Funcionario;
import Tabelas.TipoFuncionario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import sun.security.validator.ValidatorException;

public class TelaFuncionario extends javax.swing.JFrame {

    public TelaFuncionario() {
        initComponents();
        carregaCombo(0);
        eIDFuncionario.setVisible(false);
        c_nome.requestFocus();
    }
    
    public TelaFuncionario(Funcionario funcionario) {
        initComponents();
        c_nome.setText(funcionario.getNome());
        c_data.setDate(funcionario.getDataNascimento());
        c_CPF.setText(funcionario.getNumCPF());
        c_email.setText(funcionario.getEmail());
        eIDFuncionario.setText(String.valueOf(funcionario.getIdFuncionario()));
        eIDFuncionario.setVisible(false);
        c_nome.requestFocus();       
        carregaCombo(funcionario.getIdTipoFuncionario().getIdTipoFuncionario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        t_titulo = new javax.swing.JTextField();
        t_nome = new javax.swing.JTextField();
        t_data = new javax.swing.JTextField();
        t_tipo = new javax.swing.JTextField();
        c_nome = new javax.swing.JTextField();
        cb_tipoFuncionario = new javax.swing.JComboBox<>();
        b_incluir = new javax.swing.JButton();
        b_consulta = new javax.swing.JButton();
        eIDFuncionario = new javax.swing.JTextField();
        c_data = new com.toedter.calendar.JDateChooser();
        c_email = new javax.swing.JTextField();
        t_CPF = new javax.swing.JLabel();
        t_email = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        c_CPF = new javax.swing.JFormattedTextField();

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        t_titulo.setEditable(false);
        t_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        t_titulo.setText("FUNCIONÁRIOS");
        t_titulo.setBorder(null);

        t_nome.setEditable(false);
        t_nome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_nome.setText("Nome");
        t_nome.setBorder(null);

        t_data.setEditable(false);
        t_data.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_data.setText("Data Nascimento");
        t_data.setBorder(null);

        t_tipo.setEditable(false);
        t_tipo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        t_tipo.setText("Tipo");
        t_tipo.setBorder(null);

        c_nome.setNextFocusableComponent(c_CPF);
        c_nome.setPreferredSize(new java.awt.Dimension(6, 23));
        c_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_nomeKeyTyped(evt);
            }
        });

        cb_tipoFuncionario.setNextFocusableComponent(c_data);

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

        eIDFuncionario.setEnabled(false);

        c_data.setNextFocusableComponent(c_email);

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
        c_CPF.setNextFocusableComponent(cb_tipoFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(eIDFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_CPF)
                            .addComponent(c_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_tipoFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_data, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(c_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(b_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_email)
                            .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eIDFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_CPF)
                    .addComponent(t_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_tipoFuncionario)
                    .addComponent(c_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c_CPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_incluir)
                    .addComponent(b_consulta)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_incluirActionPerformed
        Funcionario funcionario = new Funcionario();

        try {
            if (fazVerificacoes()) {
                funcionario.setNome(c_nome.getText());
                funcionario.setNumCPF(c_CPF.getText());
                funcionario.setEmail(c_email.getText());
                funcionario.setDataNascimento(c_data.getDate());
                TipoFuncionario tipo = (TipoFuncionario) cb_tipoFuncionario.getSelectedItem();
                funcionario.setIdTipoFuncionario(tipo);
                if ((eIDFuncionario.getText().isEmpty()) || (Integer.parseInt(eIDFuncionario.getText()) == 0)) {
                    FuncionarioDAO funcDAO = new FuncionarioDAO();
                    funcDAO.incluir(funcionario);
                    limparCampos();
                } else {
                    FuncionarioDAO alterar = new FuncionarioDAO();
                    funcionario.setIdFuncionario(Integer.parseInt(eIDFuncionario.getText()));
                    alterar.update(funcionario);
                    limparCampos();
                }
            }
        } catch (ValidatorException ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_incluirActionPerformed

    private void b_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_consultaActionPerformed
        TelaListarFuncionarios funcionarios = null;
        try {
            funcionarios = new TelaListarFuncionarios();
        } catch (SQLException ex) {
            Logger.getLogger(TelaListarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        funcionarios.setVisible(true);
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

    private boolean fazVerificacoes() throws ValidatorException {
        if (c_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome do funcionário!");
            c_nome.requestFocus();
            return false;
        };
        String cpf = c_CPF.getText(); 
        cpf = cpf.trim().replace(".", "").replace("-", "");
        if (cpf.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o CPF do funcionário!");
            c_CPF.requestFocus();
            return false;
        }
        if(cb_tipoFuncionario.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "Não há tipos de funcionários cadastrados, verifique!");
            cb_tipoFuncionario.requestFocus();
            return false;
        }
        if (c_data.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Informe a data de nascimento do funcionário!");
            c_data.requestFocus();
            return false;
        }
        if (c_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o e-mail do funcionário!");
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
        eIDFuncionario.setText(null);
        c_data.setDate(null);
        c_nome.setText(null);
        c_CPF.setText(null);
        cb_tipoFuncionario.setSelectedIndex(0);
        c_email.setText(null);
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
                new TelaFuncionario().setVisible(true);
            }
        });
    }
    
    private void carregaCombo(int idTipoFunc){        
        TipoFuncionarioDAO funcDAO = new TipoFuncionarioDAO();
        List<Tabelas.TipoFuncionario> funcList = new ArrayList<>();
        funcList = funcDAO.listar();
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_tipoFuncionario.getModel();
        comboModel.removeAllElements();
        for (Tabelas.TipoFuncionario p : funcList) {
            comboModel.addElement(p);
            if(idTipoFunc == p.getIdTipoFuncionario()){
                cb_tipoFuncionario.setSelectedItem(p);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_consulta;
    private javax.swing.JButton b_incluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JFormattedTextField c_CPF;
    private com.toedter.calendar.JDateChooser c_data;
    private javax.swing.JTextField c_email;
    private javax.swing.JTextField c_nome;
    private javax.swing.JComboBox<String> cb_tipoFuncionario;
    private javax.swing.JTextField eIDFuncionario;
    private javax.swing.JLabel t_CPF;
    private javax.swing.JTextField t_data;
    private javax.swing.JLabel t_email;
    private javax.swing.JTextField t_nome;
    private javax.swing.JTextField t_tipo;
    private javax.swing.JTextField t_titulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
