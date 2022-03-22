package DAO;

import Conexao.Hibernate;
import Tabelas.Funcionario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    //Método de Incluir funcionários
    public void incluir(Funcionario funcionario) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(funcionario);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Funcionário incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o funcionário. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de funcionários
    public void update(Funcionario funcionario) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(funcionario);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o funcionário. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Funcionario> RetornarFuncionarioSelec(String texto, int indiceSelec){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Funcionario> resultado = null;
        String cpf;

        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if(indiceSelec==0){
            consulta = sessao.createQuery("from Funcionario func where func.nome like ?");
            consulta.setString(0, "%" + texto + "%");
        }else{
            cpf = "";
            if(texto != null){
                cpf = texto;
            }
            consulta = sessao.createQuery("from Funcionario func where func.numCPF like ?");
            consulta.setString(0, "%" + cpf + "%");
        }
        
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover funcionários
    public void excluir(Funcionario funcionario) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(funcionario);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o funcionário. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar funcionários
    public List<Funcionario> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Funcionario> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Funcionario");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os funcionários. Erro: " + e.getMessage());
            throw new HibernateException(e);
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação listar. Mensagem: " + e.getMessage());
            }
        }
    }
}
