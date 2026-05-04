package Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para coletar gênero e altura de pessoas e informar: \n \r A média da altura das mulheres \n \r A média da altura do grupo");
        System.out.println("A leitura finalizará ao digitar 0 para a altura de qualquer pessoa");

        double alturaAtual = 1;
        char generoAtual = 'X';
        double somaAlturaMulheres = 0;
        double somaAlturaTodos = 0;
        int quantidadePessoas = 0;
        int quantidadeMulheres = 0;

        while (alturaAtual != 0) {

            System.out.print("Digite a altura da pessoa no formato '0,00': ");
            alturaAtual = teclado.nextDouble();

            if (alturaAtual != 0) {
                System.out.print("Digite o gênero da pessoa (F = Feminino / M = Masculino / O = Outro): ");
                generoAtual = teclado.next().charAt(0);
                generoAtual = Character.toUpperCase(generoAtual);

                while (generoAtual != 'F' && generoAtual != 'M' && generoAtual != 'O') {
                    System.out.println("O gênero informado é incorreto - Informar novamente o gênero !!! ");
                    generoAtual = teclado.next().charAt(0);
                    generoAtual = Character.toUpperCase(generoAtual);
                }
                quantidadePessoas++;
                somaAlturaTodos =  somaAlturaTodos + alturaAtual;
                    if (generoAtual == 'F') {
                    somaAlturaMulheres = somaAlturaMulheres + alturaAtual;
                    quantidadeMulheres++;
                    }
            }
            System.out.println(" Proxima pessoa abaixo: ");
            }
        

        double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
        double mediaAlturaTodos = somaAlturaTodos / quantidadePessoas;

        System.out.println("A média da altura das mulheres é: " + mediaAlturaMulheres);
        System.out.println("A média de altura do grupo é: " + mediaAlturaTodos);
        teclado.close();
    }
}
