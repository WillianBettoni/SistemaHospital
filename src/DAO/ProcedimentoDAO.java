package DAO;

import Conexao.Hibernate;
import Tabelas.Procedimento;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class ProcedimentoDAO {

    //Método de Incluir procedimentos
    public void incluir(Procedimento proc) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(proc);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Procedimento incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o procedimento. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de procedimentos
    public void update(Procedimento proc) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(proc);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Procedimento alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o procedimento. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Procedimento> RetornarProcedimentoSelec(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Procedimento> resultado = null;
        
        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();       
        consulta = sessao.createQuery("from Procedimento proc where proc.descricao like ?");
        consulta.setString(0, "%" + texto + "%");
       
        
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover procedimentos
    public void excluir(Procedimento proc) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(proc);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o procedimento. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar procedimentos
    public List<Procedimento> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Procedimento> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Procedimento");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os procedimentos. Erro: " + e.getMessage());
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
