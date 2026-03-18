package Beecrowd;
/*
Entradas:
Quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano: x1, y1, x2, y2.
Saídas:
dist (distancia entre os dois pontos, com 4 casas decimais)
Algoritmo:
ler os valores de x1, y1, x2 e y2
dist = raiz quadrada de ((x2 - x1)² + (y2 - y1)²)
escrever o valor de dist com 4 casas decimais
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1015 {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.0000");
    Scanner teclado = new Scanner(System.in);
    double x1 = teclado.nextDouble();
    double y1 = teclado.nextDouble();
    double x2 = teclado.nextDouble();
    double y2 = teclado.nextDouble();
    double dist = Math.sqrt (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2));
    System.out.println(df.format(dist));
    teclado.close();
    }
}