package Beecrowd;
/*
Entrada:
dist (Distancia em Km)
velocidadeX = 60 (Velocidade do carro X em Km/h)
velocidadeY = 90 (Velocidade do carro Y em Km/h)
Consegue se afastar um quilômetro a cada 2 minutos
Saida:
tempo (tempo gasto em minutos para o carro Y tomar essa distancia do carro X)
Algoritmo:
ler dist
tempo = dist *2
escrever tempo
*/

import java.util.Scanner;

public class Exe1016 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int dist = teclado.nextInt();
    int tempo = dist * 2;
    System.out.println(tempo + " minutos");
    teclado.close();
    }
}