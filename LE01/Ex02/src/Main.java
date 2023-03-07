package LE01.Ex02.src;

import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c, l, p, r;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Comprimento:");
		c = s.nextFloat();
		System.out.println("Largura:");
		l = s.nextFloat();
		System.out.println("Preço:");
		p = s.nextFloat();
		r = c * l * p;
		System.out.println("Custo " + r);
	}

}
