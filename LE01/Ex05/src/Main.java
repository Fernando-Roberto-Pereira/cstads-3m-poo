package LE01.Ex05.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c, j, m, f;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Capital:");
		c = s.nextDouble();
		System.out.println("Taxa:");
		j = s.nextDouble();
		System.out.println("Meses:");
		m = s.nextDouble();
		f = c * Math.pow((1 + (j / 100.0)), m);
		System.out.println("Montante final: " + f);
	}
}
