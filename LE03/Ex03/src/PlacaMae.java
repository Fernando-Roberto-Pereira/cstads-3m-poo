package LE03.Ex03.src;

import java.util.ArrayList;
import java.util.Iterator;

public class PlacaMae {
	private String modelo;
	private String descricao;
	private ArrayList<Processador> alProcessador = new ArrayList<Processador>();
	private ArrayList<Fonte> alFonte = new ArrayList<Fonte>();
	private ArrayList<PenteMemoria> alPenteMemoria = new ArrayList<PenteMemoria>();
	
	public PlacaMae(String modelo, String descricao, Processador processador, Fonte fonte, PenteMemoria penteMemoria) {
		super();
		this.modelo = modelo;
		this.descricao = descricao;
		this.alProcessador.add(processador);
		this.alFonte.add(fonte);
		this.alPenteMemoria.add(penteMemoria);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Processador> getAlProcessador() {
		return alProcessador;
	}

	public void setAlProcessador(ArrayList<Processador> alProcessador) {
		this.alProcessador = alProcessador;
	}

	public ArrayList<Fonte> getAlFonte() {
		return alFonte;
	}

	public void setAlFonte(ArrayList<Fonte> alFonte) {
		this.alFonte = alFonte;
	}

	public ArrayList<PenteMemoria> getAlPenteMemoria() {
		return alPenteMemoria;
	}

	public void setAlPenteMemoria(ArrayList<PenteMemoria> alPenteMemoria) {
		this.alPenteMemoria = alPenteMemoria;
	}
	
	public int qtdsProcessador() {
		return this.alProcessador.size();
	}

	public int qtdsFonte() {
		return this.alFonte.size();
	}
	
	public int qtdsPenteMemoria() {
		return this.alPenteMemoria.size();
	}
	
	public double qtdsMemoria() {
		double qtds = 0.0;
		for (PenteMemoria penteMemoria : this.alPenteMemoria) {
			qtds += penteMemoria.getQuantidade();
		}
		return qtds;
	}
}
