package Unidade4;

import java.util.Scanner;

/*
Análise:
Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não. 
OK

Entradas:
valorInt1
valorInt2


Saida:
"Os valores são múltiplos."
OU
"Os valores não são múltiplos."


Algoritmo:
ler valorInt1
ler valorInt2

Se (valorInt1 % valorInt2) OU (valorInt2 % valorInt1) = 0, então;
escrever "Os valores são múltiplos.";
senão;
escrever "Os valores não são múltiplos."
FIM

*/
public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para verificar se 2 números inteiros são múltiplos");
        System.out.println("Digite o primeiro valor inteiro");
        int valorInt1 = teclado.nextInt();
        System.out.println("Digite o segundo valor inteiro");
        int valorInt2 = teclado.nextInt();
        if ((valorInt1 % valorInt2 == 0) || (valorInt2 % valorInt1 == 0)) {
            System.out.println("Os valores são múltiplos.");
        }
        else {
            System.out.println("Os valores NÃO são múltiplos.");
        }
        teclado.close();}
    }
