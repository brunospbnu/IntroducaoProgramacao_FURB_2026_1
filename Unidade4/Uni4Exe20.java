package Unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Análise:
Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, 
usando a fórmula informada.

Entradas:
notaProva1
notaProva2
notaProva3
notaExercicios

Saida:
"A média de aprovaitamento foi: " + média + ". Conceito: " + conceito + ". " situacao


Algoritmo:

ler todas as entradas.

media = (notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios)/7
conceito = "Não Informado"
situacao = "Não Informada"

Se media >= 9.0
conceito = "A"

Senão se media >= 7.5 E media < 9.0
conceito = "B"

Senão se media >= 6.0 E media < 7.5
conceito = "C"

Senão se media >= 4.0 E media < 6.0
conceito = "D"

Senão se media < 4.0
conceito = "E"

Senão
escrever "erro no cálculo do conceito"

Se media < 6.0
situacao = "Reprovado"

Senão
situacao = "Aprovado"

escrever "A média de aprovaitamento foi: " + media + ". Conceito: " + conceito + ". " situacao

*/
public class Uni4Exe20 {
    public static void main(String[] args) {
        DecimalFormat formatar = new DecimalFormat("0.00");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para cálcular a média, conceito e aprovação de alunos");
        System.out.println("O cálculo da média é feito da seguinte forma: media = (notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios)/7");
        System.out.println("Informe o valor da Nota da Prova 1");
        double notaProva1 = teclado.nextDouble();
        System.out.println("Informe o valor da Nota da Prova 2");
        double notaProva2 = teclado.nextDouble();
        System.out.println("Informe o valor da Nota da Prova 3");
        double notaProva3 = teclado.nextDouble();
        System.out.println("Informe o valor da Nota dos Exercícios");
        double notaExercicios = teclado.nextDouble();

        double media = (notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios)/7;
        String conceito = "Não Informado";
        String situacao = "Não Informada";
        if(media >= 9.0) {
            conceito = "A";
        }
        else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
        }
        else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        }
        else if (media >= 4.0 && media < 6.0) {
           conceito = "D"; 
        }
        else if (media < 4.0) {
            conceito = "E";
        }

        else {
            conceito = "erro no cálculo do conceito";
        }
        if (media < 6.0) {
            situacao = "Reprovado";
        }
        else {
            situacao = "Aprovado";
        }
        
        System.out.println("A média de aprovaitamento foi: " + formatar.format(media) + ". Conceito: " + conceito + ". " + situacao); 

        teclado.close();}
    }
