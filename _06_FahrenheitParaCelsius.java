package lista02;

import java.util.Scanner;

public class _06_FahrenheitParaCelsius {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor em Graus Fahrenheit: ");
		float F = sc.nextFloat();

		float C = (F - 32) * 5 / 9;

		System.out.println("Fahrenheit: " + F + "°");
		System.out.println("Celsius: " + C + "°");

		sc.close();
	}
}
