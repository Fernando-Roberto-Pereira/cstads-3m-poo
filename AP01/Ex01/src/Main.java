package AP01.Ex01.src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco e1 = new Endereco("Expedicionário", "Campo d'Água Verde", 1549);
		Endereco e2 = new Endereco("Felipe Schmidt", "Centro", 10);

		Pessoa p1 = new Pessoa("João", e1);
		p1.exibeEnderecos();
		Pessoa p2 = new Pessoa("Maria", e2);
		p2.exibeEnderecos();
	}
}
