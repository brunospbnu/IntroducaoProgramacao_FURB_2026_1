package Unidade4;

import java.util.Scanner;

/*
Análise:
Ler idade de 2 homes e 2 mulheres.
Idade entre homens e mulheres sempre diferentes.
Apresentar a soma das idades do homem mais velho com a mulher mais nova
Apresentar o produto das idades do homem mais novo com a mulher mais velha.

Entradas:
idadeH1
idadeH2
idadeM1
idadeM2


Saida:
Soma idade homem mais velho com a mulher mais nova
Produto pdas idades do homem mais novo com a mulher mais velha.

Algoritmo:
ler todas as entradas acima.
idadeHMaisVelho = 0
idadeHMaisNovo = 0
idadeMMaisVelha = 0
idadeMMaisNova = 0

Se idadeH1 > idadeH2
idadeHMaisVelho = idadeH1
idadeHMaisNovo = idadeH2

Se idadeH2 > idadeH1
idadeHMaisVelho = idadeH2
idadeHMaisNovo = idadeH1

Se idadeM1 > idadeM2
idadeMMaisVelha = idadeM1
idadeMMaisNova = idadeM2

Se idadeM2 > idadeM1
idadeMMaisVelha = idadeM2
idadeMMaisNova = idadeM1

soma = idadeHMaisVelho + idadeMMaisNova
produto = idadeHMaisNovo * idadeMMaisVelha

Escrever soma
esrecver produto

*/
public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para escrever a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais novo com a mulher mais velha. ");
        System.out.println("Digite a idade do primeiro homem");
        int idadeH1 = teclado.nextInt();
        System.out.println("Digite a idade do segundo homem");
        int idadeH2 = teclado.nextInt();
        System.out.println("Digite a idade da primeira mulher");
        int idadeM1 = teclado.nextInt();
        System.out.println("Digite a idade da segunda mulher");
        int idadeM2 = teclado.nextInt();

        int idadeHMaisVelho = 0;
        int idadeHMaisNovo = 0;
        int idadeMMaisVelha = 0;
        int idadeMMaisNova = 0;

        if (idadeH1 > idadeH2) {
            idadeHMaisVelho = idadeH1;
            idadeHMaisNovo = idadeH2;
        }

        if (idadeH2 > idadeH1) {
            idadeHMaisVelho = idadeH2;
            idadeHMaisNovo = idadeH1;
        }
        if (idadeM1 > idadeM2) {
            idadeMMaisVelha = idadeM1;
            idadeMMaisNova = idadeM2;
        }
        if (idadeM2 > idadeM1) {
            idadeMMaisVelha = idadeM2;
            idadeMMaisNova = idadeM1;
        }
        int soma = idadeHMaisVelho + idadeMMaisNova;
        int produto = idadeHMaisNovo * idadeMMaisVelha;

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é = " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é = " + produto);
        teclado.close();}
    }
