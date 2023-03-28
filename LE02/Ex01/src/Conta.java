package LE02.Ex01.src;

public class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	private String titular;
	
	public Conta(int numero, int agencia, double saldo, String titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void retirada(double valor) {
		this.saldo -= valor;
	}
	
	public void mostraConta() {
		System.out.println("Número da conta: " + String.valueOf(this.numero));
		System.out.println("Número da agência: " + String.valueOf(this.agencia));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("Nome do titular: " + String.valueOf(this.titular)+"\n");
	}
}
