package Unidade6;

import java.util.Scanner;

public class Uni6Exe09 {

    public Uni6Exe09() {
        Scanner teclado = new Scanner(System.in);
        int sexo[] = new int[30];
        int nota[] = new int[30];
        int idade[] = new int[30];
        lerDados(teclado, sexo, nota, idade);
        
        double mediaGeral = calcularMediaGeral(nota);

        double mediaHomens = calcularMediaHomens(nota, sexo);

        int notaMulherMaisJovem = notaMulherMaisJovem(nota, sexo, idade);

        int quantMulheresMais50NotaMaiorMedia = mulheresMais50NotaMaiorMedia(nota, sexo, idade, mediaGeral);

        escreverDados(mediaGeral, mediaHomens, notaMulherMaisJovem, quantMulheresMais50NotaMaiorMedia);

        teclado.close();
    }

    private void lerDados(Scanner teclado,int sexo[], int nota[],int idade[] ) {
        for (int i = 0; i < nota.length; i++) {
            System.out.print("Digite o Sexo do cliente nº " + (i+1) + ": ");
            sexo[i] = teclado.nextInt();
            System.out.print("Digite a Nota dada pelo cliente nº " + (i+1) + ": ");
            nota[i] = teclado.nextInt();
            System.out.print("Digite a Idade do cliente nº " + (i+1) + ": ");
            idade[i] = teclado.nextInt();
        }
        System.out.println("----------------");
    }

    private double calcularMediaGeral(int nota[]) {
        int soma = 0;
        for (int i = 0; i < nota.length; i++) {
            soma = soma + nota[i];
        }
        double media = (double) soma / nota.length;
        return media;
    }

    private double calcularMediaHomens(int nota[], int sexo[]) {
        int soma = 0;
        int quantidade = 0;
        for (int i = 0; i < nota.length; i++) {
            if (sexo[i] == 2) {
                soma = soma + nota[i];
                quantidade++;
            }
        }

        if (quantidade == 0) {
            return 0; // Se não teve homens, a média é 0
        }

        double media = (double) soma / quantidade;
        
        return media;
    }

    private int notaMulherMaisJovem(int nota[], int sexo[], int[] idade) {
        int notaMulherMaisJovem = 0;
        int idadeMulherMaisJovem = 5000;
        for (int i = 0; i < nota.length; i++) {
            if (sexo[i] == 1) { // Verifica se é mulher
                // Se a idade dela for menor que a menor idade registrada até agora...
                if (idade[i] < idadeMulherMaisJovem) { 
                    idadeMulherMaisJovem = idade[i]; // Atualiza a idade recorde
                    notaMulherMaisJovem = nota[i];   // Guarda a nota dela
                }
            }
            }
            return notaMulherMaisJovem;
        }

    private int mulheresMais50NotaMaiorMedia(int[] nota, int[] sexo, int[] idade, double mediaGeral) {
        int quantMais50 = 0;
        for (int i = 0; i < nota.length; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                quantMais50++;
            }
        }
        return quantMais50;

    }
    

    private void escreverDados(double mediaGeral, double mediaHomens, int notaMulherMaisJovem, int quantMulheresMais50NotaMaiorMedia) {
        System.out.println("A nota média geral do cinema é: " + mediaGeral);
        System.out.println("A nota média atribuida pelos homens é: " + mediaHomens);
        System.out.println("A nota atribuida pela mulher mais jovem é: " + notaMulherMaisJovem);
        System.out.println("A quantidade de mulheres com mais de 50 anos que deram nota superior a média geral é: " + quantMulheresMais50NotaMaiorMedia);

    }
    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
