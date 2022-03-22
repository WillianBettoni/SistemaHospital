package Tabelas;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Paciente")

public class Paciente {

    @Id
    @GeneratedValue
    @Column(name = "idPaciente")
    private int idPaciente;

    @Column(name = "dataNascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "nome", length = 180, nullable = false)
    private String nome;

    @Column(name = "numCPF", length = 15, nullable = false)
    private String numCPF;

    @Column(name = "email", length = 45, nullable = false)
    private String email;

    // Construtores
    public Paciente(int idPaciente, Date dataNasc, String nome, String numCPF, String email) {
        this.idPaciente = idPaciente;
        this.dataNascimento = dataNasc;
        this.nome = nome;
        this.numCPF = numCPF;
        this.email = email;
    }

    public Paciente() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumCPF() {
        return numCPF;
    }

    public void setNumCPF(String numCPF) {
        this.numCPF = numCPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.idPaciente + " - " + this.nome;
    }
    
}
