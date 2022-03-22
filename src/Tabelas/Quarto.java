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
@Table(name = "Quarto")

public class Quarto {

    @Id
    @GeneratedValue
    @Column(name = "idQuarto")
    private int idQuarto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idTipoQuarto", nullable = false)
    private TipoQuarto idTipoQuarto;

    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;

    // Construtores
    public Quarto(int idQuarto, TipoQuarto idTipoQuarto, String descricao) {
        this.idQuarto = idQuarto;
        this.idTipoQuarto = idTipoQuarto;
        this.descricao = descricao;
    }

    public Quarto() {
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public TipoQuarto getIdTipoQuarto() {
        return idTipoQuarto;
    }

    public void setIdTipoQuarto(TipoQuarto idTipoQuarto) {
        this.idTipoQuarto = idTipoQuarto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 
    
    @Override
    public String toString() {
        return this.idQuarto + " - " + this.descricao;
    }
}
