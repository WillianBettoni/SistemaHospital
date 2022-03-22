package DAO;

import Conexao.Hibernate;
import Tabelas.Diagnostico;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class DiagnosticoDAO {

    //Método de Incluir diagnósticos
    public void incluir(Diagnostico diagnostico) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(diagnostico);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Diagnóstico incluído com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o diagnóstico. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de diagnósticos
    public void update(Diagnostico diagnostico) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(diagnostico);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Diagnóstico alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o diagnóstico. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Diagnostico> RetornarDiagnosticoSelec(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Diagnostico> resultado = null;
        
        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();       
        consulta = sessao.createQuery("select diag " +
                                      "from Diagnostico diag, Doenca doe " +
                                      "where diag.idDoenca = doe.idDoenca and doe.nome like ?");
        consulta.setString(0, "%" + texto + "%");
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover diagnostico
    public void excluir(Diagnostico diagnostico) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(diagnostico);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o diagnóstico. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar diagnósticos
    public List<Diagnostico> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Diagnostico> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Diagnostico");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os diagnósticos. Erro: " + e.getMessage());
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
