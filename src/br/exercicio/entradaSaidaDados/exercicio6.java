package br.exercicio.entradaSaidaDados;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areat, areac, areatrap, areaquad, arearet, pi = 3.14159;
		
		
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areat = (a * c)/2;
		areac = pi * Math.pow(c, 2);
		areatrap = ((a + b ) * c) / 2;
		areaquad = b * b;
		arearet = a * b;
		
		Locale.setDefault(Locale.US);
		System.out.printf("triangulo: %.3f%n", areat);
		System.out.printf("Circulo: %.3f%n", areac);
		System.out.printf("trapezio: %.3f%n", areatrap);
		System.out.printf("Quadrado: %.3f%n", areaquad);
		System.out.printf("retangulo: %.3f%n", arearet);
		
		
		
		
		
		
		
		
		
		

	}

}
