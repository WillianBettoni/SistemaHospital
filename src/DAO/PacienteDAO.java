package DAO;

import Conexao.Hibernate;
import Tabelas.Paciente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.JOptionPane;

public class PacienteDAO {

    //Método de Incluir pacientes
    public void incluir(Paciente paciente) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(paciente);
            transacao.commit();
            JOptionPane.showMessageDialog(null, "Paciente incluido com sucesso.");
        } catch (HibernateException e) {
            System.out.println("Não foi possível inserir o paciente. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de insersão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de edição de pacientes
    public void update(Paciente paciente) {
        Session session = null;
        Transaction transaction;

        try {
            session = Hibernate.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(paciente);
            transaction.commit();
            JOptionPane.showMessageDialog(null, "Paciente alterado com sucesso.");
        } catch (HibernateException e) {
            System.out.println(" !!! Não foi possível alterar o paciente. Erro: " + e.getMessage());
        } finally {
            try {
                session.close();
            } catch (Throwable e) {
                System.out.println(" !!! Erro ao fechar operação update. Mensagem: " + e.getMessage());
            }
        }
    }
    
    public List<Paciente> RetornarPacienteSelec(String texto, int indiceSelec){
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Paciente> resultado = null;
        String cpf;

        sessao = Hibernate.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if(indiceSelec==0){
            consulta = sessao.createQuery("from Paciente pac where pac.nome like ?");
            consulta.setString(0, "%" + texto + "%");
        }else{
            cpf = "";
            if(texto != null){
                cpf = texto;
            }
            consulta = sessao.createQuery("from Paciente pac where pac.numCPF like ?");
            consulta.setString(0, "%" + cpf + "%");
        }
        
        resultado = consulta.list();
        transacao.commit();        
        sessao.close();
        return resultado;
    }

    //Método de Remover pacientes
    public void excluir(Paciente paciente) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.delete(paciente);
            transacao.commit();
        } catch (HibernateException e) {
            System.out.println("Não foi possível excluir o paciente. Erro: " + e.getMessage());
        } finally {
            try {
                sessao.close();
            } catch (Throwable e) {
                System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
            }
        }
    }

    // Método de Listar pacientes
    public List<Paciente> listar() {
        Session sessao = null;
        Transaction transacao = null;
        Query consulta = null;
        List<Paciente> resultado = null;

        try {
            sessao = Hibernate.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            consulta = sessao.createQuery("from Paciente");
            resultado = consulta.list();
            transacao.commit();
            return resultado;
        } catch (HibernateException e) {
            System.out.println("Não foi possível selecionar os pacientes. Erro: " + e.getMessage());
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
