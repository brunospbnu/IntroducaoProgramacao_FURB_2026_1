package Unidade4;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Uni4Exe30Desafio {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem-vindo ao Caixa Eletrônico");
        int opcao = 0;
        double saldo = 0;
        double numeroDaOperacao = 0;

        try {
            // 1. Aponta para o arquivo físico no seu computador
            File arquivo = new File("saldo.txt");
            
            // 2. Cria o Scanner, mas passa o ARQUIVO no lugar do System.in!
            Scanner leitorDeArquivo = new Scanner(arquivo);
            leitorDeArquivo.useLocale(java.util.Locale.US);
            saldo = leitorDeArquivo.nextDouble();

            // 4. Fecha o leitor (sempre importante!)
            leitorDeArquivo.close();
            
            System.out.println("Saldo carregado com sucesso!");
            
        } catch (Exception erro) {
            // Se for a 1ª vez que o programa roda, o arquivo não existe ainda. Ele cai aqui.
            System.out.println("Nenhum Saldo salvo encontrado. Iniciando do zero...");
        }


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
                if (numeroDaOperacao <= saldo) {saldo = saldo - numeroDaOperacao;
                    System.out.println("Saque concluído");
                } else {
                    System.out.println("Operação negada: Saldo insuficiente!");
                }
            }
            else if (opcao == 4) {
                System.out.println("Encerando o Caixa Eletrônico");
            }
            else {
                System.out.println("Opcão Inválida - Voltando ao MENU");
            }
            Thread.sleep(2000);

        } while (opcao != 4);

        try {
            FileWriter arquivo = new FileWriter("Saldo.txt");
            PrintWriter gravador = new PrintWriter(arquivo);
            gravador.println(saldo);
            gravador.close();
        }
        catch (Exception erro) {
            // Se o HD estiver cheio ou a pasta bloqueada, ele não "quebra" o programa, cai aqui:
            System.out.println("Ops! Não foi possível salvar o arquivo: " + erro.getMessage());
        }

        teclado.close();
    
    }}