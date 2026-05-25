package Unidade5;

import java.util.Scanner;


/*
Implemente o problema da mochila. 
Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, com decremento inteiro positivo K, 
deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. 
N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:
•	os elementos a serem colocados na mochila;
•	os elementos que entraram na mochila;
•	os que ficaram fora da mochila;
•	qual é a soma dos elementos que entraram na mochila;
•	qual a soma dos elementos que não entraram na mochila.

*/

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Problema da Mochila (valores inteiros somente) \n\r Informe o valor de N (valor inicial): ");
        int n = t.nextInt();
        System.out.print("Informe o valor de K (valor do decremento inteiro):");
        int k = t.nextInt();
        System.out.print("Informe o tamanho da mochila (M): ");
        int m = t.nextInt();

        int valorAtual = n;
        int valorMochilaAtual = m;
        String numerosNaMochila = "";
        String numerosdaLista = "";
        String numerosForaMochila = "";
        int somaElementosDentro = 0;
        int somaElementosFora = 0;

        while (valorAtual > 0) {
            numerosdaLista = numerosdaLista + " " + valorAtual;
            if (valorMochilaAtual >= valorAtual) {
                System.out.println(" \n\r Valor inserido na mochila: " + valorAtual);
                valorMochilaAtual = valorMochilaAtual - valorAtual;
                System.out.println("Valor atual da mochila: " + valorMochilaAtual);
                numerosNaMochila = numerosNaMochila + " " + valorAtual;
                System.out.println("Parcial: Numeros na mochila: " + numerosNaMochila);
                somaElementosDentro = somaElementosDentro + valorAtual;
                System.out.println("Soma parcial: " + somaElementosDentro);
            }
            else {
                numerosForaMochila = numerosForaMochila + " " + valorAtual;
                System.out.println("Numero colocado fora da mochila: " + valorAtual);
                somaElementosFora = somaElementosFora + valorAtual;
            }
            valorAtual = valorAtual - k;
        }
        
        System.out.println("\n\r -------- FINALIZANDO PROGRAMA: ------- \n\r Elementos a serem colocados na mochila: " + numerosdaLista +
                            " \n\r Elementos que entraram na mochila: " + numerosNaMochila +
                            "\n\r Elementos que que ficaram fora da mochila: " + numerosForaMochila +
                            " \n\r Soma dos elementos que entraram na mochila: " + somaElementosDentro +
                            " \n\r Soma dos elementos que NÃO entraram na mochila: " + somaElementosFora);
        t.close();
    }
    
}
