package lista02;

import java.util.Scanner;

public class _07_LataDeOleo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio da lata: ");
		float raio = sc.nextFloat();
		
		System.out.println("Digite a altura da lata: ");
		float altura = sc.nextFloat();
		
		double volume = Math.PI * Math.pow(altura, 2) * raio;
		
		System.out.println("Volume da lata: "+Math.round(volume));
		
		sc.close();
	}
}
