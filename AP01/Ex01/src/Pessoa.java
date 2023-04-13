package AP01.Ex01.src;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList<Endereco> alEndereco = new ArrayList<Endereco>();
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.alEndereco.add(endereco);
	}
	public void exibeEnderecos() {
		System.out.println("Pessoa: " + this.nome);
		System.out.println("Endereços:");
		for (int i = 0; i < alEndereco.size(); i++) {
			System.out.println("\t" + alEndereco.get(i).getRua());
		}
		System.out.println("");
	}
	public void adicionaEndereco(Endereco endereco) {
		this.alEndereco.add(endereco);
	}
}
