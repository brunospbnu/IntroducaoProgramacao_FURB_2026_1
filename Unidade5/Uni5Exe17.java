package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n \r --- Programa para ler inscrições e alturas de atletas e informar o mais alto, o mais baixo e a altura média ---");

        int numeroInscricaoAtual = 1;
        double alturaAtual = 0;
        double alturaTotal = 0;
        int contagem = 1;

        double alturaMaisBaixo = 0;
        int inscricaoMaisBaixo = 0;

        double alturaMaisAlto = 0;
        int inscricaoMaisAlto = 0;
        
        System.out.println("Informe o Número de inscrição do atleta nº " + contagem + " ou '0' para finalizar");
        numeroInscricaoAtual = teclado.nextInt();
        

        while (numeroInscricaoAtual != 0) {
            
            System.out.println("Informe a Altura do Atleta nº " + contagem);
            alturaAtual = teclado.nextDouble();
            
            alturaTotal = alturaTotal + alturaAtual;

            if (contagem == 1) {
            alturaMaisAlto = alturaAtual;
            alturaMaisBaixo = alturaAtual;
            inscricaoMaisAlto = numeroInscricaoAtual;
            inscricaoMaisBaixo = numeroInscricaoAtual;
            }

            else {

                if (alturaAtual > alturaMaisAlto) {

                    alturaMaisAlto = alturaAtual;
                    inscricaoMaisAlto = numeroInscricaoAtual;
                }
                
                if (alturaAtual < alturaMaisBaixo) {

                    alturaMaisBaixo = alturaAtual;
                    inscricaoMaisBaixo = numeroInscricaoAtual;
                    
                }
            }

            contagem++;

            System.out.println("Informe o Número de inscrição do atleta nº " + contagem + " ou '0' para finalizar");
            numeroInscricaoAtual = teclado.nextInt();
        }

        double media = alturaTotal / (contagem-1);


        System.out.println("O atleta mais baixo tem " + alturaMaisBaixo + "m e o seu número de inscrição é " + inscricaoMaisBaixo);
        System.out.println("O atleta mais alto tem " + alturaMaisAlto + "m e o seu número de inscrição é " + inscricaoMaisAlto);
        System.out.println("A altura média do grupo de atletas é: " + media);

        teclado.close();
    }
}
