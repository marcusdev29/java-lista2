package lista02;

import java.util.Scanner;

public class _08_LitrosPorKM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a dura��o da viagem em horas: ");
		float duracao = sc.nextFloat();

		System.out.println("Digite a velocidade m�dia em Km/h: ");
		float velocidadeMedia = sc.nextFloat();

		float distancia = duracao * velocidadeMedia;
		float litros = distancia / 12;
		
		System.out.println("A dist�ncia foi de:"+distancia+"KMs, e o combust�vel gasto foi:"+litros+"L");
		
		sc.close();
	}
}
