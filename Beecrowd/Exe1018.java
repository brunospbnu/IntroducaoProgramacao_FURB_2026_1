package Beecrowd;
/*
Análise:
A partir de um número inteiro calcular o número minimo de notas (cédulas) em que pode ser dividido. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 

Entrada:
valorInteiro

Saida:
numNotas100, numNotas50, numNotas20, numNotas10, numNotas5, numNotas2, numNotas1

Algoritmo:
ler valorInteiro
numNotas100 = valorInteiro / 100
numNotas50 = (valorInteiro % 100) / 50
numNotas20 = ((valorInteiro % 100) % 50) / 20
numNotas10 = (((valorInteiro % 100) % 50) % 20) / 10
numNotas5 = ((((valorInteiro % 100) % 50) % 20) % 10) / 5
numNotas2 = (((((valorInteiro % 100) % 50) % 20) % 10) % 5) / 2
numNotas1 = (((((valorInteiro % 100) % 50) % 20) % 10) % 5) % 2
escrever numNotas100 + "nota(s) de R$ 100,00"
escrever numNotas50 + "nota(s) de R$ 50,00"
escrever numNotas20 + "nota(s) de R$ 20,00"
escrever numNotas10 + "nota(s) de R$ 10,00"
escrever numNotas5 + "nota(s) de R$ 5,00"
escrever numNotas2 + "nota(s) de R$ 2,00"
escrever numNotas1 + "nota(s) de R$ 1,00"

*/
import java.util.Scanner;

public class Exe1018 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valorInteiro = teclado.nextInt();
    int numNotas100 = valorInteiro / 100;
    int numNotas50 = (valorInteiro % 100) / 50;
    int numNotas20 = ((valorInteiro % 100) % 50) / 20;
    int numNotas10 = (((valorInteiro % 100) % 50) % 20) / 10;
    int numNotas5 = ((((valorInteiro % 100) % 50) % 20) % 10) / 5;
    int numNotas2 = (((((valorInteiro % 100) % 50) % 20) % 10) % 5) / 2;
    int numNotas1 = (((((valorInteiro % 100) % 50) % 20) % 10) % 5) % 2;
    System.out.println(valorInteiro);
    System.out.println(numNotas100 + " nota(s) de R$ 100,00");
    System.out.println(numNotas50 + " nota(s) de R$ 50,00");
    System.out.println(numNotas20 + " nota(s) de R$ 20,00");
    System.out.println(numNotas10 + " nota(s) de R$ 10,00");
    System.out.println(numNotas5 + " nota(s) de R$ 5,00");
    System.out.println(numNotas2 + " nota(s) de R$ 2,00");
    System.out.println(numNotas1 + " nota(s) de R$ 1,00");
    teclado.close();
    }
}