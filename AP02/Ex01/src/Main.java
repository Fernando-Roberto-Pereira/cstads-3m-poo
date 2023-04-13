/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AP02.Ex01.src;


/**
 *
 * @author fernando
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario f1 = new Funcionario("Maria", "12.345.678/9", "148ASDW");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("RG: " + f1.getRg());
        System.out.println("Cartão: " + f1.getCartao());        
        f1.setCartao("123456789");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("RG: " + f1.getRg());
        System.out.println("Cartão: " + f1.getCartao());
    }
}

