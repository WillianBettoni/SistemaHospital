package DAO;

import Conexao.Hibernate;
import Tabelas.TipoFuncionario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class TipoFuncionarioDAO {

    //Método de Incluir tipoFuncionario
    public void incluir(TipoFuncionario tipoFunc) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(tipoFunc);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Registro de tipo de funcionário incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o tipo de funcionário. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de tipo de funcionário
    public void update(TipoFuncionario tipoFunc) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(tipoFunc);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Tipo de funcionário alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o tipo de funcionário. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<TipoFuncionario> retornarTipo(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<TipoFuncionario> resultado = null;
        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        consulta = sessao.createQuery("from TipoFuncionario func where func.descricao like ?");
        consulta.setString(0, "%" + texto + "%");
        resultado = consulta.list();
        transacao.commit();
        sessao.close();
        return resultado;
    }

    //Método de Remover Tipo de funcionário
    public void excluir(TipoFuncionario tipoFunc) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(tipoFunc);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o tipo de funcionário. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar tipos de funcionários
    public List<TipoFuncionario> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<TipoFuncionario> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from TipoFuncionario");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os tipos de funcionários. Erro: " + e.getMessage());
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
