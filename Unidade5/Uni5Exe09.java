package Unidade5;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para ler N alunos, coletar o nome e a idade de cada e: \n \r Escrever os nomes dos alunos que tem 18 anos; \n \r Escrever a quantidade dde alunos que tem idade acima de 20 anos;");
        System.out.println("Digite o valor de N");
        int n = teclado.nextInt();
        String nomeAlunoAtual = "";
        String nomesAlunosMais18 = "";
        int idadeAlunoAtual = 0;
        int quantidadeAlunosMais20 = 0;


        for (int contagem = 1; contagem <= n; contagem++) {
            System.out.print("Escreva o NOME do(a) aluno(a) de posição nº " + contagem + " : ");
            nomeAlunoAtual = teclado.next();
            System.out.print("Escreva a IDADE do(a) aluno(a) de posição nº " + contagem + " : ");
            idadeAlunoAtual = teclado.nextInt();
            System.out.println("----- Seguindo para o próximo aluno(a) -----");

            if (idadeAlunoAtual == 18) {

                nomesAlunosMais18 = nomesAlunosMais18 + " " + nomeAlunoAtual;

            }

            if (idadeAlunoAtual > 20) {

                quantidadeAlunosMais20++;
                
            }



        }

        System.out.println("Nomes dos alunos que tem 18 anos: " + nomesAlunosMais18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + quantidadeAlunosMais20);

        teclado.close();

    }
    
}
