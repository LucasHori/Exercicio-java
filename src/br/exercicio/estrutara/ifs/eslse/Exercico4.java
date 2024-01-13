package br.exercicio.estrutara.ifs.eslse;

import java.util.Scanner;

public class Exercico4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, soma;
		
		System.out.println("Digite a hora inicial do jogo: ");
		
		horaInicial = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo: ");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			soma = horaFinal - horaInicial;
		}else {
			soma = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("jogo durou: " + soma + "horas");
		
		sc.close();
	}

}
