package Unidade6;

import java.util.Scanner;

public class Uni6Exe05 {
    public Uni6Exe05() {
        Scanner teclado = new Scanner(System.in);
        String respostasRapaz[] = new String[5];
        String respostasMoca[] = new String[5];

        lerRespostas(teclado, respostasRapaz, respostasMoca);

        calcularEEscrever(respostasRapaz, respostasMoca);

    }

    private void lerRespostas(Scanner teclado, String respostasRapaz[], String respostasMoca[]) {
        System.out.println("A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente).");

        System.out.println("RAPAZ - RESPONDA:");
        System.out.print("Gosta de música sertaneja? (Digite SIM / NÃO) ");
        respostasRapaz[0] = teclado.next();
        System.out.print("Gosta de futebol? (Digite SIM / NÃO) ");
        respostasRapaz[1] = teclado.next();
        System.out.print("Gosta de seriados? (Digite SIM / NÃO) ");
        respostasRapaz[2] = teclado.next();
        System.out.print("Gosta de redes sociais? (Digite SIM / NÃO) ");
        respostasRapaz[3] = teclado.next();
        System.out.print("Gosta da Oktoberfest? (Digite SIM / NÃO) ");
        respostasRapaz[4] = teclado.next();

        System.out.println("MOÇA - RESPONDA:");
        System.out.print("Gosta de música sertaneja? (Digite SIM / NÃO) ");
        respostasMoca[0] = teclado.next();
        System.out.print("Gosta de futebol? (Digite SIM / NÃO) ");
        respostasMoca[1] = teclado.next();
        System.out.print("Gosta de seriados? (Digite SIM / NÃO) ");
        respostasMoca[2] = teclado.next();
        System.out.print("Gosta de redes sociais? (Digite SIM / NÃO) ");
        respostasMoca[3] = teclado.next();
        System.out.print("Gosta da Oktoberfest? (Digite SIM / NÃO) ");
        respostasMoca[4] = teclado.next();
    }

    private void calcularEEscrever(String respostasRapaz[], String respostasMoca[]) {
        int pontos = 0;
        String mensagem = "";

        for (int i = 0; i < respostasRapaz.length; i++) {
            if (respostasRapaz[i].equalsIgnoreCase(respostasMoca[i]) ) {
                pontos = pontos + 3;
            }
            else if (respostasRapaz[i].equalsIgnoreCase("IND")|| respostasMoca[i].equalsIgnoreCase("IND")) {
                pontos++;
            }
            else {
                pontos = pontos - 2;
            }
        }

        if (pontos >= 15) {
            mensagem = "Casem!";
        }
        else if (pontos >= 10 && pontos <=14) {
            mensagem = "Vocês têm muita coisa em comum!";
        }
        else if (pontos >= 5 && pontos <= 9) {
            mensagem = "Talvez não dê certo :(";
        }
        else if (pontos >= 0 && pontos <=4) {
            mensagem = "Vale um encontro.";
        }
        else if (pontos <= -1 && pontos >= -9) {
            mensagem = "Melhor não perder tempo";
        }
        else if (pontos <= -10) {
            mensagem = "Vocês se odeiam!";
        }


        System.out.println("Afinidade = " + pontos + " // " + mensagem);


    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
    
}
