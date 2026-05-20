package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular numero mínimo de cédulas \n\rInforme o valor inteiro pago: ");
        int valorInteiro = teclado.nextInt();

        int numNotas20 = 0;
        int numNotas10 = 0;
        int numNotas5 = 0;
        int numNotas2 = 0;
        int numNotas1 = 0;

        while (valorInteiro >= 20) {
            valorInteiro = valorInteiro -20;
            numNotas20++;
        }
        while (valorInteiro >= 10) {
            valorInteiro = valorInteiro -10;
            numNotas10++;
        }
        while (valorInteiro >=5) {
            valorInteiro = valorInteiro-5;
            numNotas5++;
        }
        while (valorInteiro >=2) {
            valorInteiro = valorInteiro -2;
            numNotas2++;
        }
        while (valorInteiro >=1) {
            valorInteiro = valorInteiro -1 ;
            numNotas1++;
        }
        
        System.out.println(numNotas20 + " nota(s) de R$ 20,00");
        System.out.println(numNotas10 + " nota(s) de R$ 10,00");
        System.out.println(numNotas5 + " nota(s) de R$ 5,00");
        System.out.println(numNotas2 + " nota(s) de R$ 2,00");
        System.out.println(numNotas1 + " nota(s) de R$ 1,00");
        teclado.close();
    }
    
}
