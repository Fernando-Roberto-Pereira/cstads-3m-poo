package LE02.Ex01.src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta(9876, 123, 0.0, "Fernando");
		c.mostraConta();
		
		c.deposito(100.0);
		c.mostraConta();
		
		c.retirada(28.0);
		c.mostraConta();
		c = null;
	}

}
