package LE02.Ex03.src;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String marca = JOptionPane.showInputDialog("Marca"); 
		String modelo = JOptionPane.showInputDialog("Modelo");
		double motorizacao = Double.parseDouble(JOptionPane.showInputDialog("Motorização"));
		Carro c = new Carro(marca, modelo, motorizacao);
		
		int opcao = 6;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Opção 1 - Ligar carro\nOpção 2 - Desligar carro\nOpção 3 - Mostrar informações do veículo\nOpção 4 - Adicionar marcha\nOpção 5 - Reduzir marcha\nOpção 6 - Sair"));
			if (opcao >= 1 && opcao <= 5) {
				switch (opcao) {
					case 1: {
						c.ligarCarro();
						break;
					}
					case 2: {
						c.desligarCarro();
						break;
					}
					case 3: {
						JOptionPane.showMessageDialog(null, "Marca: "+c.getMarca()+"\n" + 
								"Modelo: "+c.getModelo()+"\n" + 
								String.format("Motorização: %.1f", c.getMotorizacao())+ "\n" + 
								"Ligado: "+c.getLigado()+"\n" + 
								"Marcha: "+c.getMarcha()+"\n" + 
								String.format("Velocidade: %.1f", c.velocidade()));
						break;
					}
					case 4: {
						c.adicionarMarcha();
						break;
					}
					case 5: {
						c.reduzirMarcha();
						break;
					}
				}
			}
		} while(!(opcao==6));
	}
}
