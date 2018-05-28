package br.com.objetos;

import java.util.List;

public class Triagem {

    private Enfermeira enfermeira;
    private Paciente paciente;
    private String pressao, sintoma;
    private float temperatura, peso, altura,IMC;
    private List<String> alergia;
    private Boolean febre;

    public Triagem(Enfermeira enfermeira, Paciente paciente, String pressao, String sintoma, float temperatura, float peso, float altura, float IMC, List<String> alergia, Boolean febre) {
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.pressao = pressao;
        this.sintoma = sintoma;
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
        this.alergia = alergia;
        this.febre = febre;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public List<String> getAlergia() {
        return alergia;
    }

    public void setAlergia(List<String> alergia) {
        this.alergia = alergia;
    }

    public Boolean getFebre() {
        return febre;
    }

    public void setFebre(Boolean febre) {
        this.febre = febre;
    }

    @Override
    public String toString() {
        return "Triagem{" + "enfermeira=" + enfermeira + ", paciente=" + paciente + ", pressao=" + pressao + ", sintoma=" + sintoma + ", temperatura=" + temperatura + ", peso=" + peso + ", altura=" + altura + ", IMC=" + IMC + ", alergia=" + alergia + ", febre=" + febre + '}';
    }

}
