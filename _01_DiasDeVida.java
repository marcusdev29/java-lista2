package lista02;

import java.util.Scanner;

public class _01_DiasDeVida {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de anos vividos: ");
		int anos = sc.nextInt();
		System.out.println("Digite a quantidade de meses desde seu �ltimo anivers�rio: ");
		int meses = sc.nextInt();
		System.out.println("Digite a quantidade de dias passados desde o dia do m�s que voce faz anivers�rio: ");
		int dias = sc.nextInt();
		
		int diasVividos = (anos * 365) + (meses + 30) + dias;
		
		System.out.println("Quantidade de dias vididos: " + diasVividos);
		
		sc.close();
	}
}
