package DAO;

import Conexao.Hibernate;
import Tabelas.TipoQuarto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class TipoQuartoDAO {

    //Método de Incluir tipoQuarto
    public void incluir(TipoQuarto tipoQuarto) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(tipoQuarto);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Registro de tipo de quarto incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o tipo de quarto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de tipo de quarto
    public void update(TipoQuarto tipoQuarto) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(tipoQuarto);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Tipo de quarto alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o tipo de quarto. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<TipoQuarto> retornarTipo(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<TipoQuarto> resultado = null;
        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        consulta = sessao.createQuery("from TipoQuarto tipo where tipo.nome like ?");
        consulta.setString(0, "%" + texto + "%");
        resultado = consulta.list();
        transacao.commit();
        sessao.close();
        return resultado;
    }

    //Método de Remover Tipo de quarto
    public void excluir(TipoQuarto tipoQuarto) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(tipoQuarto);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o tipo de quarto. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar tipos de quartos
    public List<TipoQuarto> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<TipoQuarto> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from TipoQuarto");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os tipos de quartos. Erro: " + e.getMessage());
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
