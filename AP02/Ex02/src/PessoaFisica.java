/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AP02.Ex02.src;

/**
 *
 * @author fernando
 */
public class PessoaFisica extends Pessoa {
    private String rg;

    public PessoaFisica(String nome, String rg) {
        super(nome);
        this.rg = rg;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    //Exmeplo de overriding
    public String mostraInformacoes() {
        return "Nome: " + getNome() + ", RG: " + this.rg;
    }
}
