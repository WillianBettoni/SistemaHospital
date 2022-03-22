package DAO;

import Conexao.Hibernate;
import Tabelas.Leito;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class LeitoDAO {

    //Método de Incluir leitos
    public void incluir(Leito leito) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(leito);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Leito incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o leito. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de leitos
    public void update(Leito leito) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(leito);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Leito alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o leito. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Leito> RetornarLeitoSelec(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Leito> resultado = null;

        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        consulta = sessao.createQuery("from Leito leito where leito.descricao like ?");
        consulta.setString(0, "%" + texto + "%");        
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover leitos
    public void excluir(Leito leito) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(leito);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o leito. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar leitos
    public List<Leito> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Leito> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Leito");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os leitos. Erro: " + e.getMessage());
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
