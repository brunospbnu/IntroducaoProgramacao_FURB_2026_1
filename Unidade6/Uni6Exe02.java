package Unidade6;

import java.util.Scanner;

public class Uni6Exe02 {

    public Uni6Exe02() {
        double valoresReais[] = new double[12];

        valoresReais = lerDados();
        
        double media = Media(valoresReais);

        escreverMaioresQueMedia(valoresReais, media);
    }

    private double[] lerDados() {

        Scanner s = new Scanner(System.in);

        double valoresReais[] = new double[12];

        for (int i = 0; i < valoresReais.length; i++) {
            System.out.print("Digite o número real de posição " + (i+1) + ": ");
            valoresReais[i] = s.nextDouble();
            }
            s.close();
            return valoresReais;
    }

    private double Media(double valoresReais[]) {
        double soma = 0;

        for (int i = 0; i < valoresReais.length; i++) {
            soma =  soma + valoresReais[i];
        }

        double media = soma / valoresReais.length;

        return media;
    }


    private void escreverMaioresQueMedia(double valoresReais[], double media) {

        System.out.println("Média = " + media);

        for (int i = 0; i < valoresReais.length; i++) {

           if (valoresReais[i] > media) {

            System.out.println("O valor " + valoresReais[i] + " é maior que a média");
           
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe02();
    }
    
}
