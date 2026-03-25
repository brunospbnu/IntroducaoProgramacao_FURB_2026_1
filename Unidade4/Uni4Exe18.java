package Unidade4;

import java.util.Scanner;

/*
Análise:
Analise de desconto ou multa em pagamento de parcelas em loja.
Se paga até o dia do vencimento ganha 10% de desconto.
Se paga até 5 dias após o vencimento perde o desconto.
Se paga com mais de 5 dias de atraso paga multa de 2% por cada dia de atraso.
Calcular valor a ser pago pelo cliente.
OK.

Entradas:
diaVencimento
diaPagamento
ValorPrestacao


Saida:
"O pagamento está em dia. Valor da prestação com desconto de 10% = " + valorPrestacao 
OU
"O pagamento está atrasado em até 5 dias. Sem desconto. Valor da prestação = " + valorPrestacao
"O pagamento está atrasado em mais de 5 dias. Multa de 2% por dia de atraso. Valor da prestação = " + valorPrestacao

Algoritmo:
ler as entradas

multaDiaria = 0,02 * ValorPrestacao

diasAtraso = diaPagamento - diaVencimento

Se diaPagamento < 1 OU diaPagamento > 31 OU diaVencimento < 1 OU diaVencimento > 31
escrever "Dia inválido - tente novamente"

Senão se diaPagamento <= diaVencimento
valorPrestacao = valorPrestacao * 0.90
escrever "O pagamento está em dia. Valor da prestação com desconto de 10% = " + valorPrestacao 

Senão se diaPagamento > diaVencimento E diaPagamento <= diaVencimento + 5
escrever "O pagamento está atrasado em até 5 dias. Sem desconto. Valor da prestação = " + valorPrestacao

Senão se diaPagamento > diaVencimento + 5
valorPrestacao = valorPrestacao + (multaDiaria * diasAtraso)
escrever "O pagamento está atrasado em mais de 5 dias. Multa de 2% por dia de atraso. Valor da prestação = " + valorPrestacao

*/
public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Programa para calcular o valor de uma prestasão, considerando descontos e multas conforme o caso ---");
        System.out.println("Digite o dia do vencimento da parcela:");
        int diaVencimento = teclado.nextInt();
        System.out.println("Digite o dia do pagamento:");
        int diaPagamento = teclado.nextInt();
        System.out.println("Digite o valor da parcela:");
        double valorPrestacao = teclado.nextDouble();

        double multaDiaria = 0.02 * valorPrestacao;
        int diasAtraso = diaPagamento - diaVencimento;

        if (diaPagamento < 1 || diaPagamento > 31 || diaVencimento < 1 || diaVencimento > 31){
            System.out.println("Dia inválido - tente novamente");
        }
        else if (diaPagamento <= diaVencimento) {
            valorPrestacao = valorPrestacao * 0.90;
            System.out.println("O pagamento está em dia. Valor da prestação com desconto de 10% = " + valorPrestacao); 
        }
        else if (diaPagamento > diaVencimento && diaPagamento <= diaVencimento + 5) {
            System.out.println("O pagamento está atrasado em até 5 dias. Sem desconto. Valor da prestação = " + valorPrestacao);
        }
        else if (diaPagamento > diaVencimento + 5) {
            valorPrestacao = valorPrestacao + (multaDiaria * diasAtraso);
            System.out.println("O pagamento está atrasado em mais de 5 dias. Multa de 2% por dia de atraso. Valor da prestação = " + valorPrestacao);
        }
        else {
            System.out.println("ERRO - Tente novamente");
        }
        teclado.close();}
    }
