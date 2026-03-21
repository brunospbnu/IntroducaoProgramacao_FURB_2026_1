package Unidade4;

import java.util.Scanner;

/*
Análise:

Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.

Entradas:
valorInteiro

Saida:
impar
par

Algoritmo:
ler valorInteiro
Se valorInteiro for par então
escrever "Número é par"
Senão
escrever "Número é ímpar"



*/
public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Verificador de Par ou Ímpar ---");
        System.out.println("Dica: Digite 0 a qualquer momento para encerrar o programa.");
        System.out.println("Digite um valor inteiro abaixo");
        double valorInteiro = teclado.nextDouble();
        while (valorInteiro != 0) {
        if (valorInteiro % 2 == 0 ){
            System.out.println("Número é par");}
        else {
            System.out.println("Número é ímpar");}
        
        System.out.println("Digite um valor inteiro abaixo");
        valorInteiro = teclado.nextDouble();
    }
        System.out.println("Você digitou 0. O programa foi encerrado. Até logo!");
        teclado.close();
        } 
        }
