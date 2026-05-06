package Unidade5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular média de alunos (2 notas cada)");
        float nota1 = 0;
        float nota2 = 0;
        float media = 0;

        System.out.println("Digite o nome do aluno ou a palavra 'fim' para finalizar o programa: ");
        String nomeAtual = teclado.next();
        
        while (!nomeAtual.equalsIgnoreCase("fim")) {
            
            System.out.println("Digite a nota 1: ");
            nota1 = teclado.nextFloat();
            System.out.println("Digite a nota 2: ");
            nota2 = teclado.nextFloat();

            media = (nota1 + nota2) / 2;

            System.out.println("A média do(a) " + nomeAtual + " é " + media);

            System.out.println("Digite o nome do aluno ou a palavra 'fim' para finalizar o programa: ");
            nomeAtual = teclado.next();
        }
        teclado.close();
    }
    
}
