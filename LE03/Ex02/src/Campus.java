package LE03.Ex02.src;

import java.util.ArrayList;

public class Campus {
	private String nome;
	private String endereco;
	private ArrayList<Professor> alProfessor = new ArrayList<Professor>();
	private ArrayList<Departamento> alDepartamento = new ArrayList<Departamento>();
	
	public Campus(String nome, String endereco, Departamento departamento) {
		this.nome = nome;
		this.endereco = endereco;
		this.alDepartamento.add(departamento);
	}
	
	public void adicionaProfessor(Professor professor) {
		this.alProfessor.add(professor);
	}
		
	public void adicionaDepartamento(Departamento departamento) {
		this.alDepartamento.add(departamento);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int calcDepartamento() {
		return this.alDepartamento.size();
	}
	
	public int calcProfessor() {
		return this.alProfessor.size();
	}
}
