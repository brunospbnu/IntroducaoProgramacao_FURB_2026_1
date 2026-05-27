package Unidade6;

import java.util.Scanner;

public class Uni6Exe09 {

    public Uni6Exe09() {
        Scanner teclado = new Scanner(System.in);
        int sexo[] = new int[30];
        int nota[] = new int[30];
        int idade[] = new int[30];
        lerDados(teclado, sexo, nota, idade);
        
        int mediaGeral = calcularMediaGeral(nota);

        int mediaHomens = calcularMediaHomens(nota, sexo);

        escreverDados(mediaGeral);

        teclado.close();
    }

    private void lerDados(Scanner teclado,int sexo[], int nota[],int idade[] ) {
        for (int i = 0; i < nota.length; i++) {
            System.out.print("Digite o Sexo do cliente nº " + i);
            sexo[i] = teclado.nextInt();
            System.out.print("Digite a Nota dada pelo cliente nº " + i);
            nota[i] = teclado.nextInt();
            System.out.print("Digite a Idade do cliente nº " + i);
            idade[i] = teclado.nextInt();
        }
        System.out.println("----------------");
    }

    private int calcularMediaGeral(int nota[]) {
        int soma = 0;
        for (int i = 0; i < nota.length; i++) {
            soma = soma + nota[i];
        }
        int media = soma / nota.length;
        return media;
    }

    private int calcularMediaHomens(int nota[], int sexo[]) {
        int soma = 0;
        int quantidade = 0;
        for (int i = 0; i < nota.length; i++) {
            if (sexo[i] == 2) {
                soma = soma + nota[i];
                quantidade++;
            }
        }
        int media = soma / quantidade;
        return media;
    }

    private void escreverDados(int mediaGeral) {
        System.out.println("A média geral do cinema é: " + mediaGeral);
    }
    public static void main(String[] args) {
        new Uni6Exe09();
    }
}
