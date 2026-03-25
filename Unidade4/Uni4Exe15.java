package Unidade4;

import java.util.Scanner;

/*

Análise:
Programa para exibir reajuste do funcionario.
Empresa concede 5% para o que tem até 12 meses de empresa.
Concede 7% para o que tem de 13 a 48 meses de empresa.



Entradas:
quantMeses

Saida:
"O funcionário irá receber 5% de reajuste"
OU
"O funcionário irá receber 7% de reajuste"
OU
"Reajuste não informado "

Algoritmo:
ler quantMeses
Se quantMeses >= 0 && quantMeses <= 12
escrever "O funcionário irá receber 5% de reajuste"
Senão se quantMeses >= 13 && quantMeses <= 48
escrever "O funcionário irá receber 7% de reajuste"
senão
escrever "Reajuste não informado "
FIM

*/
public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para verificar qual o reajuste de um funcionario em uma empresa ---");
        System.out.println("Digite o número de meses trabalhados");
        int quantMeses = teclado.nextInt();
        if (quantMeses >= 0 && quantMeses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        }
        else if (quantMeses >= 13 && quantMeses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        }
        else {
            System.out.println("Reajuste não informado");
        }
        teclado.close();}
    }
