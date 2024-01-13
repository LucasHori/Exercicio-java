package br.exercicio.entradaSaidaDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double area, raio, pi;
		
		pi = 3.14;
		
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n ", area);
		
	
	
	
	}

}
