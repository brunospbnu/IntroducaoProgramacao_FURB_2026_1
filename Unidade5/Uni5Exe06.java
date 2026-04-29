package Unidade5;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int contagem = 1;
    double soma = 0;
    double alturaPessoaAtual = 0;
    for (contagem = 1; contagem <=20; contagem++) {
        System.out.print("Digite a Altura da pessoa nº " + contagem + " : ");
        alturaPessoaAtual = teclado.nextDouble();
        soma = soma + alturaPessoaAtual;

    }
    double media = soma / 20.00;

    System.out.println("A média das alturas é = " + media);
    teclado.close();
    }
}
