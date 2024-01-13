package br.exercicio.whils;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo, digite o produto desejado");
		
		int item, alcool = 0, gasolina = 0, diesel = 0;
		
		item = sc.nextInt();
		
		while(item != 4) {
			if(item == 1) {
				alcool = alcool + 1;
			}
			else if(item == 2) {
				gasolina = gasolina + 1;
			}
			else if(item == 3) {
				diesel = diesel + 1;
			}
			
			item = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
	

	

}
