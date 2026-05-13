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

       System.out.print("Iniciando: \n\r Digite E (ponto da esquerda) ou D (ponto da direita): ");

       char pontoAtual = teclado.next().charAt(0);
       pontoAtual = Character.toLowerCase(pontoAtual);
       int somaDosPontosE = 0;
       int somaDosPontosD = 0;

        while (pontoAtual != 'e' && pontoAtual !='d') {
            System.out.print("Informação Incorreta !!! \n\r Digite E (ponto da esquerda) ou D (ponto da direita): ");
            pontoAtual = teclado.next().charAt(0);
            pontoAtual = Character.toLowerCase(pontoAtual);
        }

        while ((somaDosPontosD < 21 && somaDosPontosE < 21)) {
            if (pontoAtual == 'e') {
                somaDosPontosE++;
            }
            else if (pontoAtual =='d') {
                somaDosPontosD++;
            }

            if ((somaDosPontosD < 21 && somaDosPontosE < 21)) {
                
            
            System.out.print("Proxima Rodada: \n\r Digite E (ponto da esquerda) ou D (ponto da direita): ");

            pontoAtual = teclado.next().charAt(0);
            pontoAtual = Character.toLowerCase(pontoAtual);
            
                while (pontoAtual != 'e' && pontoAtual !='d') {
                System.out.print("Informação Incorreta !!! \n\r Digite E (ponto da esquerda) ou D (ponto da direita): ");
                pontoAtual = teclado.next().charAt(0);
                pontoAtual = Character.toLowerCase(pontoAtual);
                }
            }
       }

       if ((somaDosPontosD - somaDosPontosE >= 2) || (somaDosPontosE - somaDosPontosD >= 2)) {
        
       
            while ((somaDosPontosD > 21 && somaDosPontosE > 21)) {
                System.out.println("'Vai a Dois':");
            
                if (pontoAtual == 'e') {
                somaDosPontosE++;
                }
                else if (pontoAtual =='d') {
                somaDosPontosD++;
            }

            System.out.print("Proxima Rodada: \n\r Digite E (ponto da esquerda) ou D (ponto da direita): ");

            pontoAtual = teclado.next().charAt(0);
            pontoAtual = Character.toLowerCase(pontoAtual);
            
                while (pontoAtual != 'e' && pontoAtual !='d') {
                    System.out.print("Informação Incorreta !!! \n\r Digite E (ponto da esquerda) ou D (ponto da direita): ");
                    pontoAtual = teclado.next().charAt(0);
                    pontoAtual = Character.toLowerCase(pontoAtual);
                    }
       }
    }

       if (somaDosPontosE > somaDosPontosD) {
            System.out.println("FIM DE JOGO !!! \n\r O vencedor é o jogador da ESQUERDA !!!");
            System.out.println("Pontos da Esquerda = " + somaDosPontosE + " / Pontos da Direita = " + somaDosPontosD);
       }

       else if (somaDosPontosD > somaDosPontosE) {
            System.out.println("FIM DE JOGO !!! \n\r O vencedor é o jogador da DIREITA !!! ");
            System.out.println("Pontos da Direita = " + somaDosPontosD + " / Pontos da Esquerda = " + somaDosPontosE);
        }

        teclado.close();
    }
    
}
