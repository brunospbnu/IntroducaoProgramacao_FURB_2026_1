package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    /*
    Dado um número inteiro positivo, determine a sua decomposição em fatores primos.
    */
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();
        
        if (numero <= 1) {
            System.out.println("Por favor, digite um número maior que 1.");
        } else {
            System.out.println("\n| Número | Divisor | Resultado da Divisão |");
            System.out.println("|--------|---------|----------------------|");
            
            int copiaNumero = numero;
            int divisor = 2;
            
            // Laço para realizar a decomposição
            while (copiaNumero > 1) {
                if (copiaNumero % divisor == 0) {
                    int resultadoDivisao = copiaNumero / divisor;
                    
                    // Imprime a linha da tabela com os valores atuais
                    System.out.printf("| %6d | %7d | %20d |\n", copiaNumero, divisor, resultadoDivisao);
                    
                    copiaNumero = resultadoDivisao;
                } else {
                    divisor++;
                }
            }
            System.out.println("|--------|---------|----------------------|");
            System.out.println("Decomposição finalizada!");
        }
        
        teclado.close();
    }
}