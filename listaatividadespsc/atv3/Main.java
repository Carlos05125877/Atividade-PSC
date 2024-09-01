// Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Double raio;
	    Double area;
	    Double pi = 3.14;
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("DIGITE O VALOR DO RAIO:");
		raio = sc.nextDouble();
		raio = raio*raio;
		area = pi*raio;

		System.out.print("A ÁREA DO CÍRCULO É:" + area);
	}
}
