package estruturafor;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int x;
		int f = 1;
		
		x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			f = f * i;
		}
		System.out.println(f);
		
		sc.close();
	}

}
