package lista02;

import java.util.Scanner;

public class _03_ReajusteSalarial {
public static void main(String[]args) {
		
		float salario;
		float reajuste;
		float novoSalario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salario = sc.nextInt();
		System.out.println("Digite o reajuste salarial do funcion�rio: ");
		reajuste = sc.nextInt();
		
		reajuste = reajuste/100;
		novoSalario = salario + (salario*reajuste);
		
		System.out.println("Sal�rio anterior: R$"+salario);
		System.out.println("Novo sal�rio: R$"+novoSalario);
		sc.close();
	}
}
