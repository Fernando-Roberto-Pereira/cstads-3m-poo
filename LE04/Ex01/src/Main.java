package LE04.Ex01.src;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog(null, "Nome:");
        String matricula = JOptionPane.showInputDialog(null, "Matricula:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:"));
        
        Professor p = new Professor();
        p.setNome(nome);
        p.setMatricula(matricula);
        p.setIdade(idade);

        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário:"));
        ProfessorEfetivo pe = new ProfessorEfetivo(nome, matricula, idade, salario);

        double minutosTrabalhados = Double.parseDouble(JOptionPane.showInputDialog(null, "Minutos trabalhados:"));
        double valorMinuto = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do minuto:"));

        ProfessorHorista ph = new ProfessorHorista(nome, matricula, idade, minutosTrabalhados, valorMinuto);

    }
}
