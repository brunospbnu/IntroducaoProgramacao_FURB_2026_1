package Testes;
/*
Entradas: três valores de ponto flutuante de dupla precisão (A B C).
Saídas:
- A área do triângulo retângulo que tem A por base e C por altura.
- A área do círculo de raio C. (pi = 3.14159)
- A área do trapézio que tem A e B por bases e C por altura.
- A área do quadrado que tem lado B.
- A área do retângulo que tem lados A e B.
Algoritmo:
ler A
ler B
ler C
area_triangulo = (A * C) / 2
area_circulo = 3.14159 * C²
area_trapezio = ((A + B) * C) /2
area_quadrado = B²
area_retangulo = A * B
escrever area_triangulo
escrever area_circulo
escrever area_trapezio
escrever area_quadrado
escrever area_retangulo
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.000");
    Scanner leitor = new Scanner(System.in);
    double a = leitor.nextDouble();
    double b = leitor.nextDouble();
    double c = leitor.nextDouble();
    double area_triangulo = (a * c) / 2;
    double area_circulo = 3.14159 * Math.pow(c, 2);
    double area_trapezio = ((a + b) * c) / 2;
    double area_quadrado = Math.pow(b, 2);
    double area_retangulo = a * b;
    System.out.println("TRIANGULO: " + df.format(area_triangulo));
    System.out.println("CIRCULO: " + df.format(area_circulo));
    System.out.println("TRAPEZIO: " + df.format(area_trapezio));
    System.out.println("QUADRADO: " + df.format(area_quadrado));
    System.out.println("RETANGULO: " + df.format(area_retangulo));
    leitor.close();
    }
}
