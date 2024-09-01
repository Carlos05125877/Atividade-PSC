/* Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    float nota1, nota2, nota3, media;
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("DIGITE A NOTA 1: ");
		nota1 = sc.nextFloat();
		System.out.print("DIGITE A NOTA 2: ");
		nota2 = sc.nextFloat();
		System.out.print("DIGITE A NOTA 3: ");
		nota3 = sc.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		System.out.println("A MÉDIA DE NOTAS É: " + media);
	}
}
