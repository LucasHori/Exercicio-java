package br.exercicio.whils;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha para acessar");
		
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("senha Invalida");
			System.out.println("tente novamente");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

	}

}
