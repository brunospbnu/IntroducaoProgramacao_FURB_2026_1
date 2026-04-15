package Avaliações;

import java.util.Scanner;

public class Prova1Questão1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para avaliar situação do aluno");
        System.out.println("Digite a Nota 1");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a Nota 2");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a quantidade de faltas");
        int faltas = teclado.nextInt();
        System.out.println("Informe 'true' se o aluno fez ou trabalho extra ou 'false' se não");
        boolean fezTrabalhoExtra = teclado.nextBoolean();

        double media = (nota1 + nota2) / 2;
        String resultado = "";

        if (faltas > 15) {
            resultado = "Reprovado por falta";
        }

        // Segundo o fluxograma da avaliação a segunda condição deveria ser apenas IF.
        else if (media >= 7) {
            resultado = "Aprovado";
        }

        else if (media >= 5) {
            if (fezTrabalhoExtra == true) {
                media = media + 1;
            }
            else {
                resultado = "Em exame";
            }
        }

        else if (media < 3) {
            resultado = "Reprovado por nota";
        }

        else {
            resultado = "Em exame";
        }

        System.out.println(resultado);

        teclado.close();
        
        }

    }
