package Unidade4;

import java.util.Scanner;

/*
Análise:
O usuario apresenta 3 valores inteiros que representam cartas do truco.
As cartas representam a mão do jogo de truco.
(1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei).
O algoritmo deve imprimir na tela a palavra:
"TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), 
"SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3), ou 
"NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). 
Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada. 

Dica: criar variáveis intermediárias para contar a quantidade de "boas".

Ok

Entradas:
valor1, valor2, valor3


Saida:
"TRUCO"
OU
"SEIS"
OU
"NOVE"
OU
<vazio> se não houver AS, 2 ou 3 nas três cartas


Algoritmo:
ler valor1 
ler valor2
ler valor3
quantboas = 0
Se valor1 == 1 OU valor1 == 2 OU valor1 == 3, então
quantboas = quantboas + 1
Se valor2 == 1 OU valor2 == 2 OU valor2 == 3, então
quantboas = quantboas + 1
Se valor3 == 1 OU valor3 == 2 OU valor3 == 3, então
quantboas = quantboas + 1
Se quantboas == 1, então
escrever "TRUCO"
Se quantboas == 2, então
escrever "SEIS"
Se quantboas == 3, então
escrever "NOVE"
Senão
escrever "NADA"
FIM

*/
public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Programa para avaliar cartas do truco ---");
        System.out.println("Digite 3 números que representam as cartas do truco");
        System.out.println("INFO (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei)");
        System.out.println("Digite a primeira carta abaixo:");
        int valor1 = teclado.nextInt();
        System.out.println("Digite a segunda carta abaixo:");
        int valor2 = teclado.nextInt();
        System.out.println("Digite a terceira carta abaixo:");
        int valor3 = teclado.nextInt();
        int quantboas = 0;
        if (valor1 == 1 || valor1 == 2 || valor1 == 3) {
            quantboas = quantboas + 1;
        }
        if (valor2 == 1 || valor2 == 2 || valor2 == 3) {
            quantboas = quantboas + 1;
        }
        if (valor3 == 1 || valor3 == 2 || valor3 == 3) {
            quantboas = quantboas + 1;
        }
        if (quantboas == 1) {
            System.out.println("TRUCO");
            
        }
        else if (quantboas == 2) {
            System.out.println("SEIS");
            
        }
        else if (quantboas == 3) {
            System.out.println("NOVE");
            
        }
        else {
            System.out.println("NADA !!!");

        }
        teclado.close();}
    }
