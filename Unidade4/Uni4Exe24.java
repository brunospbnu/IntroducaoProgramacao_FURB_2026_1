package Unidade4;

import java.util.Scanner;

/*
Análise:
Solicitar 3 valores e opção (1, 2 ou 3).
Se opção 1 escrever eles em ordem crescente
Se 2 escrever eles em ordem descrcente
Se 3 escrever de forma que o maior fique no meio
OK

Entradas:
valor1
valor2
valor3
opcao


Saida:
valores em ordem conforme opção.


Algoritmo:
ler entradas.

Escolha opcao
Caso = 1 escreva os 3 valores em ordem crescente 
Caso = 2, escreva os 3 valores em ordem decrescente 
Caso = 3, escreva os 3 valores de forma que o maior valor fique no meio 

FIM

*/
public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Informe 3 números e a ordem que deseja que sejam exibidos --- \n Informe o Primeiro Número: ");
        double valor1 = teclado.nextDouble();
        System.out.println("Informe o Segundo Número: "); 
        double valor2 = teclado.nextDouble();
        System.out.println("Informe o Terceiro Número: ");
        double valor3 = teclado.nextDouble();
        System.out.println("Informe: 1 para ordem crescente, 2 para decrescente, ou 3 para o maior no meio");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 < valor2 && valor2 < valor3)
                    System.out.println(valor1 + " " + valor2 +" " + valor3);

                else if (valor1 < valor3 && valor3 < valor2)
                    System.out.println(valor1 + " " + valor3 +" " + valor2);

                else if (valor2 < valor1 && valor1 < valor3)
                    System.out.println(valor2 + " " + valor1 +" " + valor3);

                else if (valor2 < valor3 && valor3 < valor1)
                    System.out.println(valor2 + " " + valor3 +" " + valor1);

                else if (valor3 < valor1 && valor1 < valor2)
                    System.out.println(valor3 + " " + valor1 +" " + valor2);

                else if (valor3 < valor2 && valor2 < valor1)
                    System.out.println(valor3 + " " + valor2 +" " + valor1);
                else {
                   System.out.println("Erro - há valores iguais"); 
                }
                break;
            case 2:
                if (valor1 > valor2 && valor2 > valor3)
                    System.out.println(valor1 + " " + valor2 +" " + valor3);

                else if (valor1 > valor3 && valor3 > valor2)
                    System.out.println(valor1 + " " + valor3 +" " + valor2);

                else if (valor2 > valor1 && valor1 > valor3)
                    System.out.println(valor2 + " " + valor1 +" " + valor3);

                else if (valor2 > valor3 && valor3 > valor1)
                    System.out.println(valor2 + " " + valor3 +" " + valor1);

                else if (valor3 > valor1 && valor1 > valor2)
                    System.out.println(valor3 + " " + valor1 +" " + valor2);

                else if (valor3 > valor2 && valor2 > valor1)
                    System.out.println(valor3 + " " + valor2 +" " + valor1);
                else {
                   System.out.println("Erro - há valores iguais"); 
                }
                break;
            case 3:
                if (valor1 > valor2 && valor2 > valor3)
                    System.out.println(valor2 + " " + valor1 +" " + valor3);

                else if (valor2 > valor1 && valor1 > valor3)
                    System.out.println(valor1 + " " + valor2 +" " + valor3);

                else if (valor3 > valor1 && valor1 > valor2)
                    System.out.println(valor1 + " " + valor3 +" " + valor2);

                else {
                   System.out.println("Erro - há valores iguais"); 
                }
                break;

            default: System.out.println("Erro na escolha da opção. Somente é possível de 1 até 3");
                break;
        }

        teclado.close();}
    }
