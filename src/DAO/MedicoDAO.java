package DAO;

import Conexao.Hibernate;
import Tabelas.Medico;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class MedicoDAO {

    //Método de Incluir medicos
    public void incluir(Medico medico) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(medico);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Médico incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o médico. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de medicos
    public void update(Medico medico) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(medico);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Médico alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o médico. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Medico> RetornarMedicoSelec(String texto, int indiceSelec){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Medico> resultado = null;
        String cpf;

        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if(indiceSelec==0){
            consulta = sessao.createQuery("from Medico med where med.nome like ?");
            consulta.setString(0, "%" + texto + "%");
        }else{
            cpf = "";
            if(texto != null){
                cpf = texto;
            }
            consulta = sessao.createQuery("from Medico med where med.numCPF like ?");
            consulta.setString(0, "%" + cpf + "%");
        }
        
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover médicos
    public void excluir(Medico medico) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(medico);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o médico. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar médicos
    public List<Medico> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Medico> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Medico");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os médicos. Erro: " + e.getMessage());
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
