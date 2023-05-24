package LE04.Ex02.src;

public class Main {
    public static void main(String[] args) throws Exception {
        // Conta c = new Conta("Fernando", "123456", (float) 50.0);
        // System.out.println(c.mostraConta());
        // System.out.println(String.valueOf(c.retirar((float) 10.5)));
        // System.out.println(c.mostraConta());
        // System.out.println(String.valueOf(c.retirar((float) 10.5)));
        // System.out.println(c.mostraConta());
        // System.out.println(String.valueOf(c.retirar((float) 40.0)));
        // System.out.println(c.mostraConta());

        Conta ce = new ContaEspecial("Fernando", "123456", (float) 50.0, (float) 20.0);
        System.out.println(ce.mostraConta());
        System.out.println(String.valueOf(ce.retirar((float) 10.5)));
        System.out.println(ce.mostraConta());
        System.out.println(String.valueOf(ce.retirar((float) 10.5)));
        System.out.println(ce.mostraConta());
        System.out.println(String.valueOf(ce.retirar((float) 40.0)));
        System.out.println(ce.mostraConta());
        System.out.println(String.valueOf(ce.retirar((float) 40.0)));
        System.out.println(ce.mostraConta());
    }
}
