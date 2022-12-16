package lista02;

import java.util.Scanner;

public class _05_CelsiusParaFahrenheit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor em Graus Celsius: ");
		float C = sc.nextFloat();

		float F = (C / 5) * 9 + 32;
		
		System.out.println("Celsius: "+C+"°");
		System.out.println("Fahrenheit: "+F+"°");

		sc.close();
	}
}
