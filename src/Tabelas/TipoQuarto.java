package Tabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoQuarto")

public class TipoQuarto {

    @Id
    @GeneratedValue
    @Column(name = "idTipoQuarto")
    private int idTipoQuarto;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    // Construtores
    public TipoQuarto(int idTipoQuarto, String nome) {
        this.idTipoQuarto = idTipoQuarto;
        this.nome = nome;       
    }

    public TipoQuarto() {
    }

    public int getIdTipoQuarto() {
        return idTipoQuarto;
    }

    public void setIdTipoQuarto(int idTipoQuarto) {
        this.idTipoQuarto = idTipoQuarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return this.idTipoQuarto + " - " + this.nome;
    }
}
