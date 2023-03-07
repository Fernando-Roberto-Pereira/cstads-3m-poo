package LE01.Ex07.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x1, y1, x2, y2, a, b, c;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("x1:");
		x1 = s.nextFloat();
		System.out.println("y1:");
		y1 = s.nextFloat();
		System.out.println("x2:");
		x2 = s.nextFloat();
		System.out.println("y2:");
		y2 = s.nextFloat();
		a = x1 - x2;
		b = y1 - y2;
		c = (float) Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0)); 
		System.out.println("Distância: " + c);
	}
}
