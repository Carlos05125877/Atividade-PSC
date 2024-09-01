/*Incremente o programa da questão anterior, para informar o valor do metro quadrado da cerâmica
escolhido e o valor total a ser pago.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
	    double larguraRevest, comprimentoRevest, areaRevest, larguraCeramica, comprimentoCeramica, areaCeramica, quantidade, quantidadeArredondada, valorCeramica, total;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("INFORME A LARGURA DO LOCAL A SER REVESTIDO: ");
		larguraRevest = sc.nextFloat();
		System.out.print("INFORME COMPRIMENTO DO LOCAL A SER REVESTIDO: ");
		comprimentoRevest = sc.nextFloat();
		System.out.print("INFORME A LARGURA DA CERÂMICA ESCOLHIDA: ");
		larguraCeramica = sc.nextFloat();
		System.out.print("INFORME O COMPRIMENTO CERÂMICA ESCOLHIDA: ");
		comprimentoCeramica = sc.nextFloat();
		System.out.print("INFORME O VALOR POR METRO DE CERÂMICA: ");
		valorCeramica = sc.nextFloat();
		
		areaRevest = larguraRevest * comprimentoCeramica;
		areaCeramica = larguraCeramica * comprimentoCeramica;
		quantidade = areaRevest/areaCeramica;
		quantidade = (quantidade*0.1)+quantidade;
		
		quantidadeArredondada = (int) Math.ceil(quantidade);
		
		total= quantidadeArredondada * valorCeramica;
		
		System.out.println("A QUANTIDADE DE CERÂMICAS NECESSÁRIAS É: " + quantidadeArredondada);
		System.out.printf("O VALOR A SER PAGO É: R$%.2f", total);
		
	}
}
