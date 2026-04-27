package Unidade5;

import java.util.Scanner;

public class Uni5Exe05Alternativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Programa para escrever os N primeiros termos...");
        System.out.print("Digite o valor de N: ");
        int N = teclado.nextInt();
        
        int base = 8;
        
        // O laço vai rodar exatamente N vezes
        for (int repeticoes = 1; repeticoes <= N; repeticoes++) {
            
            // Se a repetição for ímpar (1, 3, 5, 7...)
            if (repeticoes % 2 != 0) {
                System.out.print(base + ", ");
            } 
            // Se a repetição for par (2, 4, 6, 8...)
            else {
                System.out.print((base + 2) + ", ");
                
                // Prepara a base para a próxima dupla dobrando o valor!
                base = base * 2; 
            }
        }
        
        teclado.close();
    }
}