package LE04.Ex02.src;

public class ContaEspecial extends Conta {
    private float limite;

    public ContaEspecial(String nome, String numero, float saldo, float limite) {
        super(nome, numero, saldo);
        this.limite  = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public boolean verificaSaldo(float valor) {
        boolean x = true;
        if (valor > (this.saldo + this.limite)) {
            x = false;
        }
        return x;
    }

    public String mostraConta() {
        return String.format("%s | Limite: %f", super.mostraConta(), this.limite);
    }
    
}
