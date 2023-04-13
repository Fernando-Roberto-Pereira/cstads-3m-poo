package AP01.Ex03.src;

import java.util.ArrayList;


public class Capitulo {
	private String titulo;
	private ArrayList<Secao> alSecao = new ArrayList<Secao>();

	public Capitulo(String titulo, String tituloSecao) {
		this.titulo = titulo;
		this.alSecao.add(new Secao(tituloSecao));
	}

	public void setSecao(String titulo) {
		this.alSecao.add(new Secao(titulo));
	}

	public void exibeEnderecoSecoes() {
		System.out.println("Capítulo: " + this.titulo);
		for (Secao secao: this.alSecao) {
			System.out.println("Endeço de memória da seção: " + secao);
		}
		System.out.println("");
	}
	public void exibeSecoes() {
		System.out.println("Capítulo: " + this.titulo);
		for (Secao secao: this.alSecao) {
			System.out.println("Seção: " + secao.getTitulo());
		}
		System.out.println("");
	}
}
