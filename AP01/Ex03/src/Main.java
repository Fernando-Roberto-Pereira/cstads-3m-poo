package AP01.Ex03.src;

public class Main {
	public static void main(String[] args) {
		Capitulo c = new Capitulo("Não Há Queijo!", "Primeira seção");
		c.setSecao("Segunda seção");
		c.setSecao("Outra seção");
		c.exibeSecoes();
		c.exibeEnderecoSecoes();
		c = null;
	}
}
