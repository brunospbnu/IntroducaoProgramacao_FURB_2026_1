package Unidade5;

import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa para cálcular salário atual do funcionario" +
                            "\n\r Em 1995 foi contratado por R$ 2.000,00 em 1996 recebeu 1,50% de aumento" + 
                            "\n\r A cada ano recebeu o dobro de aumento do ano anterior");
        System.out.print("Digite o ano atual: ");

        int anoAtual = teclado.nextInt();
        int anoDoCalculo = 1995;
        double salario = 2000;
        double valorDoAumento = 0;

        while (anoDoCalculo < anoAtual) {
            anoDoCalculo++;

            if (anoDoCalculo == 1996) {
                valorDoAumento = 0.015;
                salario = salario + (salario* valorDoAumento);
            }

            else {
                valorDoAumento = valorDoAumento * 2;
                salario = salario + (salario * valorDoAumento);
            }

            System.out.println("No ano " + anoDoCalculo + " o salário aumentou para R$ " + salario);

        }

        System.out.println("O salário atual é de R$ " + salario);

        teclado.close();
    }
    
}
