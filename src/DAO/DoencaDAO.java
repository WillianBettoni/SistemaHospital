package DAO;

import Conexao.Hibernate;
import Tabelas.Doenca;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class DoencaDAO {

    //Método de Incluir Doenças
    public void incluir(Doenca doenca) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(doenca);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Registro incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir a doença. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição da Doença
    public void update(Doenca doenca) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(doenca);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Doença alterada com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar a doença. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Doenca> retornarDoenca(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Doenca> resultado = null;
        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        consulta = sessao.createQuery("from Doenca doenca where doenca.nome like ?");
        consulta.setString(0, "%" + texto + "%");
        resultado = consulta.list();
        transacao.commit();
        sessao.close();
        return resultado;
    }

    //Método de Remover Doenças
    public void excluir(Doenca doenca) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(doenca);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir a doença. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar Doenças
    public List<Doenca> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Doenca> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Doenca");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar doenças. Erro: " + e.getMessage());
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
