package Unidade4;

import java.util.Scanner;

/*
Análise:
Verificar se os 3 valores de 3 lados de comprimento podem formar um triangulo, se sim:
"triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno"
Se não:
Informar que não formam triangulo.

Entradas:
lado1
lado2
lado3


Saida:
"É um triângulo equilátero"
OU
"É um triângulo isósceles"
OU
"É um triângulo escaleno"
OU
"Não formam um triangulo"

Algoritmo:
ler lado1
ler lado2
ler lado3
Se lado1 > lado2+lado3 OU lado2 > lado1+lado3 OU lado3 > lado1+lado2, então;
    escrever "Não formam um triangulo. "
    Senão
        Se lado1, lado2 e lado3 forem iguais entre si, então
        escrever "É um triângulo equilátero"
        Senão
            Se lado1 == lado2 ou lado1 == lado3 ou lado2 == lado3,então
            escrever "É um triângulo isósceles"
            Senão
            escrever "É um triângulo escaleno"

*/
public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para verificar se os 3 lados formam triangulo e qual o tipo dele ---");
        System.out.println("Digite o primeiro lado");
        double lado1 = teclado.nextDouble();
        System.out.println("Digite o segundo lado");
        double lado2 = teclado.nextDouble();
        System.out.println("Digite o terceiro lado");
        double lado3 = teclado.nextDouble();
        if (lado1 >= (lado2 +lado3) || lado2 >= (lado1 + lado3) || lado3 >= (lado1 + lado2)) {
            System.out.println("Não formam um triangulo.");
        }
        else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É um triângulo equilátero");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles");
            }
        else { 
            System.out.println("É um triângulo escaleno");
        }
        teclado.close();

        }
        
    }
