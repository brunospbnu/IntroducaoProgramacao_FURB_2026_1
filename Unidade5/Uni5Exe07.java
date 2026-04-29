package Unidade5;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para ler N números e informar qual o maior e qual o menor");
        System.out.print("Digite o valor de N: ");
        int n = teclado.nextInt();
        int repeticoes = 0;
        double numeroMaior = 0;
        double numeroMenor = 0;
        double numeroAtual;
        for (repeticoes = 1; repeticoes <= n; repeticoes++){
            System.out.print("Digite o número real de posição nº " + repeticoes + " : ");
            numeroAtual = teclado.nextDouble();

            if (repeticoes == 1) {
                numeroMaior = numeroAtual;
                numeroMenor = numeroAtual;
            }

            if (numeroAtual > numeroMaior) {
                numeroMaior = numeroAtual;
            }

            if (numeroAtual < numeroMenor) {
                numeroMenor = numeroAtual;
                
            }
        }

        System.out.println("O número maior é = " + numeroMaior);
        System.out.println("O número menor é = " + numeroMenor);
    teclado.close();
}

}
