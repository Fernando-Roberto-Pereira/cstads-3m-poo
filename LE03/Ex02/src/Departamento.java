package LE03.Ex02.src;

import java.util.ArrayList;

public class Departamento {
	private String nome;
	private String local;
	private ArrayList<Curso> alCurso = new ArrayList<Curso>();

	public Departamento(String nome, String local, String codigoCurso, String nomeCurso) {
		this.nome = nome;
		this.local = local;
		this.alCurso.add(new Curso(codigoCurso, nomeCurso));
	}
	
	public void adicionaCurso(String codigo, String nome) {
		this.alCurso.add(new Curso(codigo, nome));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public int calcCurso() {
		return this.alCurso.size();
	}
}
