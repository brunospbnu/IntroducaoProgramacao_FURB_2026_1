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
        int[] vetorNumInteiros = new int[5];
        do {
            System.out.println(" Selecione uma opção: \n \r 1 - Incluir valor \n\r 2 - Pesquisar Valor" +
                                "\n\r 3 - Alterar valor \n\r 4 - Excluir valor \n\r 5 - Mostrar valores" +
                                "\n\r 6 - Ordenar valores \n\r 7 - Inverter valores \n\r 8 - Sair do sistema ");

            opcao = teclado.nextInt();

            while (opcao < 1 || opcao > 8 ) {
                System.out.print("Opção inválida! Informe uma opção válida: ");
                opcao = teclado.nextInt();
            }
            System.out.println(" ---------------------------------------- ");
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
                System.out.println("----------------------------------------------------------- \n\r " +
                                    "O valor foi incluido na posição " + (i+1) + "ª do vetor" +
                                    "\n\r------------------------------------------------------------");
                break;
            }
            else if (vetorNumInteiros[0] != 0) {
                System.out.println("-----------------------------------------------------------\n\r " +
                                    "O valor não foi incluido pois o vetor está cheio" +
                                     "\n\r------------------------------------------------------------");
                break;
            }
        }
    }

    private void pesquisarValor(int[] vetorNumInteiros, Scanner teclado) {
        System.out.print("Informe o valor a ser pesquisado: ");
        int valorAPesquisar = teclado.nextInt();
        for (int i = 0; i < vetorNumInteiros.length; i++) {
            if (valorAPesquisar == vetorNumInteiros[i]) {
                System.out.println("-----------------------------------------------------------\n\r " +
                                    "O valor está no vetor na posição " + (i+1) + "ª "+
                                    "\n\r------------------------------------------------------------");
                break;
            }
            else if (i == vetorNumInteiros.length - 1)
                System.out.println("-----------------------------------------------------------\n\r " + 
                                    "O valor não está no vetor !"+
                                    "\n\r------------------------------------------------------------");
        }
    }

    private void alterarValor(int[] vetorNumInteiros, Scanner teclado) {
        System.out.print("Informe o valor a ser alterado (será alterada a 1ª ocorrência): ");
        int valorAAlterar = teclado.nextInt();
        for (int i = 0; i < vetorNumInteiros.length; i++) {
            if (valorAAlterar == vetorNumInteiros[i]) {
                System.out.print("Número encontrado - Informe o novo número: ");
                int novoNumero = teclado.nextInt();
                vetorNumInteiros[i] = novoNumero;
                System.out.println("-----------------------------------------------------------\n\r " +
                                    "O valor na posição " + (i+1) + "ª foi alterado !!! "+
                                    "\n\r------------------------------------------------------------");
                break;
            }
            else if (i == vetorNumInteiros.length - 1)
                System.out.println("-----------------------------------------------------------\n\r " + 
                                    "O valor não está no vetor !"+
                                    "\n\r------------------------------------------------------------");
        }
    }

    private void excluirValor(int[] vetorNumInteiros, Scanner teclado) {
        System.out.print("Informe o valor a ser excluido: ");
        int valorAExcluir = teclado.nextInt();
        for (int i = 0; i < vetorNumInteiros.length; i++) {
            if (valorAExcluir == vetorNumInteiros[i]) {
                vetorNumInteiros[i] = 0;
                System.out.println("-----------------------------------------------------------\n\r " +
                                    "O valor na posição " + (i+1) + "ª foi excluido !!! "+
                                    "\n\r------------------------------------------------------------");
                for (int j = i; j < vetorNumInteiros.length -1; j++) {
                    vetorNumInteiros[j] = vetorNumInteiros[j+1];
                }
                vetorNumInteiros[vetorNumInteiros.length -1] = 0;
                
                break;
            }
            else if (i == vetorNumInteiros.length - 1)
                System.out.println("-----------------------------------------------------------\n\r " + 
                                    "O valor não está no vetor - Não foi excluido !!!"+
                                    "\n\r------------------------------------------------------------");

        }
    }

    private void mostrarValores(int[] vetorNumInteiros) {
        System.out.println("Exibindo todos os itens do vetor: ");
        for (int i = 0; i < vetorNumInteiros.length; i++) {
            System.out.println("Posição "+ (i+1) + " valor = " + vetorNumInteiros[i]);
        }
        System.out.println("-----------------------------");
    }

    private void ordenarValores(int[] vetorNumInteiros) {
        for (int i = 0; i < vetorNumInteiros.length; i++) {
            
            for (int j = 0; j < vetorNumInteiros.length - 1; j++) {
                
                // Se o número atual for MAIOR que o número do lado direito...
                if (vetorNumInteiros[j] > vetorNumInteiros[j + 1]) {
                    
                    // ...hora de fazer a troca usando o "copo vazio" (auxiliar)
                    int auxiliar = vetorNumInteiros[j];       // 1. O copo vazio guarda o valor atual
                    vetorNumInteiros[j] = vetorNumInteiros[j + 1];       // 2. O atual recebe o valor do vizinho (que era menor)
                    vetorNumInteiros[j + 1] = auxiliar;       // 3. O vizinho recebe o valor que estava guardado no copo
                }
            }

        }
        System.out.println("O vetor foi colocado em ordem crescente \n\r ---------------------------------------");
    }

    private void inverterValores(int[] vetorNumInteiros) {
         int temp = 0;
            for (int i = 0; i < vetorNumInteiros.length; i++) {
                for (int x = 0; x < i; x++) {
                temp = vetorNumInteiros[i];
                vetorNumInteiros[i] = vetorNumInteiros[x];
                vetorNumInteiros[x] = temp;
                }
            }
        System.out.println("As posições dos valores foram invertidas !!! \n\r ---------------------------------------");
    }
    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
