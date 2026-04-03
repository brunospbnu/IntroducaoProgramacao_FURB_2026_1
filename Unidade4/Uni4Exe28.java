package Unidade4;

import java.util.Scanner;

/*

*/
public class Uni4Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Programa para ler nº de 1 a 7  e informar dia da semana ---");
        System.out.print("Informe o nº: ");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            
            default:
                System.out.println("Dia inválido");
                break;
        }
        teclado.close();}
    }
