
package br.com.objetos;

import java.util.List;


public class Consulta {
   private Triagem triangem;
   private Medico medico;
   private List<String> medicamentos;
   private String diagnostico;
   private Boolean atestado;
   private int codigoDiagnostico;

    public Consulta(Triagem triangem, Medico medico, List<String> medicamentos, String diagnostico, Boolean atestado, int codigoDiagnostico) {
        this.triangem = triangem;
        this.medico = medico;
        this.medicamentos = medicamentos;
        this.diagnostico = diagnostico;
        this.atestado = atestado;
        this.codigoDiagnostico = codigoDiagnostico;
    }

    public Triagem getTriangem() {
        return triangem;
    }

    public void setTriangem(Triagem triangem) {
        this.triangem = triangem;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Boolean getAtestado() {
        return atestado;
    }

    public void setAtestado(Boolean atestado) {
        this.atestado = atestado;
    }

    public int getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    public void setCodigoDiagnostico(int codigoDiagnostico) {
        this.codigoDiagnostico = codigoDiagnostico;
    }

    @Override
    public String toString() {
        return "Consulta{" + "triangem=" + triangem + ", medico=" + medico + ", medicamentos=" + medicamentos + ", diagnostico=" + diagnostico + ", atestado=" + atestado + ", codigoDiagnostico=" + codigoDiagnostico + '}';
    }
    
    
}
