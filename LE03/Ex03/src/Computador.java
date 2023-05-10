package LE03.Ex03.src;

import java.util.ArrayList;

public class Computador {
	private String modelo;
	private String marca;
	private ArrayList<Periferico> alPeriferico = new ArrayList<Periferico>(); 
	private PlacaMae placaMae;

	public Computador(String modelo, String marca, PlacaMae placaMae) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.placaMae = placaMae;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public ArrayList<Periferico> getAlPeriferico() {
		return alPeriferico;
	}

	public void setAlPeriferico(ArrayList<Periferico> alPeriferico) {
		this.alPeriferico = alPeriferico;
	}

	public PlacaMae getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}
	
	public int qtdsPeriferico() {
		return this.alPeriferico.size();
	}
}
