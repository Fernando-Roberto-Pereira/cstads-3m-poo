package LE01.Ex08.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, v;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Raio:");
		r = s.nextDouble();
		v = (4.0 * Math.PI * Math.pow((double)r, 3.0)) / 3.0; 
		System.out.println("Volume: " + v);
	}
}
