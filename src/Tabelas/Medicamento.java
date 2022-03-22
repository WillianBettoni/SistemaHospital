package Tabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medicamento")

public class Medicamento {

    @Id
    @GeneratedValue
    @Column(name = "idMedicamento")
    private int idMedicamento;

    @Column(name = "nome", length = 180, nullable = false)
    private String nome;

    // Construtores
    public Medicamento(int idMedicamento, String nomeMedicamento) {
        this.idMedicamento = idMedicamento;
        this.nome = nomeMedicamento;       
    }

    public Medicamento() {
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return this.idMedicamento + " - " + this.nome;
    }

}
