package Unidade4;

import java.util.Scanner;

/*
Análise:

Dado um caractere indicando uma opção, escreva um algoritmo para: 

se opção = ‘T’: calcular a área de um triângulo de base b e altura h 
se opção = ‘Q’: calcular a área de um quadrado de lado l 
se opção = ‘R’: calcular a área de um retângulo de base b e altura h 
se opção = ‘C’: calcular a área de um círculo de raio r 

OK.

Entradas:
opcao
b
h
l
r


Saida:
area


Algoritmo:

escrever "--- Programa para calcular Área de Formas geométricas ---
-----------
Escolha uma opção:
T se for triângulo
Q se for quadrado
R se for retângulo
C se for círculo"

ler opcao

Escolha opcao

    Caso T
    escrever "Informe a base do Triângulo"
    ler b
    escrever "Informe a altura do Triângulo"
    ler h
    area = b *(h /2)
    escrever area

    Caso Q
    escrever "Informe o lado do quadrado"
    ler l
    area = l²
    escrever area

    Caso R
    escrever "Informe a Base do Retângulo"
    ler b
    escrever "Informe a Altura do Retângulo"
    ler h
    area = b * h
    escrever area

    Caso C
    escrever "Informe o Raio do Círculo"
    ler r
    area = 3.1415 * r²
    escrever area.

    Senão escrever "Opção Inválida"
*/
public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\"--- Programa para calcular Área de Formas geométricas ---\r\n" + //
                        "-----------\r\n" + //
                        "Escolha uma opção:\r\n" + //
                        "T se for triângulo\r\n" + //
                        "Q se for quadrado\r\n" + //
                        "R se for retângulo\r\n" + //
                        "C se for círculo\"");
        char opcao = teclado.next().charAt(0);
        switch (opcao) {
            case 'T':
                System.out.println("Informe a base do Triângulo");
                double b = teclado.nextDouble();
                System.out.println("Informe a altura do Triângulo");
                double h = teclado.nextDouble();
                double area = b *(h /2);
                System.out.println("Area = " + area);
                break;
            case 'Q':
                System.out.println("Informe o lado do quadrado");
                double l = teclado.nextDouble();
                area = Math.pow(l,2);
                System.out.println("Area = " + area);
                break;
            case 'R':
                System.out.println("Informe a Base do Retângulo");
                b = teclado.nextDouble();
                System.out.println("Informe a altura do Retângulo");
                h = teclado.nextDouble();
                area = b * h;
                System.out.println("Area = " + area);
                break;
            case 'C':
                System.out.println("Informe o Raio do Círculo");
                double r = teclado.nextDouble();
                area = Math.PI * Math.pow(r,2);
                System.out.println("Area = " + area);
                break;
        
            default: System.out.println("Erro: Opção Inválida");
                break;
        }



        teclado.close();}
    }
