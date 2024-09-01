/*Faça um programa para o seguinte problema: Compraram-se N canetas iguais, que foram pagas
com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta?
*/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	    Double canetasN, notaZ, trocoY, valorCaneta;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("DIGITE O NÚMERO DE CANETAS COMPRADAS: ");
		canetasN = sc.nextDouble();
		System.out.print("DIGITE O VALOR DA NOTA ENTREGUE: ");
		notaZ = sc.nextDouble();
		System.out.print("DIGITE O VALOR DO TROCO: ");
		trocoY = sc.nextDouble();
		
		valorCaneta = ((notaZ-trocoY)/canetasN);
		
		System.out.printf("O VALOR UNITÁRIO DA CANETA É: R$%.2f%n", valorCaneta);
	}
}
