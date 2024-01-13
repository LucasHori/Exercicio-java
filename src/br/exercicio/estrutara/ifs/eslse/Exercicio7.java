package br.exercicio.estrutara.ifs.eslse;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("origem");
		}
		else if(x == 0.0) {
			System.out.println("EIXO X");
		}
		else if(y == 0.0) {
			System.out.println("EIXO Y");
		}
		else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		sc.close();
	}

}
