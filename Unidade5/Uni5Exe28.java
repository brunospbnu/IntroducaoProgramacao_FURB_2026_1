package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Programa para ouvintes da radio votarem no melhor conjunto musical");

        char continuar = 's';
        int votosNenhumNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;

        while (continuar == 's') {
            System.out.println("Vote no melhor conjunto: " + 
                                "\n\r 1 - Nenhum de nós \n\r 2 - CPM22 \n\r 3 - Skank \n\r 4 - Jota Quest");

            int opcaoAtual = s.nextInt();

            do {
                switch (opcaoAtual) {
                    case 1:
                        votosNenhumNos++;
                        break;
                    case 2:
                        votosCPM22++;
                        break;
                    case 3:
                        votosSkank++;
                        break;
                    case 4:
                        votosJotaQuest++;
                        break;
                    default:
                        System.out.println("Opção Inválida - Informe novamente: ");
                        opcaoAtual = s.nextInt();
                    break;
            }

            } while (opcaoAtual > 4 || opcaoAtual < 1);

            do {
                System.out.println("mais um voto: s (SIM) / n (NÃO)? ");
                continuar = Character.toLowerCase(s.next().charAt(0));

                if (continuar != 's' && continuar != 'n') {
                    System.out.println("Resposta Inválida - Informe novamente (s ou n): ");
                }

            } while (continuar != 's' && continuar != 'n');
            
        }

        int totalVotos = votosNenhumNos + votosCPM22 + votosSkank + votosJotaQuest;

        String vencedor = "";

        if (votosNenhumNos > votosCPM22 && votosNenhumNos > votosSkank && votosNenhumNos > votosJotaQuest) {
            vencedor = "Nenhum de nós";
        }
        else if (votosCPM22 > votosSkank && votosCPM22 > votosJotaQuest) {
            vencedor = "CPM22";
        }
        else if (votosSkank > votosJotaQuest) {
            vencedor = "Skank";
        }
        else {
            vencedor = "Jota Quest";
        }



        System.out.println("Total de votos de cada:" + 
                                "\n\r 1 - Nenhum de nós = " + votosNenhumNos +
                                "\n\r 2 - CPM22 = " + votosCPM22 + 
                                "\n\r 3 - Skank = " + votosSkank +
                                "\n\r 4 - Jota Quest = " + votosJotaQuest);

        System.out.println("\n\rPercentual de votos de cada:" + 
                                "\n\r 1 - Nenhum de nós = " + (votosNenhumNos*100 /totalVotos) + "%" +
                                "\n\r 2 - CPM22 = " + (votosCPM22*100/totalVotos) + "%" +
                                "\n\r 3 - Skank = " + (votosSkank*100/totalVotos) + "%" +
                                "\n\r 4 - Jota Quest = " + (votosJotaQuest*100/totalVotos) + "%") ;

        System.out.println("\n\rVencedor: " + vencedor);
        s.close();
    }
    
}
