/*Escreva um programa em Java para ler o número de votos brancos, nulos e válidos. Calcular e
escrever o percentual que cada um representa em relação ao total de eleitores.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    double percentualBrancos, percentualNulos, percentualValidos, brancos, nulos, validos, total;
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("VOTOS BRANCOS: ");
		brancos = sc.nextInt();
		System.out.print("VOTOS NULOS: ");
		nulos = sc.nextInt();
		System.out.print("VOTOS VÁLIDOS: ");
		validos = sc.nextInt();
		
		total = brancos+nulos+validos;
		percentualValidos = validos/total*100;
		percentualNulos = nulos/total*100;
		percentualBrancos = brancos/total*100;
		
		
		System.out.printf("VOTOS VÁLIDOS: %.2f%% \n", percentualValidos);
		System.out.printf("VOTOS BRANCOS: %.2f%% \n", percentualBrancos);
		System.out.printf("VOTOS NULOS: %.2f%% \n", percentualNulos);
	}
}
