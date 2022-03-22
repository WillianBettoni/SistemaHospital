package DAO;

import Conexao.Hibernate;
import Tabelas.Prontuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class ProntuarioDAO {

    //Método de Incluir prontuarios
    public void incluir(Prontuario prontuario) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(prontuario);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Prontuário incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o prontuário. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de Prontuário
    public void update(Prontuario prontuario) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(prontuario);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Prontuário alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o prontuário. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Prontuario> RetornarProntuarioSelec(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Prontuario> resultado = null;
        
        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();       
        consulta = sessao.createQuery("select pront " +
                                      "from Prontuario pront, Paciente pac " +
                                      "where pront.idPaciente = pac.idPaciente and pac.nome like ?");
        consulta.setString(0, "%" + texto + "%");  
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover prontuários
    public void excluir(Prontuario prontuario) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(prontuario);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o prontuário. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar prontuários
    public List<Prontuario> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Prontuario> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Prontuario");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os prontuários. Erro: " + e.getMessage());
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
