package DAO;

import Conexao.Hibernate;
import Tabelas.Quarto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class QuartoDAO {

    //Método de Incluir quartos
    public void incluir(Quarto quarto) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(quarto);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Quarto incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o quarto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de quartos
    public void update(Quarto quarto) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(quarto);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Quarto alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o quarto. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Quarto> RetornarQuartoSelec(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Quarto> resultado = null;

        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        consulta = sessao.createQuery("from Quarto quarto where quarto.descricao like ?");
        consulta.setString(0, "%" + texto + "%");        
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover quartos
    public void excluir(Quarto quarto) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(quarto);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o quarto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar quartos
    public List<Quarto> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Quarto> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Quarto");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os quartos. Erro: " + e.getMessage());
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
