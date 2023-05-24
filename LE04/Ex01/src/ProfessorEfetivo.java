package LE04.Ex01.src;

public class ProfessorEfetivo extends Professor {
    private double salario;

    public ProfessorEfetivo(String nome, String matricula, int idade, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
