package lista02;

import java.util.Scanner;

public class _08_LitrosPorKM {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a duração da viagem em horas: ");
		float duracao = sc.nextFloat();

		System.out.println("Digite a velocidade média em Km/h: ");
		float velocidadeMedia = sc.nextFloat();

		float distancia = duracao * velocidadeMedia;
		float litros = distancia / 12;
		
		System.out.println("A distância foi de:"+distancia+"KMs, e o combustível gasto foi:"+litros+"L");
		
		sc.close();
	}
}
