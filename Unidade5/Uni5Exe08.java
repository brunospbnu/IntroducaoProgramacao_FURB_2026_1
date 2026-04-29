package Unidade5;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para ler N números e informar qual o menor valor negativo e a média dos números positivos");
        System.out.print("Digite o valor de N: ");
        int n = teclado.nextInt();
        int repeticoes = 0;
        int numeroInteiroAtual;
        int numeroMenorNegativo = 0;
        int mediaNumerosPositivos = 0;
        int quantidadeNumerosPositivos = 0;
        int somaNumerosPositivos = 0;

        for (repeticoes = 1; repeticoes <= n; repeticoes++){
            System.out.print("Digite o número inteiro de posição nº " + repeticoes + " : ");
            numeroInteiroAtual = teclado.nextInt();

            if (numeroInteiroAtual > 0) {

                somaNumerosPositivos = somaNumerosPositivos + numeroInteiroAtual;
                quantidadeNumerosPositivos++;
            }

            if (numeroInteiroAtual < 0) {
                
                if (repeticoes == 1) {

                    numeroMenorNegativo = numeroInteiroAtual;
                    
                }

                else {
                    if (numeroInteiroAtual < numeroMenorNegativo) {

                        numeroMenorNegativo = numeroInteiroAtual;
                        
                    }
                }
            }

           
        }
        mediaNumerosPositivos = somaNumerosPositivos / quantidadeNumerosPositivos; 
        System.out.println("O número menor negativo é = " + numeroMenorNegativo);
        System.out.println("A média dos números positivos é = " + mediaNumerosPositivos);
    teclado.close();
}

}
