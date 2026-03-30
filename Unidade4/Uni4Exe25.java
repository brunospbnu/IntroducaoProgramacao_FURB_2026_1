package Unidade4;

import java.util.Scanner;

/*
Análise:

Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções: 
Escolha uma opção: 
1 - Soma de dois números. 
2 - Diferença entre dois números. 
3 - Produto entre dois números. 
4 - Divisão entre dois números (o denominador não pode ser zero).

OK

Entradas:
valor1
valor2
opcao


Saida:
soma
diferenca
produto
divisao


Algoritmo:

escrever 
"--- Programa para efetuar cálculos entre 2 números ---"
"Informe o primeiro número"
ler valor1
"Informe o segundo número"
ler valor2

escrever "Escolha uma opção: 
1 - Soma de dois números. 
2 - Diferença entre dois números. 
3 - Produto entre dois números. 
4 - Divisão entre dois números (o denominador não pode ser zero). "

ler opcao

escolha opcao
Se 1, então soma = valor1 + valor 2
escrever soma

Se 2, então diferenca = valor1 - valor2
escrever diferenca

Se 3, então produto = valor1 * valor2
escrever produto

Se 4, então divisao = valor1/valor2
escrever divisao

Senão escrever "Opção Inválida"

FIM

*/
public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para efetuar cálculos entre 2 números ---\nInforme o primeiro número");
        double valor1 = teclado.nextDouble();
        System.out.println("Informe o segundo número");
        double valor2 = teclado.nextDouble();

        System.out.println("Escolha uma opção: \r\n" + //
                        "1 - Soma de dois números. \r\n" + //
                        "2 - Diferença entre dois números. \r\n" + //
                        "3 - Produto entre dois números. \r\n" + //
                        "4 - Divisão entre dois números (o denominador não pode ser zero). ");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                double soma = (valor1 + valor2);
                System.out.println(soma);
                break;
            case 2:
                double diferenca = (valor1 - valor2);
                System.out.println(diferenca);
                break;
            case 3:
                double produto = (valor1 * valor2);
                System.out.println(produto);
                break;
            case 4:
                double divisao = (valor1 / valor2);
                System.out.println(divisao);
                break;
        
            default: System.out.println("Erro: Opção Inválida");
                break;
        }

        teclado.close();}
    }
