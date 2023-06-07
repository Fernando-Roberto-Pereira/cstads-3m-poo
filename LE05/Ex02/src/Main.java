package LE05.Ex02.src;

public class Main {
    public static void main(String[] args) {
        Futebol f = new Futebol();
        f.andar(10.0);
        f.pular(0.3);
        f.chutar(1.4);
        f.mostraStatus();
        Combate c = new Combate();
        c.andar(6.3);
        c.pular(0.45);
        c.chutar(3.9);
        c.mostraStatus();
    }
}