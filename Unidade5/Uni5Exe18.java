package Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para calcular porcentagem de audiência de canais de TV (nº 4, 5, 9 ou 12) --- ");

        
        System.out.print("Digite o número do canal da 1ª casa analisada (ou 0 para encerrar): ");
        int canal = teclado.nextInt();
        int casasAnalisadas = 1;
        int canal4Audiencia = 0;
        int canal5Audiencia = 0;
        int canal9Audiencia = 0;
        int canal12Audiencia = 0;

        while (canal != 4 && canal != 5 && canal != 9 && canal != 12 && canal != 0) {
            System.out.println("Canal inválido, digite o canal (4, 5, 9, ou 12)");
            canal = teclado.nextInt();
        }

        while (canal != 0) {
            
            System.out.print("Digite a quantidade de pessoas assistindo a TV nesta casa: ");
            int pessoasAssistindoAtual = teclado.nextInt();
            casasAnalisadas++;

            if (canal == 4) {
                canal4Audiencia = canal4Audiencia + pessoasAssistindoAtual;
            }

            else if (canal == 5) {
                canal5Audiencia = canal5Audiencia + pessoasAssistindoAtual;
            }

            else if (canal == 9) {
                canal9Audiencia = canal9Audiencia + pessoasAssistindoAtual;
            }

            else if (canal == 12) {
                canal12Audiencia = canal12Audiencia + pessoasAssistindoAtual;
            }

            System.out.print("Digite o canal da " + casasAnalisadas + "ª casa analisada (ou 0 para encerrar):");
            canal = teclado.nextInt();

                while (canal != 4 && canal != 5 && canal != 9 && canal != 12 && canal != 0) {
                    System.out.println("Canal inválido, digite o canal (4, 5, 9, ou 12)");
                    canal = teclado.nextInt();
                }
        
            }

            int totalPessoasAssistindo = canal4Audiencia + canal5Audiencia + canal9Audiencia + canal12Audiencia;

            if (totalPessoasAssistindo != 0) {

            int canal4Porcentagem = canal4Audiencia * 100 / totalPessoasAssistindo;
            int canal5Porcentagem = canal5Audiencia * 100 / totalPessoasAssistindo;
            int canal9Porcentagem = canal9Audiencia * 100 / totalPessoasAssistindo;
            int canal12Porcentagem = canal12Audiencia * 100 / totalPessoasAssistindo;

            System.out.println("----- Resultados: ----" +
            
            "\n\r Percentual de audiência do canal 4: " + canal4Porcentagem + "%" +
            " \n\r Percentual de audiência do canal 5: " + canal5Porcentagem + "%" +
            " \n\r Percentual de audiência do canal 9: " + canal9Porcentagem + "%" +
            " \n\r Percentual de audiência do canal 12: " + canal12Porcentagem + "%");

            }

            else {
                System.out.println("Nenhum dado foi informado - Programa finalizado");
            }
            

        teclado.close();
    }
    
}
