/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AP02.Ex02.src;

/**
 *
 * @author fernando
 */
public class Funcionario extends PessoaFisica {
    private String cartao;

    public Funcionario(String nome, String rg, String cartao) {
        super(nome, rg);
        this.cartao = cartao;
    }
    
    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    
    //Exmeplo de overriding
    public String mostraInformacoes() {
        return "Nome: " + getNome() + ", RG: " + getRg() + ", Cartão: " + this.cartao;
    }
}
