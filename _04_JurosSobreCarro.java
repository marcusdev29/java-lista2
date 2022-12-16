package lista02;

import java.util.Scanner;

public class _04_JurosSobreCarro {
	public static void main(String[]args) {
		
		float distribuidor = 0.28f;
		float impostos = 0.45f;
		float custoFabrica;
		float custoFinal = 2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de fábrica do veículo: ");
		custoFabrica = sc.nextFloat();
		
		custoFinal = custoFabrica + (custoFabrica*impostos) + (custoFabrica*distribuidor);
		
		System.out.println("Valor final do veículo: R$"+custoFinal);
		
		sc.close();
		}
}
