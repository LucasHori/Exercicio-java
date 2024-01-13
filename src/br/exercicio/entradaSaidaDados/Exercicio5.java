package br.exercicio.entradaSaidaDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codp1, codp2, quantidadep1, quantidadep2;
		double valorp1, valorp2, somap1, somap2, total;
		
		codp1 = sc.nextInt();
		quantidadep1 = sc.nextInt();
		valorp1 = sc.nextDouble();
		
		 somap1 = quantidadep1 * valorp1;
		
		codp2 = sc.nextInt();
		quantidadep2 = sc.nextInt();
		valorp2 = sc.nextDouble();
		
		somap2 = quantidadep2 * valorp2;
		
		total = somap1 + somap2;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Valor total a pagar: R$ %.2f%n", total);
		
		
		
		
		
		
	}
}
