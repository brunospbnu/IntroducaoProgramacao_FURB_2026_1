package Unidade5;

public class Uni5Exe10 {

    public static void main(String[] args) {
        System.out.println("Programa para pesquisar os 10 primeiros números naturais de 4 casas decimais 'XXXX' que: \n \r" 
        + "Se saparados em 2 números de 2 casas casas e esses 2 forem somados e depois elevados ao quadrado, resultam no número em  questão");

        int primeiraDezena;
        int segundaDezena;
        int soma;
        String numerosDaCondição = "";


        for (int contagem = 1000; contagem <= 9999; contagem++) {

            System.out.println("Analisando nº: " + contagem);

            primeiraDezena = contagem / 100;
            segundaDezena = contagem % 100;
            soma = primeiraDezena + segundaDezena;

            if (Math.pow(soma,2) == contagem) {
                numerosDaCondição = numerosDaCondição + " " + contagem;
            }
        }
        System.out.println("Os números que cumprem a condição são: " + numerosDaCondição);
    }
}
