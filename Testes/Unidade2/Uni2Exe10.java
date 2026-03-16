package Testes.Unidade2;

import java.util.Scanner;

/*
Análise: OK. 
Entrada: valorSegundosInicial 
Saida: valorHoras, valorMinutos, valorSegundos 

algoritmo: 
ler valorSegundosInicial 
valorHoras = valorSegundosInicial / 3.600 
resto = valorSegundosInicial % 3600 
valorMinutos = resto / 60 
valorSegundos = resto % 60 
escrever "O tempo é de: " + valorHoras + "hora(s), " + valorMinutos + "minuto(s) e " + valorSegundos+ "segundo(s)" 
*/
public class Uni2Exe10 {
    
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.print("Digite o valor em segundos: ");
       int valorSegundosInicial = leitor.nextInt();
       int valorHoras = valorSegundosInicial / 3600;
       int resto = valorSegundosInicial % 3600;
       int valorMinutos = resto / 60;
       int valorSegundos = resto % 60;
       System.out.println("O tempo é de: " + valorHoras + " hora(s), " + valorMinutos + " minuto(s) e " + valorSegundos + " segundo(s).");
       leitor.close();
    
    }
}
