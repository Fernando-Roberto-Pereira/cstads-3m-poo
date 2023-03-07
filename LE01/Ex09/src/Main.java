package LE01.Ex09.src;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d, t, v;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		System.out.println("Distância em quilômetros:");
		d = s.nextDouble();
		System.out.println("Tempo em minutos:");
		t = s.nextDouble();
		v = (d * 1000.0) / (t * 60.0);
		System.out.println("Velocidade do projétil em metros por segundos: " + v);
	}

}
