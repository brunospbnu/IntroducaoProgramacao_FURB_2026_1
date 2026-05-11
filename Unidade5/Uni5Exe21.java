package Unidade5;

import java.text.DecimalFormat;

public class Uni5Exe21 {
    public static void main(String[] args) {
        System.out.println("Programa para cálcular quantos anos leva para Zé ser Maior que Chico" +
                            "\n\r Chico tem 1,50 metro e cresce 2 centímetros por ano" +
                            "\n\r Zé tem 1,10 metros e cresce 3 centímetros por ano.");
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        int contagemAnos = 0;

        DecimalFormat df = new DecimalFormat("0.00");

         while (alturaZe < alturaChico) {
            contagemAnos++;

            alturaChico = alturaChico + 0.02;
            alturaZe = alturaZe + 0.03;

            System.out.println("Passado " + contagemAnos + " ano: Altura Chico: " + df.format(alturaChico) + "/ Altura Zé: " + df.format(alturaZe));

        }
        
        System.out.println(" ---- Finalizando ---- \n\r Serão necessários " + contagemAnos + " anos para que Zé seja maior que Chico");

    }
    
}
