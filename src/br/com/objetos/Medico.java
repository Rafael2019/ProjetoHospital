package br.com.objetos;

public class Medico {

    private int cmr;
    private String especialidade, setor;

    public Medico(int cmr, String especialidade, String setor) {
        this.cmr = cmr;
        this.especialidade = especialidade;
        this.setor = setor;
    }

    public int getCmr() {
        return cmr;
    }

    public void setCmr(int cmr) {
        this.cmr = cmr;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Medico{" + "cmr=" + cmr + ", especialidade=" + especialidade + ", setor=" + setor + '}';
    }
    
}
