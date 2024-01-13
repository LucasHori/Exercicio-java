package br.exercicio.estrutara.ifs.eslse;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("negativo");
		}else {
			System.out.println("nao negativo");
		}
		sc.close();
		
	}

}
