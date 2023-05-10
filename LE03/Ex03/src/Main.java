package LE03.Ex03.src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computador c = new Computador("YYX3", "Dell", new PlacaMae("abc0090", "Muito bom!", new Processador("Intel", 3.2, 2048.0), new Fonte(240.0, 12.0, "XPG"), new PenteMemoria(2048.0)));
		
		Periferico pMonitor = new Periferico("Monitor", "Monitor");
		Periferico pTeclado = new Periferico("Teclado", "Teclado");
		c.getAlPeriferico().add(pMonitor);
		c.getAlPeriferico().add(pTeclado);
		c.getPlacaMae().getAlProcessador().add(new Processador("Intel", 3.2, 2048.0));
		c.getPlacaMae().getAlFonte().add(new Fonte(240.0, 12.0, "XPG"));
		c.getPlacaMae().getAlPenteMemoria().add(new PenteMemoria(2048.0));
		
		Usuario uFernando = new Usuario("Fernando", c);
		Usuario uAna = new Usuario("Ana", null);
		
		System.out.println(String.format("Quantidade de periférico(s): %d", c.qtdsPeriferico()));
		System.out.println(String.format("Quantidade de fonte(s): %d", c.getPlacaMae().qtdsFonte()));
		System.out.println(String.format("Quantidade de processador(es): %d", c.getPlacaMae().qtdsProcessador()));
		System.out.println(String.format("Quantidade de pente(s) de memória: %d", c.getPlacaMae().qtdsPenteMemoria()));
		System.out.println(String.format("Quantidade de memória: %f", c.getPlacaMae().qtdsMemoria()));
	}

}
