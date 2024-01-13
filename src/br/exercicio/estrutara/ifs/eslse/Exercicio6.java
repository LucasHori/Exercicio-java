package br.exercicio.estrutara.ifs.eslse;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		
		if(x > 0 || x == 25) {
			System.out.println("intervalo [0,25]");
		}
		else if(x >25 || x == 50){
			System.out.println("intervalo [25,50]");
		}
		else if(x > 50 ||x == 75) {
			System.out.println("interavlo [50,75]");
		}
		else if(x> 75 ||x == 100) {
			System.out.println("intervalo [75,100");
		}else {
			System.out.println("fora do intervalo");
		}
	}

}
