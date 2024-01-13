package estruturafor;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		double soma = 0, x, y, z;
		
		N = sc.nextInt();
		
		for(int i=0; i < N; i++){
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			
			soma = (x * 2.0 + y * 3.0 + z * 5.0 ) / 10.0;
			
			System.out.printf("%.1f%n", soma);
		}
		
	
		sc.close();
	}

}
