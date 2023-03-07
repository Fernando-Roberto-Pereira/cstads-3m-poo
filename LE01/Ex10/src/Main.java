package LE01.Ex10.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, delta, x1, x2;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("A:");
		a = s.nextDouble();
		System.out.println("B:");
		b = s.nextDouble();
		System.out.println("C:");
		c = s.nextDouble();
		delta = Math.pow(b, 2.0) - 4.0 * a * c;
	    x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
	    x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	    System.out.println("X1: " + x1);
	    System.out.println("X2: " + x2);
	}

}
