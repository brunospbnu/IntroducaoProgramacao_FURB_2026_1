package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para soma de peso de peixes e controle de limite diário de pesca" +
                            "\n\r Informe o limite diário de peso dos peixes (em KG)");
        double limiteDiario = teclado.nextDouble();

        System.out.print("Informe o peso do 1º peixe em gramas (G): ");
        double pesoPeixeAtual = teclado.nextDouble();
        double pesoTotal = 0;
        pesoTotal = pesoTotal + (pesoPeixeAtual / 1000.00);
        int quantidadePeixes = 1;
        char resposta = 's';

        while (pesoTotal < limiteDiario && resposta == 's') {
            System.out.print("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?: ");
            resposta = teclado.next().charAt(0);

            if (resposta == 's') {
                quantidadePeixes++;
                System.out.print("Informe o peso do " + quantidadePeixes +"º peixe em gramas (G): ");
                pesoPeixeAtual = teclado.nextDouble();
                pesoTotal = pesoTotal + (pesoPeixeAtual / 1000.00);
            }

            if (pesoTotal >= limiteDiario) {
                System.out.println("\n\r Limite Diário atingido !!!");
                
            }
        }
        
        System.out.println("\n\r Peso total = " + pesoTotal + " KG");

        teclado.close();
    }
    
}
