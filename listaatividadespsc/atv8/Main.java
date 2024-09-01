/*Faça um programa que converta a temperatura dada em Fahrenheit para Celsius. Você pode
testar se a sua resposta está correta, saiba que 100C = 212F. Considere C/5 = (F − 32)/9.*/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	    Double tempC;
	    Double tempF;
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("DIGITE A TEMPERATURA EM FAHRENHEIT: ");
		tempF = sc.nextDouble();
		tempC = ((tempF-32) * 5/9);
		System.out.printf("A TEMPERATURA EM CELSIUS É: %.1f°C%n", tempC);
	}
}
