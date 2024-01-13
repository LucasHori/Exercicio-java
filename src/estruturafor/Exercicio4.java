package estruturafor;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n; 
		double x, y;
		
		double divisao;
		
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			divisao = x / y;
			if(y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				System.out.println(divisao);
			}
		}
		sc.close();
	}

}
