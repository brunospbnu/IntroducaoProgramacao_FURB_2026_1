package Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa de Controle de abastecimentos e KM / Litro");
        System.out.print("Informe o total de reabastecimentos: ");
        int reabastecimentos = teclado.nextInt();
        double quilometragemAtual = 0;
        double quilomatragemTotal = 0;
        double litrosAtuais = 0; 
        double litrosTotais = 0;
        double km_litroAtual = 0;

        for (int contagem = 1; contagem <= reabastecimentos; contagem++) {

            System.out.println("Parada " + contagem + " Informe os dados: ");
            System.out.print("Quilometragem: ");
            quilometragemAtual = teclado.nextDouble();
            System.out.print("Combustível: "); 
            litrosAtuais = teclado.nextDouble();
            
            km_litroAtual = quilometragemAtual / litrosAtuais;

            quilomatragemTotal = quilomatragemTotal + quilometragemAtual;

            litrosTotais = litrosTotais + litrosAtuais;

            System.out.println("Resultado Parada " + contagem + ": " + km_litroAtual + " km por litro");

        }

        double media = quilomatragemTotal / litrosTotais;
        System.out.println("Quilometragem média obtida por litro: " + media);

        teclado.close();
    }
    
}

