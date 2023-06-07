package LE05.Ex01.src;
public class Main {
    public static void main(String[] args) {
        System.out.println(String.format("Adição: %f", new Adicao().calcular(10.2, 2.8)));
        System.out.println(String.format("Subtração: %f", new Subtracao().calcular(10.2, 2.8)));
        System.out.println(String.format("Divisão: %f", new Divisao().calcular(10.2, 2.8)));
        System.out.println(String.format("Multiplicação: %f", new Multiplicacao().calcular(10.2, 2.8)));
    }
}
