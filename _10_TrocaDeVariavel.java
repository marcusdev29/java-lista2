package lista02;

import java.util.Scanner;

public class _10_TrocaDeVariavel {
	
	 public static void main(String[]args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um valor para a variável A: ");
		 int A = sc.nextInt();
		 System.out.println("Digite um valor para a variável B: ");
		 int B = sc.nextInt();
		 int C;
		 
		 C = A;
		 A = B;
		 B = C;
		 
		 System.out.println("A: "+A);
		 System.out.println("B: "+B);
		
		 
		 sc.close();
	 }
	 
}
