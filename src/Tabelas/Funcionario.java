package Tabelas;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Funcionario")

public class Funcionario {

    @Id
    @GeneratedValue
    @Column(name = "idFuncionario")
    private int idFuncionario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idTipoFuncionario", nullable = false)
    private TipoFuncionario idTipoFuncionario;

    @Column(name = "dataNascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "numCPF", length = 45, nullable = false)
    private String numCPF;

    @Column(name = "email", length = 45, nullable = false)
    private String email;

    // Construtores
    public Funcionario(int idFuncionario, TipoFuncionario idTipoFunc, Date dataNasc, String nome, String numCPF, String email) {
        this.idFuncionario = idFuncionario;
        this.idTipoFuncionario = idTipoFunc;
        this.dataNascimento = dataNasc;
        this.nome = nome;
        this.numCPF = numCPF;
        this.email = email;
    }

    public Funcionario() {
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public TipoFuncionario getIdTipoFuncionario() {
        return idTipoFuncionario;
    }

    public void setIdTipoFuncionario(TipoFuncionario idTipoFuncionario) {
        this.idTipoFuncionario = idTipoFuncionario;
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
        return this.idFuncionario + " - " + this.nome;
    }
    
}
