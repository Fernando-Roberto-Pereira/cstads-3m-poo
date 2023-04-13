package AP01.Ex02.src;

import java.util.ArrayList;

public class Time {
	private String nome;

	public Time(String nome, Pessoa pessoa) {
		this.nome = nome;
		this.alPessoa.add(pessoa);
	}

	private ArrayList<Pessoa> alPessoa = new ArrayList<Pessoa>();

	public void setPessoa(Pessoa pessoa) {
		this.alPessoa.add(pessoa);
	}

	public void exibeParticipantes() {
		System.out.println("Time: " + this.nome);
		for (Pessoa pessoa: alPessoa) {
			System.out.println("Nome: " + pessoa.getNome() + " | Endereço de memória: " + pessoa);
		}
	}
}
