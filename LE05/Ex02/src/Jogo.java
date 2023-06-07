package LE05.Ex02.src;

public abstract class Jogo implements Play {
    protected double velocidade;
    protected double altura;
    protected double forca;
    @Override
    public void andar(double velocidade) {
        this.velocidade = velocidade;
    }
    @Override
    public void pular(double altura) {
        this.altura = altura;
    }
    @Override
    public void chutar(double forca) {
        this.forca = forca;
    }
    protected abstract String caracteristica();

    public void mostraStatus() {
        System.out.println(String.format("Velocidade: %.2f | Altura: %.2f | Força: %.2f | Característica: %s", this.velocidade, this.altura, this.forca, this.caracteristica()));
    }
} 
