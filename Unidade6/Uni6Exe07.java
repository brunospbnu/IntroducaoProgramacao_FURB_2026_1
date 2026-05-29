package Unidade6;

import java.util.Scanner;

public class Uni6Exe07 {

    public Uni6Exe07() {
        Scanner s = new Scanner(System.in);
        int n = lerN(s);

        int vetorInteiro[] = new int[n];

        vetorInteiro = popularVetor(s, vetorInteiro);

        int vetorOrdenado[] = new int[n];

        vetorOrdenado = ordenarVetor(vetorInteiro);

        informarVetorResultante(vetorInteiro, vetorOrdenado);
    }

    private int lerN(Scanner s) {
        System.out.print("Digite o Valor de N (limitado a 20 posições): ");
        int n = s.nextInt();
        while ( n > 20 ) {
            System.out.print("ERRO: Valor informado maior que 20, digite um valor válido: ");
            n = s.nextInt();
        }
        return n;
    }

    private int[] popularVetor(Scanner s, int vetorInteiro[]) {
        for (int i = 0; i < vetorInteiro.length; i++) {

            boolean repetido; // Variável de controle
            
            // Usamos um laço 'do-while' para forçar o usuário a digitar até que a regra seja cumprida
            do {
                repetido = false; // Começamos assumindo que não é repetido
                System.out.print("Informe o valor da posição nº " + (i+1) + ": ");
                vetorInteiro[i] = s.nextInt();

                // Confere com todos os números ANTERIORES
                for (int j = 0; j < i; j++) {
                    if (vetorInteiro[j] == vetorInteiro[i]) {
                        System.out.println("ERRO: Já há um valor igual a esse no vetor!");
                        repetido = true; // Avisamos que deu erro!
                        break; // Para o laço 'j', pois já achamos o erro. Vai pedir para digitar de novo.
                    }
                }
            } while (repetido); // Se for repetido, volta lá pro 'do' e pede de novo!
        }
        
        return vetorInteiro;
    }

    private int[] ordenarVetor(int vetorInteiro[]) { //método bolha.

        int[] vetorOrdenado = vetorInteiro.clone();

        for (int i = 0; i < vetorInteiro.length; i++) {
            
            for (int j = 0; j < vetorInteiro.length - 1; j++) {
                
                // Se o número atual for MAIOR que o número do lado direito...
                if (vetorOrdenado[j] > vetorOrdenado[j + 1]) {
                    
                    // ...hora de fazer a troca usando o "copo vazio" (auxiliar)
                    int auxiliar = vetorOrdenado[j];       // 1. O copo vazio guarda o valor atual
                    vetorOrdenado[j] = vetorOrdenado[j + 1];       // 2. O atual recebe o valor do vizinho (que era menor)
                    vetorOrdenado[j + 1] = auxiliar;       // 3. O vizinho recebe o valor que estava guardado no copo
                }
            }

        }

        return vetorOrdenado;
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
