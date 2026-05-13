package Unidade6;

import java.util.Scanner;

public class Uni6Exe04 {
    public Uni6Exe04() {
        Scanner s = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        


        lerDados(s, vetor1, "Vetor 1");
        lerDados(s, vetor2, "Vetor 2");

        int somaVetor1Vetor2[] = new int[10];

        somaVetor1Vetor2 = somar(vetor1, vetor2);


        escreverValores(somaVetor1Vetor2);


        // Poderia ser com apenas 1 for, mudaria apenas a forma que os dados são coletados.
        // Com 1 for, coleta um vetor1 e depois um vetor2 e depois repete
        // Com 2 for, coleta todos os vetor 1 e depois todos os vetor2


        /* Se fosse sem metodo - coleta de dados vetor 1:

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(" Digite o valor do elemento " + i + " para o vetor 1: ");
            vetor1[i] = s.nextInt();
        }

        */

        /* Se fosse sem metodo - coleta de dados vetor 2:

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(" Digite o valor do elemento " + i + " para o vetor 1: ");
            vetor1[i] = s.nextInt();
        }
        */


        /* Soma dos vetores - Sem método, seria:

        for (int i = 0; i < somaVetor1Vetor2.length; i++) {
            somaVetor1Vetor2[i] = vetor1[i] + vetor2[i];
        }

        */


        /* Se fosse escrever sem método:

        for (int i = 0; i < somaVetor1Vetor2.length; i++) {
            System.out.println("Vetor [" + i + "]: " + somaVetor1Vetor2 );
        }
        */

        s.close();
    }

    private void lerDados(Scanner s, int[] valores, String nomeVetor) {

        for (int i = 0; i < valores.length; i++) {
            System.out.println(" Digite o valor do elemento " + (i+1) + " para o " + nomeVetor);
            valores[i] = s.nextInt();
        }

        
    }

    private int[] somar (int[] vetor1, int[] vetor2) {
        int somaVetor1Vetor2[] = new int[10];
        for (int i = 0; i < somaVetor1Vetor2.length; i++) {
            somaVetor1Vetor2[i] = vetor1[i] + vetor2[i];
        }
        return somaVetor1Vetor2;
        
    }

    private void escreverValores(int[] somaVetor1Vetor2) {
        
        for (int i = 0; i < somaVetor1Vetor2.length; i++) {
            
            System.out.println("O vetor da soma dos vetores 1 e 2 [" + i + "]: " + somaVetor1Vetor2[i]);
           
            }
        }
        

    public static void main(String[] args) {
        new Uni6Exe04();
    }

}


