package LE03.Ex03.src;

public class Processador {
	private String modelo;
	private double frequencia;
	private double cache;
	
	public Processador(String modelo, double frequencia, double cache) {
		super();
		this.modelo = modelo;
		this.frequencia = frequencia;
		this.cache = cache;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	public double getCache() {
		return cache;
	}

	public void setCache(double cache) {
		this.cache = cache;
	}
}
