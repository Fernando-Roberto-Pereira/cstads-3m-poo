/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AP02.Ex02.src;

/**
 *
 * @author fernando
 */
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Exmeplo de overriding
    public String mostraInformacoes() {
        return "Nome: " + this.nome;
    }
}
