package Beecrowd;
/*
Análise:
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
OK.

Entradas:
idade_em_dias (idade da pessoa em dias, numero inteiro)

Saídas:
anos
meses
dias

Algoritmo:
ler idade_em_dias
anos = idade_em_dias / 365
idade_em_dias = idade_em_dias % 365
meses = idade_em_dias / 30
dias = idade_em_dias % 30
escrever anos + " ano(s)"
escrever meses + " mes(es)"
escrever dias + " dia(s)"
*/

import java.util.Scanner;

public class Exe1020 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int idade_em_dias = teclado.nextInt();
    int anos = idade_em_dias / 365;
    idade_em_dias = idade_em_dias % 365;
    int meses = idade_em_dias / 30;
    int dias = idade_em_dias % 30;
    System.out.println (anos + " ano(s)");
    System.out.println (meses + " mes(es)");
    System.out.println (dias + " dia(s)");
    teclado.close();
    }
}