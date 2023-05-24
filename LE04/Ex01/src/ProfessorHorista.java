package LE04.Ex01.src;

public class ProfessorHorista extends Professor {
    private double minutosTrabalhados;
    private double valorMinuto;
    
    public ProfessorHorista(String nome, String matricula, int idade, double minutosTrabalhados, double valorMinuto) {
        this.nome = nome;
        this.matricula = matricula;
        this.minutosTrabalhados = minutosTrabalhados;
        this.valorMinuto = valorMinuto;
    }

    public double getMinutosTrabalhados() {
        return minutosTrabalhados;
    }
    public void setMinutosTrabalhados(double minutosTrabalhados) {
        this.minutosTrabalhados = minutosTrabalhados;
    }
    public double getValorMinutos() {
        return valorMinuto;
    }
    public void setValorMinutos(double valorMinutos) {
        this.valorMinuto = valorMinutos;
    }

    public double valorSalario() {
        return this.minutosTrabalhados * this.valorMinuto;
    }
}
