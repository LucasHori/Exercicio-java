package estruturafor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n;
		
		System.out.println("digite o valor de n");
		n = sc.nextDouble();
		
		for(int i=0; i<n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
