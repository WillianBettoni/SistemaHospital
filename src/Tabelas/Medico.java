package Tabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medico")

public class Medico {

    @Id
    @GeneratedValue
    @Column(name = "idMedico")
    private int idMedico;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "numCPF", length = 45, nullable = false)
    private String numCPF;

    @Column(name = "email", length = 45, nullable = false)
    private String email;
    
    @Column(name = "CRM", length = 45, nullable = false)
    private String CRM;
    
    @Column(name = "especialidade", length = 45, nullable = false)
    private String especialidade;

    // Construtores
    public Medico(int idMedico, String nome, String numCPF, String email, String CRM, String especialidade) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.numCPF = numCPF;
        this.email = email;
        this.CRM = CRM;
        this.especialidade = especialidade;
    }

    public Medico() {
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return this.idMedico + " - " + this.nome;
    }
    
}
