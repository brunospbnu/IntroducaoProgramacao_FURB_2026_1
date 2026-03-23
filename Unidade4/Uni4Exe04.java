package Unidade4;

import java.util.Scanner;

/*
Análise:
Analisar um número maior que 0 digitado e informar se foram ou não digitadas casas decimais.
OK.

Entradas:
numero


Saida:
Casas decimais foram digitadas.
OU
Casas decimais não foram digitadas.


Algoritmo:
ler numero
SE numero % ((int) numero) != 0, então
escrever "Casas decimais foram digitadas."
senão
escrever "Casas decimais não foram digitadas".

*/
public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Verificador de casas decimais");
        System.out.println("Digite um número maior que ZERO");
        double numero = teclado.nextDouble();
        if (numero % ((int) numero) != 0)
            System.out.println("Casas decimais foram digitadas");
        else
            System.out.println("Casas decimais NÃO foram digitadas");
        teclado.close();}
    }
