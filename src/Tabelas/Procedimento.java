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
@Table(name = "Procedimento")

public class Procedimento {

    @Id
    @GeneratedValue
    @Column(name = "idProcedimento")
    private int idProcedimento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idFuncionario", nullable = false)
    private Funcionario idFuncionario;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProntuario", nullable = false)
    private Prontuario idProntuario;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idMedicamento", nullable = true)
    private Medicamento idMedicamento;
    
    @Column(name = "dataInicial", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    
    @Column(name = "dataFinal", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    @Column(name = "observacao", length = 45, nullable = true)
    private String observacao;
    
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;

    // Construtores
    public Procedimento(int idProcedimento, Funcionario idFuncionario, Medicamento idMedicamento, Date dataInicial, Date dataFinal, String observacao, String descricao) {
        this.idProcedimento = idProcedimento;
        this.idFuncionario = idFuncionario;
        this.idMedicamento = idMedicamento;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.observacao = observacao;   
        this.descricao = descricao;
    }

    public Procedimento() {
    }

    public int getIdProcedimento() {
        return idProcedimento;
    }

    public void setIdProcedimento(int idProcedimento) {
        this.idProcedimento = idProcedimento;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Medicamento getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Medicamento idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
    
    public Prontuario getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(Prontuario idProntuario) {
        this.idProntuario = idProntuario;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
