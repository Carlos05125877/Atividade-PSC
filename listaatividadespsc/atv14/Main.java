/*A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia,
para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e 
informe a quantidade recomendada de água em litros.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double peso, aguaDia;
	    
		System.out.println("INSIRA SEU PESO:");
		peso = sc.nextDouble();
		
		aguaDia = 0.035*peso;
		System.out.printf("A QUANTIDADE DE ÁGUA RECOMENDADA É: %.3fL", aguaDia);
	}
}
