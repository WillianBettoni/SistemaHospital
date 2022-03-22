package DAO;

import Conexao.Hibernate;
import Tabelas.Medicamento;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class MedicamentoDAO {

    //Método de Incluir Medicamento
    public void incluir(Medicamento medicamento) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(medicamento);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Registro incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o medicamento. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição do medicamento
    public void update(Medicamento medicamento) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(medicamento);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Medicamento alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o medicamento. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Medicamento> retornarMedicamento(String texto){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Medicamento> resultado = null;
        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        consulta = sessao.createQuery("from Medicamento med where med.nome like ?");
        consulta.setString(0, "%" + texto + "%");
        resultado = consulta.list();
        transacao.commit();
        sessao.close();
        return resultado;
    }

    //Método de Remover Medicamentos
    public void excluir(Medicamento medicamento) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(medicamento);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o medicamento. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar Medicamentos
    public List<Medicamento> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Medicamento> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Medicamento");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar medicamentoS. Erro: " + e.getMessage());
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
