package br.exercicio.whils;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		while (x != 0  || y != 0) {
			
			if(x > 0 && y > 0) {
				System.out.println("primeiro");
			}else if(x <0 && y > 0) {
				System.out.println("Segundo");
			}else if(x < 0 && y < 0) {
				System.out.println("quardo");
			}else if(x > 0 && y <0) {
				System.out.println("quarto");
			}else {
				System.out.println("nulo");
			}			
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
 
		sc.close();
	}

}
