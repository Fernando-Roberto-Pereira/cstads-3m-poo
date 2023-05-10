package LE03.Ex01.src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pagamento pag1 = new Pagamento("Dinheiro", 1);
		Pagamento pag6 = new Pagamento("Cartão de crédito", 6);
		
		Cliente c1 = new Cliente("Fernando", "Casa");
		Pedido p1 = new Pedido("01/01/1900", true, "TV", "Televisão", 1987.56, pag6);
		p1.adicionaItem("Mouse", "Mouse para PC", 37.17);
		c1.adicionaPedido(p1);
		System.out.println(String.format("Cliente: %s", c1.getNome()));
		System.out.println(String.format("Total do pedido: %.2f", p1.calcPrecoTotal()));
		System.out.println(String.format("Imposto: %.2f", p1.calcImposto()));
		
		Cliente c2 = new Cliente("Ana", "Canoinhas");
		Pedido p2 = new Pedido("01/01/1900", true, "Sofá", "Sofá", 3542.28, pag1);
		System.out.println(String.format("Cliente: %s", c2.getNome()));
		System.out.println(String.format("Total do pedido: %.2f", p2.calcPrecoTotal()));
		System.out.println(String.format("Imposto: %.2f", p2.calcImposto()));
	}
}