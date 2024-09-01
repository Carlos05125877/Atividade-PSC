/*Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que
a cotação é US$ 1 = R$ 4,95.*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    double valorReal, valorDolar;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("DIGITE O VALOR EM DOLAR:");
		valorDolar = sc.nextDouble();
		 
		valorReal = valorDolar*4.95;
		
		System.out.print("O VALOR EM REAIS É:R$" + valorReal);
		
	}
}
