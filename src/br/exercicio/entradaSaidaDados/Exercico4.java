package br.exercicio.entradaSaidaDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercico4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int funcionarios, horasTrabalhadas;
		double salario, soma;
		
		Locale.setDefault(Locale.US);
		
		funcionarios = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		salario = sc.nextDouble();
		
		soma = salario * horasTrabalhadas;
		
		System.out.println("number = " + funcionarios);
		System.out.printf("salary  = %.2f%n", soma);
		
		
	}

}
