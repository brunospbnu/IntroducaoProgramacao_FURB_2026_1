package Desafio;

public class Desafio {
    public static void main(String[] args) {

        int[] vetor = new int[12];
        int[] sucesso = new int[12];
        int[] alerta = new int[12];

        vetor[0] = 150;
        vetor[1] = -22;
        vetor[2] = 340;
        vetor[3] = -5;
        vetor[4] = 10;
        vetor[5] = -88;
        vetor[6] = 500;
        vetor[7] = -1;
        vetor[8] = 730;
        vetor[9] = -45;
        vetor[10] = 20;
        vetor[11] = 5;

        int somaPositivos = 0;
        int somaNumerosAlerta = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > 0) {
                sucesso[i] = vetor[i];
                somaPositivos += vetor[i];

            } else {
                alerta[i] = vetor[i];
                somaNumerosAlerta++;
            }
        }

        System.out.println("\n----SAÍDAS----\n");
        System.out.println("\nSoma dos positivos: " + somaPositivos + "\n");
        System.out.println("Total de tentativas de invasão: " + somaNumerosAlerta + "\n");

        
        System.out.println("\n----VETOR AO CONTRÁRIO----\n");
        for (int i = vetor.length - 1; i >= 0; i--) {

            System.out.println(vetor[i]);
        }
        System.out.println();
    }
}
