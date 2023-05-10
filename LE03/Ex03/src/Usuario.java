package LE03.Ex03.src;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<Computador> alComputador = new ArrayList<Computador>();
	
	public Usuario(String nome, Computador computador) {
		super();
		this.nome = nome;
		this.alComputador.add(computador);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Computador> getAlComputador() {
		return alComputador;
	}

	public void setAlComputador(ArrayList<Computador> alComputador) {
		this.alComputador = alComputador;
	}
}
