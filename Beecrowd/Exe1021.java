package Beecrowd;
/*
Análise:
Leia um valor de ponto flutuante com duas casas decimais. 
Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. 
As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
A seguir mostre a relação de notas necessárias.
OK. 

Entrada:
valorFlutuante

Saida:
numNotas100, numNotas50, numNotas20, numNotas10, numNotas5, numNotas2, numNotas1
numMoedas1, numMoedas050, numMoedas025, numMoedas010, numMoedas005,numMoedas001

Algoritmo:
ler valorFlutuante
numNotas100 = valorFlutuante / 100;
valorFlutuante = (valorFlutuante % 100);
numNotas50 =  valorFlutuante / 50;
valorFlutuante = valorFlutuante  % 50;
numNotas20 = valorFlutuante / 20;
valorFlutuante = valorFlutuante % 20;
numNotas10 = valorFlutuante / 10;
valorFlutuante = valorFlutuante % 10;
numNotas5 = valorFlutuante / 5;
valorFlutuante = valorFlutuante % 5;
numNotas2 = valorFlutuante / 2;
valorFlutuante = valorFlutuante % 2;
numMoedas1 = valorFlutuante / 1;
valorFlutuante = valorFlutuante % 1;
numMoedas050 = valorFlutuante / 0.50;
valorFlutuante = valorFlutuante % 0.50;
numMoedas025 = valorFlutuante / 0,25;
valorFlutuante = valorFlutuante % 0,25;
numMoedas010 = valorFlutuante / 0,10;
valorFlutuante = valorFlutuante % 0,10;
numMoedas005 = valorFlutuante / 0,05;
valorFlutuante = valorFlutuante % 0,05;
numMoedas001 = valorFlutuante / 0,01;

escrever ("NOTAS:")
escrever numNotas100 + "nota(s) de R$ 100,00"
escrever numNotas50 + "nota(s) de R$ 50,00"
escrever numNotas20 + "nota(s) de R$ 20,00"
escrever numNotas10 + "nota(s) de R$ 10,00"
escrever numNotas5 + "nota(s) de R$ 5,00"
escrever numNotas2 + "nota(s) de R$ 2,00"
escrever ("MOEDAS:")
escrever numMoedas1 + "moeda(s) de R$ 1.00"
escrever numMoedas050 + "moeda(s) de R$ 0.50"
escrever numMoedas025 + "moeda(s) de R$ 0.25"
escrever numMoedas010 + "moeda(s) de R$ 0.10"
escrever numMoedas005 + "moeda(s) de R$ 0.05"
escrever numMoedas050 + "moeda(s) de R$ 0.01"
*/
import java.util.Scanner;

public class Exe1021 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double valorFlutuante = teclado.nextInt();
    int numNotas100 = (int) valorFlutuante / 100;
    valorFlutuante = (valorFlutuante % 100);
    int numNotas50 = (int) valorFlutuante / 50;
    valorFlutuante = valorFlutuante  % 50;
    int numNotas20 = (int) valorFlutuante / 20;
    valorFlutuante = valorFlutuante % 20;
    int numNotas10 =(int) valorFlutuante / 10;
    valorFlutuante = valorFlutuante % 10;
    int numNotas5 = (int) valorFlutuante / 5;
    valorFlutuante = valorFlutuante % 5;
    int numNotas2 = (int) valorFlutuante / 2;
    valorFlutuante = valorFlutuante % 2;
    int numMoedas1 = (int) valorFlutuante / 1;
    valorFlutuante = valorFlutuante % 1;
    int numMoedas050 = ?????



valorFlutuante = valorFlutuante % 0.50;
numMoedas025 = valorFlutuante / 0,25;
valorFlutuante = valorFlutuante % 0,25;
numMoedas010 = valorFlutuante / 0,10;
valorFlutuante = valorFlutuante % 0,10;
numMoedas005 = valorFlutuante / 0,05;
valorFlutuante = valorFlutuante % 0,05;
numMoedas001 = valorFlutuante / 0,01;


    System.out.println("NOTAS:");
    System.out.println(numNotas100 + " nota(s) de R$ 100,00");
    System.out.println(numNotas50 + " nota(s) de R$ 50,00");
    System.out.println(numNotas20 + " nota(s) de R$ 20,00");
    System.out.println(numNotas10 + " nota(s) de R$ 10,00");
    System.out.println(numNotas5 + " nota(s) de R$ 5,00");
    System.out.println(numNotas2 + " nota(s) de R$ 2,00");
    System.out.println(numNotas1 + " nota(s) de R$ 1,00");
    System.out.println("MOEDAS:")




    teclado.close();
    }
}