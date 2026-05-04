package Unidade5;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa que lê um número inteiro positivo n e em seguida imprime n linhas do chamado Triangulo de Floyd");
        System.out.print("Informe o valor de 'N': ");
        int n = teclado.nextInt();
        int numeroAtual = 1;

        for (int linha = 1; linha <= n; linha++) {
            
            for (int coluna = 1; coluna <= linha; coluna++) {
                
                // Usamos print (sem 'ln') para imprimir os números lado a lado com um espaço
                System.out.print(numeroAtual + " ");
                
                // Aumentamos o número para a próxima volta
                numeroAtual++; 
            }
            System.out.println();
        }



        teclado.close();
    }
}
