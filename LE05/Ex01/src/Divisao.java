package LE05.Ex01.src;

public class Divisao implements OperacaoAritmeticaFundamental {
    @Override
    public double calcular(double valorUm, double valorDois) {
        return valorUm / valorDois;
    }
}
