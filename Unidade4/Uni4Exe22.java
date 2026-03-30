package Unidade4;

import java.util.Scanner;

/*
Análise:
Escrever o título que o aluno vai receber conforme o curso que realizar.
(1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação)

Entradas:
numero


Saida:
titulo


Algoritmo:
ler entrada.

titulo = "Não Informado"

Escolha numero
Caso numero == 1 : titulo = "Bacharel em Ciência da Computação "
Caso numero == 2 : titulo = "Licenciado em Computação"
Caso numero == 3 : titulo = "Bacharel em Sistemas de Informação"
fim da escolha.

escrever "O título que o aluno vai receber é: " + titulo

FIM

*/
public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para identificar a titulação que o aluno vai receber no curso ---");
        System.out.println("(1 Ciência da Computação, 2 Licenciatura da Computação e 3 Sistemas de Informação)");
        System.out.println("Informe o curso: ");
        int numero = teclado.nextInt();

        String titulo = "Não Informado";

        switch (numero) {
            case 1 : titulo = "Bacharel em Ciência da Computação";
            break;
            case 2 : titulo = "Licenciado em Computação";
            break;
            case 3 : titulo = "Bacharel em Sistemas de Informação";
            break; }

        System.out.println("A titulação do aluno será: " + titulo);

        teclado.close();}
    }
