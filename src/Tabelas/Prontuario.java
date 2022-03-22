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
@Table(name = "Prontuario")

public class Prontuario {

    @Id
    @GeneratedValue
    @Column(name = "idProntuario")
    private int idProntuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPaciente", nullable = false)
    private Paciente idPaciente;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idLeito", nullable = false)
    private Leito idLeito;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idMedico", nullable = false)
    private Medico idMedico;
    
    @Column(name = "dataEntrada", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    
    @Column(name = "dataAlta", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date dataAlta;


    // Construtores
    public Prontuario(int idProntuario, Paciente idPaciente, Leito idLeito, Medico idMedico, Date dataEntrada, Date dataAlta) {
        this.idProntuario = idProntuario;
        this.idPaciente = idPaciente;
        this.idLeito = idLeito;
        this.idMedico = idMedico;
        this.dataEntrada = dataEntrada;
        this.dataAlta = dataAlta;   
    }

    public Prontuario() {
    }

    public int getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Leito getIdLeito() {
        return idLeito;
    }

    public void setIdLeito(Leito idLeito) {
        this.idLeito = idLeito;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }
    
    @Override
    public String toString() {
        return this.idProntuario + " - Pac: " + this.idPaciente.getNome();
    }   
}
