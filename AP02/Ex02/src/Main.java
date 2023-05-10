/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AP02.Ex02.src;

import javax.swing.JOptionPane;

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
        
        Pessoa p1 = null;
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolhar o objeto que deseja criar\n1) Pessoa \n2) Pessoa físca \n3) Pessoa Jurídica \n4) Funcionário", ""));
        
        if (opcao >= 1 && opcao <= 4) {
            switch(opcao) {
                case 1: {
                    p1 = new Pessoa("Tânia");
                    break;
                }
                case 2: {
                    p1 = new PessoaFisica("Matilde", "12458885");
                    break;
                }
                case 3: {
                    p1 = new PessoaJuridica();
                    p1.setNome("ABC Software house");
                    ((PessoaJuridica)p1).setCnpj("12345678912/2");
                    break;
                }
                case 4: {
                    p1 = new Funcionario("Bruna", "90876545", "LKH235");
                    break;
                }
            }
            System.out.println(p1.getClass());
            System.out.println(p1.mostraInformacoes());
        } else {
            System.out.println("A opção está fora do intervalo");
        }
    }
}

