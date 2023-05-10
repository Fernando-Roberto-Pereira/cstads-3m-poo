package LE03.Ex03.src;

public class Fonte {
	private double tensao;
	private double corrente;
	private String marca;
	
	public Fonte(double tensao, double corrente, String marca) {
		super();
		this.tensao = tensao;
		this.corrente = corrente;
		this.marca = marca;
	}

	public double getTensao() {
		return tensao;
	}

	public void setTensao(double tensao) {
		this.tensao = tensao;
	}

	public double getCorrente() {
		return corrente;
	}

	public void setCorrente(double corrente) {
		this.corrente = corrente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
