package LE01.Ex03.src;

import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p, a, imc;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Peso:");
		p = s.nextFloat();
		System.out.println("Altura:");
		a = s.nextFloat();
		imc = p / (float) Math.pow((double) a, (double) 2.0);
		System.out.println("Custo " + imc);
	}
}
