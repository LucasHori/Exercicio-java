package estruturafor;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

		}
		
		sc.close();
	}

}
