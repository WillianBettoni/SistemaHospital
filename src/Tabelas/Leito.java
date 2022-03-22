package Tabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Leito")

public class Leito {

    @Id
    @GeneratedValue
    @Column(name = "idLeito")
    private int idLeito;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idQuarto", nullable = false)
    private Quarto idQuarto;

    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;

    // Construtores
    public Leito(int idLeito, Quarto idQuarto, String descricao) {
        this.idLeito = idLeito;
        this.idQuarto = idQuarto;
        this.descricao = descricao;
    }

    public Leito() {
    }

    public int getIdLeito() {
        return idLeito;
    }

    public void setIdLeito(int idLeito) {
        this.idLeito = idLeito;
    }

    public Quarto getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Quarto idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return this.idLeito + " - " + this.descricao;
    }  
}
