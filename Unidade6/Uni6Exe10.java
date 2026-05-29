package Unidade6;

import java.util.Scanner;

public class Uni6Exe10 {

    public Uni6Exe10() {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        menu(teclado, opcao);
        teclado.close();
    }

    private void menu(Scanner teclado, int opcao) {
        System.out.println("---- Programa para trabalhar com valores em um vetor ----");
        int[] vetorNumInteiros = new int[3];
        do {
            System.out.println(" Selecione uma opção: \n \r 1 - Incluir valor \n\r 2 - Pesquisar Valor" +
                                "\n\r 3 - Alterar valor \n\r 4 - Excluir valor \n\r 5 - Mostrar valores" +
                                "\n\r 6 - Ordenar valores \n\r 7 - Inverter valores \n\r 8 - Sair do sistema ");
            opcao = teclado.nextInt();

            while (opcao < 1 || opcao > 8 ) {
                System.out.print("Opção inválida! Informe uma opção válida: ");
                opcao = teclado.nextInt();
            }

            executarOpcao(opcao, vetorNumInteiros, teclado);
            
        } while (opcao != 8);

    }

    private void executarOpcao(int opcao, int[] vetorNumInteiros, Scanner teclado) {

        switch (opcao) {
            case 1:
                incluirValor(vetorNumInteiros, teclado);
                break;
            case 2:
                pesquisarValor(vetorNumInteiros, teclado);
                break;
            case 3:
                alterarValor(vetorNumInteiros, teclado);
                break;
            case 4:
                excluirValor(vetorNumInteiros, teclado);
                break;
            case 5:
                mostrarValores(vetorNumInteiros);
                break;
            case 6:
                ordenarValores(vetorNumInteiros);
                break;
            case 7:
                inverterValores(vetorNumInteiros);
                break;
            case 8:
                break;
        }
    }

    private void incluirValor(int[] vetorNumInteiros, Scanner teclado) {
        System.out.print("Informe o valor a ser incluido: ");
        int valorAIncluir = teclado.nextInt();
        for (int i = vetorNumInteiros.length - 1; i >= 0 ; i--) {
            if (vetorNumInteiros[i] == 0) {
                vetorNumInteiros[i] = valorAIncluir;
                System.out.println("O valor foi incluido na posição " + (i+1) + "ª do vetor");
                break;
            }
            else if (vetorNumInteiros[0] != 0) {
                System.out.println("O valor não foi incluido pois o vetor está cheio");
                break;
            }
        }
    }

    private void pesquisarValor(int[] vetorNumInteiros, Scanner teclado) {
        System.out.println("Essa parte do programa ainda não foi realizada !!!");
    }

    private void alterarValor(int[] vetorNumInteiros, Scanner teclado) {
        System.out.println("Essa parte do programa ainda não foi realizada !!!");
    }

    private void excluirValor(int[] vetorNumInteiros, Scanner teclado) {
        System.out.println("Essa parte do programa ainda não foi realizada !!!");
    }

    private void mostrarValores(int[] vetorNumInteiros) {
        System.out.println("Essa parte do programa ainda não foi realizada !!!");
    }

    private void ordenarValores(int[] vetorNumInteiros) {
        System.out.println("Essa parte do programa ainda não foi realizada !!!");
    }

    private void inverterValores(int[] vetorNumInteiros) {
        System.out.println("Essa parte do programa ainda não foi realizada !!!");
    }
    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
