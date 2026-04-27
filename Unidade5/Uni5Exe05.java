package Unidade5;

import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para escrever os N primeiros termos de uma sequencia de números");
        System.out.println("Seguencia 8, 10, 16, 18, 32 ,34, 64 .....");
        System.out.println("Digite o valor de N: ");
        int N = teclado.nextInt();
        int repeticoes = 0;
        int numeroAtual = 8;
        int valorASomar = 2;
        for (repeticoes = 1; repeticoes <= N; repeticoes++)
        {
            System.out.print(numeroAtual + ", ");
           
            int somaAnterior = valorASomar;
            int numeroAnterior = numeroAtual;

            numeroAtual = numeroAtual + valorASomar;
            
            valorASomar = numeroAnterior - somaAnterior;
            

            if (valorASomar == 4) {
                valorASomar = valorASomar - 2;
            }
        }
        teclado.close();
    }
}
