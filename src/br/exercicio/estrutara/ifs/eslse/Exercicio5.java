package br.exercicio.estrutara.ifs.eslse;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double item, quantidade, soma;
		
		System.out.println("selecione o item:");
		item = sc.nextDouble();
		
		System.out.println("diga a quantidade");
		quantidade = sc.nextDouble();
		
		if(item == 1) {
			item = 4.00;
			soma = quantidade * item;
			System.out.println("valor: " + soma);
		}else if(item == 2) {
			item = 4.50;
			soma = quantidade * item;
			System.out.println("valor: " + soma);
		}else if(item == 3) {
			item = 5.00;
			soma = quantidade * item;
			System.out.println("valor: " + soma);
		}else if(item == 4) {
			item = 2.00;
			soma = quantidade * item;
			System.out.println("valor: " + soma);
		}else if (item == 5) {
			item = 1.50;
			soma = quantidade * item;
			System.out.println("valor: " + soma);
		}
		
		sc.close();
		
		
			
		
	}

}
