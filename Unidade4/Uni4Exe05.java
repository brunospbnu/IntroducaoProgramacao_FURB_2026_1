package Unidade4;

import java.util.Scanner;

/*
Análise:
Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.


Entradas:
variavelLogica


Saida:
Sim
Não


Algoritmo:
ler variavelLogica
SE variavelLogica = true, então
escrever "Sim"
Senão:
escrever "Não"

*/
public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite true se a cor for azul ou false se não for");
        boolean variavelLogica = teclado.nextBoolean();
        if (variavelLogica) {
            System.out.println("Sim");
        }
        else {
            System.out.println("Não");

        }
        teclado.close();}
    }
