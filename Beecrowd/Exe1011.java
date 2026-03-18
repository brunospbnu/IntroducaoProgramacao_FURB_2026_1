package Beecrowd;
/*
Análise:
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). 
A fórmula para calcular o volume é: (4/3) * pi * R3. 
Considere (atribua) para pi o valor 3.14159.
O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.
OK

Entradas:
raioEsfera (variavel de dupla precisão)

Saídas:
volumeEsfera (volume da esfera com 3 casas após o ponto)

Algoritmo:
ler raioEsfera
volumeEsfera = (4/3.0) * 3.14159 * raioEsfera³
escrever "VOLUME = " + volumeEsfera
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1011 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat ("0.000");
    double raioEsfera = teclado.nextDouble();
    double volumeEsfera = (4/3.0) * 3.14159 * Math.pow(raioEsfera,3);
    System.out.println("VOLUME = " + df.format(volumeEsfera));
    teclado.close();
    }
}