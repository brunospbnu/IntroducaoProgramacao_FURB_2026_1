package Unidade6;

import java.util.Scanner;

public class Uni6Exe06 {

    public Uni6Exe06() {
        Scanner s = new Scanner(System.in);
        int n = 0;

        n = lerN(s, n);

        double vetorReal[] = new double[n];

        vetorReal = popularVetor(s, vetorReal);

        encontrarValor(s, vetorReal);

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

    private void encontrarValor(Scanner s, double vetorReal[]) {
        System.out.print("Digite o valor a ser procurado no vetor: ");
        double valorAProcurar = s.nextDouble();

        for (int i = 0; i < vetorReal.length; i++) {
            if (valorAProcurar == vetorReal[i]) {
                System.out.println("O valor " + valorAProcurar + " foi encontrado na posição nº " + (i+1) + " do vetor");
            }
            else {
                if(i == vetorReal.length-1 && valorAProcurar == vetorReal[i] )
                    {
                    System.out.println("O número não foi encontrado"); }
            }
        }

    }
            
    public static void main(String[] args) {
        new Uni6Exe06();
    }
}
