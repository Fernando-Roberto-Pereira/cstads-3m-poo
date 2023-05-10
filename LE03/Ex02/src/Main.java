package LE03.Ex02.src;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor p1 = new Professor("Fernando", "123456");
		Professor p2 = new Professor("Jonas", "908756");
		
		Departamento d1 = new Departamento("Informática", "Bloco A", "123", "ADS");
		Departamento d2 = new Departamento("Alimentos", "Bloco B", "456", "TA");
		
		Instituicao i1 = new Instituicao("I. Santa Catarina", "IFSC", "Canoinhas", "Av. Exp.", d1);
		i1.getAlCampus().get(i1.getAlCampus().size()-1).adicionaProfessor(p1);
		i1.getAlCampus().get(i1.getAlCampus().size()-1).adicionaDepartamento(d2);
		
		Instituicao i2 = new Instituicao("I. Catarinense", "IFC", "Trés Barras", "Não sei", d2);
		i2.getAlCampus().get(i2.getAlCampus().size()-1).adicionaProfessor(p1);
		i2.getAlCampus().get(i2.getAlCampus().size()-1).adicionaProfessor(p2);
		
		System.out.println(String.format("Instituição: %s - %s", i1.getNome(), i1.getSigla()));
		for (Campus c : i1.getAlCampus()) {
			System.out.println(String.format("Campus: %s - %s", c.getNome(), c.getEndereco()));
			System.out.println(String.format("Número de Departamento(s): %d", c.calcDepartamento()));
			System.out.println(String.format("Número de professor(es): %d", c.calcProfessor()));
		}
		System.out.println(String.format("Instituição: %s - %s", i2.getNome(), i2.getSigla()));
		for (Campus c : i2.getAlCampus()) {
			System.out.println(String.format("Campus: %s - %s", c.getNome(), c.getEndereco()));
			System.out.println(String.format("Número de Departamento(s): %d", c.calcDepartamento()));
			System.out.println(String.format("Número de professor(es): %d", c.calcProfessor()));
		}
	}
}
