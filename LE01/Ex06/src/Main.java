package LE01.Ex06.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, r;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("A:");
		a = s.nextInt();
		System.out.println("B:");
		b = s.nextInt();
		System.out.println("C:");
		c = s.nextInt();
		r = (a * a) + (b * b) + (c * c);
		System.out.println("Resultado: " + r);
	}
}
