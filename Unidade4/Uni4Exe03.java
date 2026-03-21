package Unidade4;

import java.util.Scanner;

/*
Análise:
Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles. 
OK

Entradas:
numInt1
numInt2


Saida:
Se numInt1 > numInt2, então
"O valor " + numInt1 + " é maior que o valor " + numInt2
Senão
"O valor " + numInt2 + " é maior que o valor " + numInt1
FIM

Algoritmo:
ler numInt1
ler numInt2
Se numInt1 > numInt2, então
"O valor " + numInt1 + " é maior que o valor " + numInt2
Senão
"O valor " + numInt2 + " é maior que o valor " + numInt1
FIM


*/
public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---- Programa para verificar o número maior entre 2 inteiros ----");
        System.out.println("INFO: Digite 0 a qualquer momento para finalizar");
        System.out.println("Digite o valor do primeiro número inteiro");
        int numInt1 = teclado.nextInt();
        System.out.println("Digite o valor do segundo número inteiro");
        int numInt2 = teclado.nextInt();
        while (numInt1 != 0 && numInt1 != 0) {
        if (numInt1 > numInt2) {
            System.out.println("O valor " + numInt1 + " é maior do que o valor " + numInt2);
        }
        else {
            System.out.println("O valor " + numInt2 + " é maior do que o valor " + numInt1);
        }
        System.out.println("Digite os próximos números");
        System.out.println("Digite o valor do primeiro número inteiro");
        numInt1 = teclado.nextInt();
        System.out.println("Digite o valor do segundo número inteiro");
        numInt2 = teclado.nextInt();
        }
        teclado.close();
    }

}
