// Bruno Schwabe Patricio

package Avaliações;

import java.util.Scanner;

public class Prova2Questão2 {

    public Prova2Questão2() {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        n = coletarN(teclado,n);
        String[] votos = new String[n];
        coletarVotos(teclado, votos);

        String[] vunicos = new String[votos.length];
        int quantidade = 0;
        for (int i = 0 ; i < votos.length; i++) {
            if (!buscar(votos[i], vunicos)) {
                vunicos[quantidade] = votos[i];
                quantidade++;
            }
        }
        processarEImprimirDados(votos, vunicos, quantidade);
        teclado.close();
    }

    private int coletarN(Scanner teclado, int n) {
        n = 0;
        do {
            System.out.print("Informe a quantidade de votos (valor de 'N'): ");
            n = teclado.nextInt();

            if (n > 20 || n < 0) {
            System.out.println("Valor de 'N' inválido !!!");
            }

        } while (n > 20 || n < 0);
        
        return n;
    }

    private void coletarVotos(Scanner teclado, String[] votos) {
        for (int i = 0 ; i < votos.length; i++) {
            System.out.print("Informe o sabor escolhido pelo " + (i+1) + "º participante: ");
            votos[i] = teclado.next();
        }
    }

    private boolean buscar(String votos, String[] vunicos) {
        for (int i = 0 ; i < vunicos.length; i++) {
            if (votos.equalsIgnoreCase(vunicos[i])) {
               return true; 
            }
        }
        return false;
    }

    private void processarEImprimirDados(String[] votos, String[] vunicos, int quantidade) {
        System.out.println("    VALOR    |    FREQUENCIA   ");
        for (int i = 0 ; i < quantidade ; i++) {
            int qtdVezes = 0;
            for (int j = 0; j < votos.length; j++) {
                if (vunicos[i].equalsIgnoreCase(votos[j])) {
                    qtdVezes++;
                }
            }
            System.out.println("    "+vunicos[i]+"    |    "+qtdVezes+"   ");
        } 
        
}
    public static void main(String[] args) {
        new Prova2Questão2();
    }
}
