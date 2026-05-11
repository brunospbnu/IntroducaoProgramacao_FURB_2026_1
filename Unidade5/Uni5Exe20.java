package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para calcular tempo necessário para que essa massa de um material radioativo se torne menor que 0,5 gramas");
        System.out.println("Informe a quantidade do material em KG: ");
        double massaAtual = teclado.nextDouble();
        double massaInicial = massaAtual;
        double massaEmGramas = 0;

        int segundosDecorridos = 0;

        while (massaAtual >= 0.0005) {

            massaAtual = massaAtual / 2.00;
            segundosDecorridos = segundosDecorridos + 50;
            massaEmGramas = massaAtual * 1000;

            System.out.println("Segundos Decorridos: " + segundosDecorridos + " / Massa no segundo atual (em gramas): " + massaEmGramas);

        }

        System.out.println("--- Finalizando --- \n\r Massa Inicial = " + massaInicial + " KG" + 
                            "\n\r Massa Final = " + massaEmGramas + " gramas" +
                            "\n\r Tempo decorrido = " + segundosDecorridos + " segundos");

        teclado.close();
    }
    
}
