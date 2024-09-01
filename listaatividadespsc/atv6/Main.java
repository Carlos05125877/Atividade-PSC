/*. Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe
a ter o valor de B e vice-versa. Exiba os valores após a troca.*/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	    Integer valorA, valorB, backup;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("DIGITE O VALOR A: ");
	    valorA = sc.nextInt();
	    System.out.print("DIGITE O VALOR B: ");
	    valorB = sc.nextInt();
	    
	    backup = valorA;
	    valorA = valorB;
	    valorB = backup;
	    
	    System.out.print("VALOR A: " + valorA + "\n" + "VALOR B: " + valorB);
	}
}