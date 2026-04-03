package Unidade4;

import java.util.Scanner;

public class Uni4Exe30Desafio {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem-vindo ao Caixa Eletrônico");
        int opcao = 0;
        double saldo = 0;
        double numeroDaOperacao = 0;
        do {
            System.out.println("MENU: \n 1 - Ver saldo \r\n" + //
                                "\r\n" + //
                                "2 - Depositar \r\n" + //
                                "\r\n" + //
                                "3 - Sacar \r\n" + //
                                "\r\n" + //
                                "4 - Sair ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de : " + saldo);
            }
            else if (opcao == 2) {
                System.out.print("Informe o valor a ser depositado: ");
                numeroDaOperacao = teclado.nextDouble(); 
                saldo = saldo + numeroDaOperacao;
                System.out.println("Depósito Concluído");
            }
            else if (opcao == 3) {
                System.out.print("Informe o valor a ser sacado: ");
                numeroDaOperacao = teclado.nextDouble();
                saldo = saldo - numeroDaOperacao;
                System.out.println("Saque concluído");
            }
            else if (opcao == 4) {
                System.out.println("Encerando o Caixa Eletrônico");
            }
            else {
                System.out.println("Opcão Inválida - Voltando ao MENU");
            }
            Thread.sleep(2000);

        } while (opcao != 4);

        teclado.close();}
    }