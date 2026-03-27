package Unidade4;

import java.util.Scanner;

/*
Análise:
Informar o quadrante de duas coordenadas X e Y de um ponto.
0, se os dois valores forem zero 
1, se os dois valores forem positivos 
2, se o x for negativo e o y, positivo 
3, se os dois valores forem negativos 
4, se o x for positivo e o y, negativo 

Entradas:
x
y


Saida:
0 OU 1 OU 2 OU 3 OU 4


Algoritmo:
ler x
ler y

Se x == 0 E y == 0
escrever "O quadrante é 0"

Se x > 0 E y > 0
escrever "O quadrante é 1'

Se x < 0 E y > 0
escrever "O quadrante é 2'

Se x < 0 E y < 0
escrever "O quadrante é 3'

Se x > 0 E y < 0
escrever "O quadrante é 4'

Senão escrever "ERRO"

*/
public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para verificar o quadrante das cordenadas X e Y de um Ponto ---");
        System.out.println("Digite o valor de X:");
        double x = teclado.nextDouble();
        System.out.println("Digite o valor de Y:");
        double y = teclado.nextDouble();
        if (x == 0 && y == 0) 
        {
            System.out.println("O quadrante é 0"); 
    }   
        else if (x > 0 && y > 0) {
            System.out.println("O quadrante é 1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("O quadrante é 2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("O quadrante é 3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("O quadrante é 4");
        }
        else {
            System.out.println("ERRO");
        }
        teclado.close();}
    }
