/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AP02.Ex01.src;

/**
 *
 * @author fernando
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
