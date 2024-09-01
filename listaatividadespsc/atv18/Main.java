/*A permissão para uma pessoa votar ou não é determinado pela
idade dela, conforme a tabela 4.
Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral.
Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Integer idade;
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("QUAL A IDADE DA PESSOA? ");
		idade = sc.nextInt();
		
		if(idade < 16){
		    System.out.print("NÃO ELEITOR");
		}
		if(idade >= 16 && idade <= 17){
		    System.out.print("ELEITOR FACULTATIVO");
		}
		if(idade >= 18 && idade < 65){
		    System.out.print("ELEITOR OBRIGATÓRIO");
		}
		if(idade >= 65 ){
		    System.out.print("ELEITOR FACULTATIVO");
		}
	}
}
