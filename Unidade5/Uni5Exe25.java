package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para controle de disputa de jogo de 'pingue-pongue' " +
                            "\n\rInformação: Os pontos são anotados como 'D', ponto para o jogador do lado direito;" +
                            "\r\n"+"e E, ponto para o jogador do lado esquerdo da mesa. \r\n " +
                            "\r\n Precione ENTER para continuar");
       teclado.nextLine();

       int somaDosPontosE = 0;
       int somaDosPontosD = 0;


        while ((somaDosPontosD < 21 && somaDosPontosE < 21 || Math.abs(somaDosPontosE - somaDosPontosD) < 2)) {
            System.out.print("\nPlacar: E [" + somaDosPontosE + "] x [" + somaDosPontosD + "] D");
            System.out.print("\nDigite E ou D para marcar o ponto: ");

            char pontoAtual = Character.toLowerCase(teclado.next().charAt(0));

            // Validação de erro
            while (pontoAtual != 'e' && pontoAtual != 'd') {
                System.out.print("Informação Incorreta!!! \nDigite E ou D: ");
                pontoAtual = Character.toLowerCase(teclado.next().charAt(0));
            }

            // Atribui o ponto
            if (pontoAtual == 'e') {
                somaDosPontosE++;
            } else {
                somaDosPontosD++;
            }

            // Aviso de "Vai a dois"
            if (somaDosPontosE >= 20 && somaDosPontosD >= 20 && somaDosPontosE == somaDosPontosD) {
                System.out.println("=> Empate! O jogo vai a dois!");
            }
                
       }
    
// TELA DE FINALIZAÇÃO (Quando o while der Falso, ele cai direto aqui!)
        System.out.println("\n==================================");
        System.out.println("          FIM DE JOGO !!!         ");
        System.out.println("==================================");

        if (somaDosPontosE > somaDosPontosD) {
            System.out.println("O vencedor é o jogador da ESQUERDA !!!");
        } else {
            System.out.println("O vencedor é o jogador da DIREITA !!! ");
        }

        System.out.println("Pontos da Esquerda = " + somaDosPontosE + " / Pontos da Direita = " + somaDosPontosD);

        teclado.close();
    }
    
}
