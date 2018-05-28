package br.com.objetos;


public class Paciente {

    private int id, numeroSus;
    private Pessoa responsavel;

    public Paciente(int id, int numeroSus, Pessoa responsavel) {
        this.id = id;
        this.numeroSus = numeroSus;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", numeroSus=" + numeroSus + ", responsavel=" + responsavel + '}';
    }

}
