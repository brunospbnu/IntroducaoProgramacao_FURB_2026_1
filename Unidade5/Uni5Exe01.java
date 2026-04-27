package Unidade5;

import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para ler 20 números inteiros e informar se são impares ou pares")
        int repeticoes = 1;
        int numero = 0;
        for (repeticoes = 1; repeticoes <= 20; repeticoes++ )
        {
            System.out.println("Digite o número de posição " + repeticoes + "º");

            numero = teclado.nextInt();

            if (numero % 2 = 0) {
                System.out.println("O número é PAR");
                
            }
            else {
                System.out.println("O número é IMPAR");
            }
        }
    }
}
