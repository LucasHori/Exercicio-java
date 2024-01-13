package br.exercicio.entradaSaidaDados;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("Diferenca = " + diferenca);

	}

}
