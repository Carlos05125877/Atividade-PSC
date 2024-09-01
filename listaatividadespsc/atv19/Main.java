/*Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir
saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. Se alguma opção inválida for 
fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura
de seleção Switch/Case para implementar seu produto. Utilize números inteiros para indicar
cada opção.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double saldo = 1000;
        double deposito, saque;
        List<String> extrato = new ArrayList<>();

        do {
            System.out.println("===== Menu Caixa Eletrônico =====");
            System.out.println("1. Exibir saldo");
            System.out.println("2. Exibir extrato");
            System.out.println("3. Realizar depósito");
            System.out.println("4. Realizar saque");
            System.out.println("5. Sair");
            System.out.print("Digite a opção desejada: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("SALDO: R$" + saldo);
                    
                    break;
                case 2:
                    System.out.println("EXTRATO:R$");
                    for (String transacao : extrato) {
                        System.out.println(transacao);
                    }
                    
                    break;
                case 3:
                    System.out.println("VALOR DO DEPÓSITO: ");
                    deposito = sc.nextDouble();
                    saldo = saldo + deposito;
                    
                    extrato.add("DEPÓSITO DE R$" + deposito);
                    
                    System.out.println("REALIZANDO DEPÓSITO...");
                    System.out.println("DEPÓSITO REALIZADO");
                    
                    break;
                case 4:
                    System.out.println("VALOR DO SAQUE: ");
                    saque = sc.nextDouble();
                    if(saque <= saldo){
                        saldo = saldo - saque;
                        
                        extrato.add("SAQUE DE R$" + saque);
                        
                        System.out.println("REALIZANDO SAQUE...");
                        System.out.println("SAQUE REALIZADO");
                    }else{
                        System.out.println("SALDO INSUFICIENTE");
                    }
                    
                    
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }
}