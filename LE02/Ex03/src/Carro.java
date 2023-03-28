package LE02.Ex03.src;

public class Carro {
	private boolean ligado = false;
	private byte marcha = 1;
	private String marca;
	private String modelo;
	private double motorizacao;
	
	public Carro(String marca, String modelo, double motorizacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.motorizacao = motorizacao;
	}
	
	public void ligarCarro() {
		this.ligado = true;
	}
	
	public void desligarCarro() {
		this.ligado = false;
	}

	public boolean getLigado() {
		return ligado;
	}

	public byte getMarcha() {
		return marcha;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(double motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void adicionarMarcha() {
		if (this.marcha < 5) {
			this.marcha++;
		}
	}

	public void reduzirMarcha() {
		if (this.marcha > 0) {
			this.marcha--;
		}
	}

	public double velocidade() {
		double v = 0.0; 
		if (this.ligado) {
			v = ((10.0 + (this.marcha * this.motorizacao)) * Math.random());
		}
		return v; 
	}
}
