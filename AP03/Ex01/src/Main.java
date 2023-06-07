package AP03.Ex01.src;
public class Main {
	public static void main(String[] args) {
		Lapis l = new Lapis("Grafite");
		l.escrever("Olá mundo!");
		l = null;
		Caneta c = new Caneta("Azul");
		c.escrever("Caneta azul, azul caneta. Caneta azul tá marcada com minha letra,...");
		c = null;
	}
}
