/*. Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar
o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto
do INSS.*/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	    double horaTrabalho, horasTrabalhada, salarioBruto, salarioLiquido, desconto;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("DIGITE O VALOR DA HORA DE TRABALHO: ");
		horaTrabalho = sc.nextDouble();
		System.out.println("DIGITE O NÚMERO DE HORAS TRABALHADAS NO MÊS: ");
		horasTrabalhada = sc.nextDouble();
		System.out.println("DIGITE O PERCENTUAL DE DESCONTO DO INSS: ");
		desconto = sc.nextDouble();
		desconto = desconto/100;
		
		salarioBruto = horaTrabalho*horasTrabalhada;
		salarioLiquido = salarioBruto-(salarioBruto*desconto);
		
		System.out.println("O SALÁRIO LÍQUIDO É: R$" + salarioLiquido);
		
		
	}
}
