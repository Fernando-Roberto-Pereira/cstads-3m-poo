package LE04.Ex02.src;

public class Conta {
    protected String nome;
    protected String numero;
    protected float saldo;

    public Conta(String nome, String numero, float saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean verificaSaldo(float valor) {
        boolean x = true;
        if (valor > this.saldo) {
            x = false;
        }
        return x;
    }

    public boolean retirar(float valor) {
        boolean x = false;
        if (this.verificaSaldo(valor)) {
            this.saldo -= valor;
            x = true;
        }
        return x;
    }

    public String mostraConta() {
        return String.format("Nome: %s | Número: %s | Saldo: %f", this.nome, this.numero, this.saldo);
    }
}
