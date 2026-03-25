package Unidade4;

import java.util.Scanner;

/*
Análise:
Ler data e determinar se é valida.
Mês entre 1 e 12.
Verificar se o número de dias existe no mês.
Verificar Fevereiro, se for ano bissexto tem 29 dias.


Entradas:
dia
mes
ano


Saida:
"Data Valida"
OU
"Data Inválida"


Algoritmo:
ler dia
ler mes
ler ano
anoBissexto = false
Se ano % 400 == 0, então
anoBissexto = true
Senão se (ano % 100 == 0) E (ano % 400 != 0), então 
anoBissexto = false
Senão se ano % 4 == 0, então
anoBissexto = true
Senão
anoBissexto = false


Se mes < 1 ou > 12, então
escrever "A data digitada é inválida"
Senão se dia < 1, então
escrever "A data digitada é inválida"
Senão se (mes = 1 ou 3 ou 5 ou 7 ou 8 ou 10 ou 12) E dia > 31, então
escrever "A data digitada é inválida"
Senão se (mes = 4 ou 6 ou 9 ou 11) E dia > 30, então
escrever "A data digitada é inválida"
Senão se (anoBissexto = false) E (mês == 2) E (dia > 28), então
escrever "A data digitada é inválida"
Senão se (anoBissexto = true) E (mês == 2) E (dia > 29), então
escrever "A data digitada é inválida"
Senão
escrever "A data digitada é valida - OK"
FIM

*/
public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para verificar se uma data é valida---");
        System.out.println("Digite o DIA");
        int dia = teclado.nextInt();
        System.out.println("Digite o MÊS");
        int mes = teclado.nextInt();
        System.out.println("Digite o ANO");
        int ano = teclado.nextInt();
        boolean anoBissexto = false;
        if (ano % 400 == 0) {
            anoBissexto = true;
        }
        else if ((ano % 100 == 0) && (ano % 400 != 0)){
            anoBissexto = false;
        }
        else if (ano % 4 == 0) {
            anoBissexto = true;
        }
        else {
            anoBissexto = false;
        }

        if ((mes < 1) || (mes > 12)) {
            System.out.println("A data digitada é inválida");
        }
        else if (dia < 1) {
            System.out.println("A data digitada é inválida");
        }
        else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31)) {
            System.out.println("A data digitada é inválida");
        }
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) {
            System.out.println("A data digitada é inválida");
        }
        else if ((anoBissexto == false) && (mes == 2) && (dia > 28)) {
            System.out.println("A data digitada é inválida");
        }
       else if ((anoBissexto == true) && (mes == 2) && (dia > 29)) {
            System.out.println("A data digitada é inválida");
        }
       else {
        System.out.println("A data digitada é Valida - OK");
       }

        teclado.close();
    }
    }
