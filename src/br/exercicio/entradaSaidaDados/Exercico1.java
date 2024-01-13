package br.exercicio.entradaSaidaDados;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		soma = x + y;
		
		System.out.println("soma = " + soma);
		
		sc.close();
	}

}
