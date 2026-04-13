package Avaliações;

import java.util.Scanner;

public class Prova1Questão3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o Tipo: ");
        char tipo = teclado.next().charAt(0);
        tipo = Character.toUpperCase(tipo);
        String características = "";
        if (tipo == 'A') {
            características = "Azul";
            System.out.println(características);
        }
        else if (tipo == 'V') {
            características = "Vermelha";
            System.out.println(características);
        }
        else if (tipo == 'P') {
            características = "Preta";
            System.out.println(características);
        }
        else {
            System.out.println("Tipo Incorreto");
        }
        teclado.close();
    }
}
