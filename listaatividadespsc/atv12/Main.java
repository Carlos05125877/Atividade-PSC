

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
	    double larguraRevest, comprimentoRevest, areaRevest, larguraCeramica, comprimentoCeramica, areaCeramica, quantidade, quantidadeArredondada;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("INFORME A LARGURA DO LOCAL A SER REVESTIDO: ");
		larguraRevest = sc.nextFloat();
		System.out.print("INFORME COMPRIMENTO DO LOCAL A SER REVESTIDO: ");
		comprimentoRevest = sc.nextFloat();
		System.out.print("INFORME A LARGURA DA CERÂMICA ESCOLHIDA: ");
		larguraCeramica = sc.nextFloat();
		System.out.print("INFORME O COMPRIMENTO CERÂMICA ESCOLHIDA: ");
		comprimentoCeramica = sc.nextFloat();
		
		areaRevest = larguraRevest * comprimentoCeramica;
		areaCeramica = larguraCeramica * comprimentoCeramica;
		quantidade = areaRevest/areaCeramica;
		quantidade = (quantidade*0.1)+quantidade;
		
		quantidadeArredondada = (int) Math.ceil(quantidade);
		System.out.println("A QUANTIDADE DE CERÂMICAS NECESSÁRIAS É: " + quantidadeArredondada);
		
		
		
		
	}
}