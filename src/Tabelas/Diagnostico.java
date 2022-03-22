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
@Table(name = "Diagnostico")

public class Diagnostico {

    @Id
    @GeneratedValue
    @Column(name = "idDiagnostico")
    private int idDiagnostico;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idDoenca", nullable = false)
    private Doenca idDoenca;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProntuario", nullable = false)
    private Prontuario idProntuario;
    
    @Column(name = "status", length = 1, nullable = false)
    private String status;
    
    // Construtores
    public Diagnostico(int idDiagnostico, Doenca idDoenca, Prontuario idProntuario, String status) {
        this.idDiagnostico = idDiagnostico;
        this.idDoenca = idDoenca;
        this.idProntuario = idProntuario;
        this.status = status;  
    }

    public Diagnostico() {
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Doenca getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(Doenca idDoenca) {
        this.idDoenca = idDoenca;
    }

    public Prontuario getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(Prontuario idProntuario) {
        this.idProntuario = idProntuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 
    @Override
    public String toString() {
        return this.idDiagnostico + " - Doença: " + this.idDoenca.getNome();
    }   
}
