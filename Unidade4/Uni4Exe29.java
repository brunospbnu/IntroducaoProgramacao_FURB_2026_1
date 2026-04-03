package Unidade4;

import java.util.Scanner;

public class Uni4Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para efetuar cálculos entre 2 números ---\nInforme o primeiro número");
        double valor1 = teclado.nextDouble();
        System.out.println("Informe o segundo número");
        double valor2 = teclado.nextDouble();

        System.out.println("Escolha uma opção: \r\n" + //
                        "+ - Soma de dois números. \r\n" + //
                        "- - Diferença entre dois números. \r\n" + //
                        "/ - Produto entre dois números. \r\n" + //
                        "* - Divisão entre dois números (o denominador não pode ser zero). ");
        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case ('+'):
                double soma = (valor1 + valor2);
                System.out.println(soma);
                break;
            case ('-'):
                double diferenca = (valor1 - valor2);
                System.out.println(diferenca);
                break;
            case ('*'):
                double produto = (valor1 * valor2);
                System.out.println(produto);
                break;
            case ('/'):
                double divisao = (valor1 / valor2);
                System.out.println(divisao);
                break;
        
            default: System.out.println("Erro: Opção Inválida");
                break;
        }

        teclado.close();}
    }