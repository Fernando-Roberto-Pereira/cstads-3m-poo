package AP01.Ex03.src;

public class Main {
	public static void main(String[] args) {
		Capitulo t = new Capitulo("Não Há Queijo!", "Primeira seção");
		t.setSecao("Segunda seção");
		t.setSecao("Outra seção");
		t.exibeSecoes();
		t.exibeEnderecoSecoes();
	}
}
