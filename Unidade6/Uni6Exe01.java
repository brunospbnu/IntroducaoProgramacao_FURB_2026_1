package Unidade6;

import java.util.Scanner;

public class Uni6Exe01 {

    public Uni6Exe01() {
        int vetor[] = new int[10];

        vetor = lerDados();

        escreverDados(vetor);
        
    }

    private int[] lerDados() {

        Scanner s = new Scanner(System.in);
        int vetor[] = new int[10];

        for (int i = 0; i < 10; i++) {
            // Poderia ser usado também: for (int i = 9; i >= vetor.length; i--)
            System.out.print("Digite o número de posição " + i + ": ");
            vetor[i] = s.nextInt();
            }
            s.close();
            return vetor;
    }

    private void escreverDados(int vetor[]) {

        for (int i = 9; i >=0; i--) {
            // Poderia ser usado também: for (int i = vetor.length - 1; i >=0; i--)
            System.out.print("Vetor[" + i + "]: " + vetor[i]);
        }
    }
    public static void main(String[] args) {
        new Uni6Exe01();
    }
    
}
