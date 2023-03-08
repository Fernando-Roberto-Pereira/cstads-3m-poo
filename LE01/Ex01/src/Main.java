package LE01.Ex01.src;

import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		float km, litros, r;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Quantidade de km:");
		km = s.nextFloat();
		System.out.println("Quantidade de litro:");
		litros = s.nextFloat();
		r = km / litros;
		System.out.println("Resultado " + r + " km/l");
		System.gc(); //
	}

}
