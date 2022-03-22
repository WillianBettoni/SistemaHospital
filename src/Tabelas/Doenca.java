package Tabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doenca")

public class Doenca {

    @Id
    @GeneratedValue
    @Column(name = "idDoenca")
    private int idDoenca;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    // Construtores
    public Doenca(int idDoenca, String nomeDoenca) {
        this.idDoenca = idDoenca;
        this.nome = nomeDoenca;       
    }

    public Doenca() {
    }

    public int getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(int idDoenca) {
        this.idDoenca = idDoenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return this.idDoenca + " - " + this.getNome();
    } 

}
