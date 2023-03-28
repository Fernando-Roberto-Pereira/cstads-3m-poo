package LE02.Ex02.src;

public class Receita {
	private String nome;
	private String descricao;
	private int numeroPorcoes;
	private double custoReceita;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNumeroPorcoes() {
		return numeroPorcoes;
	}
	public void setNumeroPorcoes(int numeroPorcoes) {
		this.numeroPorcoes = numeroPorcoes;
	}
	public double getCustoReceita() {
		return custoReceita;
	}
	public void setCustoReceita(double custoReceita) {
		this.custoReceita = custoReceita;
	}
	
	public double custoPorcao() {
		return (this.custoReceita / this.numeroPorcoes);
	}
}
