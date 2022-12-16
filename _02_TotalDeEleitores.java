package lista02;

import java.util.Scanner;

public class _02_TotalDeEleitores {
	public static void main(String[]args) {
		
		int eleitores, votosNulos, votosBrancos, votosValidos;
		int totalVotos;
		float percValidos, percBrancos, percNulos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o total de eleitores: ");
		eleitores = sc.nextInt();
		
		System.out.println("");
		System.out.println("Digite o total de votos nulos: ");
		votosNulos = sc.nextInt();
		
		System.out.println("");
		System.out.println("Digite o total de votos em branco: ");
		votosBrancos = sc.nextInt();
		
		System.out.println("");
		System.out.println("Digite o total de votos válidos: ");
		votosValidos = sc.nextInt();
		
		totalVotos = votosNulos + votosBrancos + votosValidos;
		percValidos = votosValidos * 100 / eleitores;
		percBrancos = votosBrancos * 100 / eleitores;
		percNulos = votosNulos * 100 / eleitores;
		
		
		if (totalVotos == eleitores) {
			
			System.out.println("Total de eleitores: "+eleitores);
			System.out.println("Votos válidos: "+votosValidos+" percentagem: "+percValidos+"%");
			System.out.println("Votos em branco: "+votosBrancos+" percentagem: "+percBrancos+"%");
			System.out.println("Votos nulos: "+votosNulos+" percentagem: "+percNulos+"%");
			
			
		} else {
			System.out.println("Quantidade de votos e eleitores não coincidem.");
		}
			
		
		sc.close();
	}
}
