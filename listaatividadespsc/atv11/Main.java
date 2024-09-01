/*Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina?
Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando
abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de
setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie
um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com
base no custo*/

import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double valorEtanol, valorGasolina, baseCalculo;
	    
		System.out.print("DIGITE O VALOR DO ETANOL: ");
		valorEtanol = sc.nextDouble();
		System.out.print("DIGITE O VALOR DA GASOLINA: ");
		valorGasolina = sc.nextDouble();
		
		baseCalculo = (valorEtanol/valorGasolina);
		
		if(baseCalculo<=0.6){
		   System.out.print("ESCOLHA ETANOL"); 
		}else{
		   System.out.print("ESCOLHA GASOLINA"); 
		}
	}
}
