/* Crie um algoritmo que lê dois números, X e Y , e mostra o resto da divisão entre eles.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Integer numeroX, numeroY, resto;
	    Scanner sc = new Scanner(System.in);
	    
	    
		System.out.print("DIGITE O VALOR DO PRIMEIRO NÚMERO (X):");
		numeroX = sc.nextInt();
		System.out.print("DIGITE O VALOR DO PRIMEIRO NÚMERO (Y):");
		numeroY = sc.nextInt();
		resto = numeroX % numeroY;
		System.out.print("O RESTO DA DIVISÃO ENTRE ELES É:" + resto);
	}
}
