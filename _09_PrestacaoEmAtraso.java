package lista02;

import java.util.Scanner;

public class _09_PrestacaoEmAtraso {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// valor taxa tempo

		System.out.println("Digite o valor da presta��o: ");
		float valor = sc.nextFloat();
		System.out.println("Digite a taxa de juros di�ria em porcentagem: ");
		float taxa = sc.nextFloat();
		System.out.println("Digite a quantidade de dias de atraso da fatura: ");
		float tempo = sc.nextFloat();

		float prestacao = valor + ((valor * taxa / 100) * tempo);

		System.out.println("Pre�o final da fatura: R$"+prestacao);
		
		sc.close();
	}
}
