/*Escreva um programa em Java para ler as notas da primeira, segunda e terceira avaliações
de um aluno, todas valem dez pontos. Calcular a média aritmética simples e escrever uma
mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que
7 o aluno é aprovado). Escrever também a média calculada.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    double nota1, nota2, nota3, media;
	    
	    Scanner sc = new Scanner(System.in);
		System.out.println("PRIMEIRA NOTA: ");
		nota1 = sc.nextDouble();
		System.out.println("SEGUNDA NOTA: ");
		nota2 = sc.nextDouble();
		System.out.println("TERCEIRA NOTA: ");
		nota3 = sc.nextDouble();
		
		media=((nota1+nota2+nota3)/3);
		
		if(media >=7){
		   System.out.printf("APROVADO MÉDIA: %.2f", media);
		} else{
		   System.out.printf("REPROVADO MÉDIA: %.2f", media);
		}
	}
}
