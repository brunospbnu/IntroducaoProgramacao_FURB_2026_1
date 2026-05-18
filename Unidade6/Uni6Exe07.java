package Unidade6;

import java.util.Scanner;

public class Uni6Exe07 {

    public Uni6Exe07() {
        Scanner s = new Scanner(System.in);
        int n = lerN(s);

        int vetorInteiro[] = new int[n];

        vetorInteiro = popularVetor(s, vetorInteiro);

        int vetorOrdenado[] = new int[n];

        vetorOrdenado = ordenarVetor(vetorInteiro, vetorOrdenado);

        informarVetorResultante(vetorInteiro, vetorOrdenado);
    }

    private int lerN(Scanner s) {
        System.out.print("Digite o Valor de N (limitado a 20 posições): ");
        int n = s.nextInt();
        while ( n > 20 ) {
            System.out.print("ERRO: Valor informado maior que 20, digite um valor válido");
            n = s.nextInt();
        }
        return n;
    }

    private int[] popularVetor(Scanner s, int vetorInteiro[]) {
        for (int i = 0; i < vetorInteiro.length; i++) {
            System.out.print("Informe o valor de posição nº " + (i+1) + " :");
            vetorInteiro[i] = s.nextInt();
            for (int j  = 0; j < i; j++) {
                if (vetorInteiro[j] == vetorInteiro[i]) {
                    System.out.print("ERRO: Já há um valor igual a esse Informe o valor de posição nº " + (i+1) + " :");
                    vetorInteiro[i] = s.nextInt();
                }
            }
        }
        return vetorInteiro;
    }
    private int[] ordenarVetor(int vetorInteiro[], int vetorOrdenado[]) {

        // PENDENTE FAZER O CÓDIGO.


        return vetorInteiro;
    }

    private void informarVetorResultante(int vetorInteiro[], int vetorOrdenado[]) {
        System.out.print("Vetor inteiro");

        for (int i = 0; i < vetorInteiro.length; i++) {

            System.out.print("[" + vetorInteiro[i] + "]");
            
        }
         System.out.print("Vetor ordenado");

         for (int i = 0; i < vetorInteiro.length; i++) {

            System.out.print("[" + vetorOrdenado[i] + "]");
            
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }
    
}
