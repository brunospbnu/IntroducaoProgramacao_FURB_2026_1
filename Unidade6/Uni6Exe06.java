package Unidade6;

import java.util.Scanner;

public class Uni6Exe06 {

    public Uni6Exe06() {
        Scanner s = new Scanner(System.in);
        int n = 0;

        n = lerN(s, n);

        double vetorReal[] = new double[n];

        vetorReal = popularVetor(s, vetorReal);

        boolean encontrado = false;

        encontrado = encontrarValor(s, vetorReal, encontrado);

        responder(encontrado);

        s.close();
    }

    private int lerN(Scanner s, int n) {
        System.out.print("Digite o Valor de N (quantidade de valores a serem analisados): ");
        n = s.nextInt();
        return n;
    }

    private double[] popularVetor(Scanner s, double vetorReal[]) {
        for (int i = 0; i < vetorReal.length; i++) {
            System.out.print("Informe o valor de posição nº " + (i+1) + " :");
            vetorReal[i] = s.nextDouble();
        }
        return vetorReal;
    }

    private boolean encontrarValor(Scanner s, double vetorReal[], boolean encontrado) {
        System.out.print("Digite o valor a ser procurado no vetor: ");
        double valorAProcurar = s.nextDouble();

        for (int i = 0; i < vetorReal.length; i++) {
            if (valorAProcurar == vetorReal[i]) {
                encontrado = true;
            }
            else {
                encontrado = false;
            }
        }

        return encontrado;
    }

    private void responder(boolean encontrado) {
        if (encontrado) {
            System.out.println("O valor encontra-se cadastrado");
        }
        else {
            System.out.println("O valor não está cadastrado");
        }

    };
            
    public static void main(String[] args) {
        new Uni6Exe06();
    }
}
