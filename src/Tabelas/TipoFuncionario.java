package Tabelas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoFuncionario")

public class TipoFuncionario {

    @Id
    @GeneratedValue
    @Column(name = "idTipoFuncionario")
    private int idTipoFuncionario;

    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;

    // Construtores
    public TipoFuncionario(int idTipoFuncionario, String descricao) {
        this.idTipoFuncionario = idTipoFuncionario;
        this.descricao = descricao;       
    }

    public TipoFuncionario() {
    }

    public int getIdTipoFuncionario() {
        return idTipoFuncionario;
    }

    public void setIdTipoFuncionario(int idTipoFuncionario) {
        this.idTipoFuncionario = idTipoFuncionario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return this.idTipoFuncionario + " - " + this.descricao;
    }
}
