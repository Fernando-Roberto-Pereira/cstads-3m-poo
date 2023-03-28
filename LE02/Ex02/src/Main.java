package LE02.Ex02.src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Obtem dados do terminal
		Scanner s = new Scanner(System.in);
		
		// Cria um objeto da classe Receita
		System.out.println("-- Entrada | Objeto UM");
		Receita r1 = new Receita();
		System.out.print("Nome da receita: ");
		r1.setNome(s.next());
		System.out.print("Descrição: ");
		r1.setDescricao(s.next());
		System.out.print("Número de porções: ");
		r1.setNumeroPorcoes(s.nextInt());
		System.out.print("Custo da receita: ");
		r1.setCustoReceita(s.nextDouble());
		System.out.println("** Saída");
		System.out.println("Nome da receita: " + r1.getNome());
		System.out.println("Descrição: " + r1.getDescricao());
		System.out.println("Número de porções: " + String.valueOf(r1.getNumeroPorcoes()));
		System.out.println(String.format("Custo da receita: %.2f", r1.getCustoReceita()));
		System.out.println(String.format("Custo por porção: %.2f", r1.custoPorcao()));
		r1 = null;
		
		// Cria um objeto da classe Receita
		System.out.println("-- Entrada | Objeto DOIS");
		Receita r2 = new Receita();
		System.out.print("Nome da receita: ");
		r2.setNome(s.next());
		System.out.print("Descrição: ");
		r2.setDescricao(s.next());
		System.out.print("Número de porções: ");
		r2.setNumeroPorcoes(s.nextInt());
		System.out.print("Custo da receita: ");
		r2.setCustoReceita(s.nextDouble());
		System.out.println("** Saída");
		System.out.println("Nome da receita: " + r2.getNome());
		System.out.println("Descrição: " + r2.getDescricao());
		System.out.println("Número de porções: " + String.valueOf(r2.getNumeroPorcoes()));
		System.out.println(String.format("Custo da receita: %.2f", r2.getCustoReceita()));
		System.out.println(String.format("Custo por porção: %.2f", r2.custoPorcao()));
		r2 = null;
	}

}
