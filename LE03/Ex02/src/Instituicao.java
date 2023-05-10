package LE03.Ex02.src;

import java.util.ArrayList;

public class Instituicao {
	private String nome;
	private String sigla;
	private ArrayList<Campus> alCampus = new ArrayList<Campus>();
	
	public Instituicao(String nome, String sigla, String nomeCampus, String enderecoCampus, Departamento  departamento) {
		this.nome = nome;
		this.sigla = sigla;
		this.alCampus.add(new Campus(nomeCampus, enderecoCampus, departamento));
	}

	public void adicionaCampus(String nome, String endereco, Departamento departamento) {
		this.alCampus.add(new Campus(nome, endereco, departamento));
	}
	
	public ArrayList<Campus> getAlCampus() {
		return alCampus;
	}

	public void setAlCampus(ArrayList<Campus> alCampus) {
		this.alCampus = alCampus;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
