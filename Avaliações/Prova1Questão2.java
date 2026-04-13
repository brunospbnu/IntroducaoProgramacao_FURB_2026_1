package Avaliações;

import java.util.Scanner;

public class Prova1Questão2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa de cálculo de valor devido no estacionamento ---");
        System.out.println("Informe a modalidade de cobrança: \r\n 'H' para hora; \r\n 'D' para diária ou; \r\n 'M' para mensalista.");
        char modalidade = teclado.next().charAt(0);
        double valorAPagar = 0;

        switch (modalidade) {
            case 'H':
                System.out.print("Informe o Número de Horas Utilizadas: ");
                int numHoras = teclado.nextInt();
                valorAPagar = numHoras * 8;
                System.out.println("O valor a ser pago pelo cliente é de R$ " + valorAPagar);
                
                break;

            case 'D':
                System.out.print("Informe o Número de Diárias Utilizadas: ");
                int numDiarias = teclado.nextInt();
                valorAPagar = numDiarias * 50;
                System.out.println("O valor a ser pago pelo cliente é de R$ " + valorAPagar);
               
                break;

            case 'M':
                System.out.print("Informe o valor da mensalidade: ");
                double valorMensalidade = teclado.nextDouble();
                System.out.print("Informe o dia do vencimento: ");
                int diaVencimento = teclado.nextInt();
                System.out.print("Informe o dia do pagamento: ");
                int diaPagamento = teclado.nextInt();
                if (diaPagamento <= diaVencimento) {
                    valorAPagar = valorMensalidade * 0.92;
                    System.out.println("O pagamento está em dia. Desconto de 8 % aplicado");
                }
                else if ((diaPagamento > diaVencimento) && (diaPagamento <= (diaVencimento + 3))) {
                    valorAPagar = valorMensalidade;
                    System.out.println("O pagamento está atrasado em até 3 dias - Desconto perdido, mas não foi aplicada multa");
                }
                else if (diaPagamento > (diaVencimento + 3)) {
                    int diasAtraso = diaPagamento - diaVencimento;
                    valorAPagar = valorMensalidade + (diasAtraso*(valorMensalidade * 0.03));
                    System.out.println("O pagamento está atrasado em mais de 3 dias - Multa aplicada");
                }
                System.out.println("O valor a ser pago pelo cliente é de R$ " + valorAPagar);
                
                break;

            default:
                System.out.println("A modalidade de cobrança informada está incorreta ! Reinicie o programa e tente novamente !");
                
                break;
        }
        teclado.close();
    }
}
