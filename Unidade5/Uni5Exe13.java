package Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa de Controle de abastecimentos e KM / Litro");
        System.out.print("Informe o total de reabastecimentos: ");
        int reabastecimentos = teclado.nextInt();
        double quilometragemPercorrida = 0;
        double litrosAtuais = 0; 
        double km_litroAtual = 0;
        double km_litroTotal = 0;

        for (int contagem = 1; contagem <= reabastecimentos; contagem++) {

            System.out.println("Parada " + contagem + " Informe os dados: ");
            System.out.print("Quilometragem: ");
            quilometragemPercorrida = teclado.nextDouble();
            System.out.print("Combustível: "); 
            litrosAtuais = teclado.nextDouble();
            
            km_litroAtual = quilometragemPercorrida / litrosAtuais;

            km_litroTotal = km_litroTotal + km_litroAtual;

            System.out.println("Resultado Parada " + contagem + ": " + km_litroAtual + " km por litro");

        }

        double media = km_litroTotal / reabastecimentos;
        System.out.println("Quilometragem média obtida por litro: " + media);

        teclado.close();
    }
    
}
