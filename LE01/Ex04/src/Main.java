package LE01.Ex04.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arquivo, conexao;
		float tempo;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Tamanho do arquivo:");
		arquivo = s.nextInt();
		System.out.println("Velocidade da conexão:");
		conexao = s.nextInt();
		tempo = (float) arquivo / (float) conexao;
		System.out.println("Tempo: " + tempo);
	}
}
