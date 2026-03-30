package Unidade4;

import java.util.Scanner;

/*
Análise:
Ler um número inteiro que representa um mês e escrever o mês por extenso.
Se for maior que 12 informar que não é valido.

Entradas:
numeroMes


Saida:
Escrever o mes por extenso.


Algoritmo:
ler numeroMes

Escolha numeroMes
Caso 1 : escrever "Janeiro"
Fim do caso
Caso 2 : escrever "Fevereiro"
Fim do caso
Caso 3 : escrever "Março"
Fim do caso
Caso 4 : escrever "Abril"
Fim do caso.
Caso 5 : escrever "Maio"
Fim do caso
Caso 6 : escrever "Junho"
Fim do caso
Caso 7 : escrever "Julho"
Fim do caso
Caso 8 : escrever "Agosto"
Fim do caso
Caso 9 : escrever "Setembro"
Fim do caso
Caso 10 : escrever "Outubro"
Fim do caso
Caso 11 : escrever "Novembro"
Fim do caso
Caso 12 : escrever "Dezembro"
Fim do caso
Senão
escrever "Valor inválido"

FIM.

*/
public class Uni4Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número de 1 à 12 para saber qual mês é: ");
        int numeroMes = teclado.nextInt();

        switch (numeroMes) {
            case 1: System.out.println("Janeiro");
            break;
            case 2: System.out.println("Fevereiro");
            break;
            case 3: System.out.println("Março");
            break;
            case 4: System.out.println("Abril");
            break;
            case 5: System.out.println("Maio");
            break;
            case 6: System.out.println("Junho");
            break;
            case 7: System.out.println("Julho");
            break;
            case 8: System.out.println("Agosto");
            break;
            case 9: System.out.println("Setembro");
            break;
            case 10: System.out.println("Outubro");
            break;
            case 11: System.out.println("Novembro");
            break;
            case 12: System.out.println("Dezembro");
            break;
            default: System.out.println("Valor Inválido");
                break;
        }

        teclado.close();}
    }
