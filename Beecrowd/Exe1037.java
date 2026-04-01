package Beecrowd;

import java.util.Scanner;

/*
Análise:
Ler  valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos
([0,25], (25,50], (50,75], (75,100]) está.

Entradas:
valor


Saida:
"Intervalo" + intervalo
OU
"Fora do Intervalo"


*/
public class Exe1037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor = teclado.nextDouble();
        String intervalo = "Não Informado";

        if (valor >= 0 && valor <= 25) {
            intervalo = "[0,25]";
            System.out.println("Intervalo " + intervalo);
        }
        else if (valor > 25 && valor <= 50) {
            intervalo = "(25,50]";
            System.out.println("Intervalo " + intervalo);
        }
        else if (valor > 50 && valor <= 75) {
            intervalo = "(50,75]";
            System.out.println("Intervalo " + intervalo);
        }
        else if (valor > 75 && valor <= 100) {
            intervalo = "(75,100]";
            System.out.println("Intervalo " + intervalo);
        }
        else {
            System.out.println("Fora de intervalo");
        }
        teclado.close();}
    }
