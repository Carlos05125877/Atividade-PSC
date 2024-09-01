/* Escreva um programa em Java para ler:
• a descrição do produto (nome)
• a quantidade adquirida
• o preço unitário.
Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto
e total a pagar (total a pagar = total - desconto), sabendo-se que:
• Se quantidade <= 5, o desconto será de 2%
• Se quantidade > 5 e quantidade <=10, o desconto será de 3%
• Se quantidade > 10 e quantidade <30, o desconto será de 5%
• Se quantidade >= 30 o desconto será de 10%
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String produto;
	    Integer quantidade;
	    Double precoUnit;
	    Double valorTotal = 1.0;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("PRODUTO:");
		produto = sc.nextLine();
		//sc.skip("[\r\n]");
		System.out.print("QUANTIDADE:");
		quantidade = sc.nextInt();
		System.out.print("PREÇO:");
		precoUnit = sc.nextDouble();
		
		if(quantidade <= 5){
		   valorTotal = (quantidade*precoUnit) - (quantidade*precoUnit*0.02);
		}
		if(quantidade > 5 && quantidade <=10){
		   valorTotal = (quantidade*precoUnit) - (quantidade*precoUnit*0.03);
		}
	    if(quantidade > 10 && quantidade <30){
		   valorTotal = (quantidade*precoUnit) - (quantidade*precoUnit*0.05);
		}
		if(quantidade >= 30){
		   valorTotal = (quantidade*precoUnit) - (quantidade*precoUnit*0.10);
		}
		
		System.out.println("VALOR TOTAL: R$" + valorTotal);
	}
}
