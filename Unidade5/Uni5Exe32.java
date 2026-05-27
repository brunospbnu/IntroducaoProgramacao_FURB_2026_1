package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Leitura das variáveis de entrada
        System.out.print("Digite o dia da semana do primeiro dia (1=Dom, 2=Seg, ..., 7=Sab): ");
        int p = teclado.nextInt();
        
        System.out.print("Digite o número de dias que o mês possui: ");
        int n = teclado.nextInt();

        System.out.println(); // Linha em branco para separar visualmente
        
        // 1. Impressão do cabeçalho
        System.out.println(" D  S  T  Q  Q  S  S");

        // Variável para controlar em que coluna (dia da semana) estamos no momento
        int colunaAtual = 1;

        // 2. Imprimir os espaços em branco até chegar ao primeiro dia do mês
        for (int i = 1; i < p; i++) {
            System.out.print("   "); // Imprime 3 espaços (equivale ao tamanho de um número)
            colunaAtual++;
        }

        // 3. Imprimir os dias do mês
        for (int dia = 1; dia <= n; dia++) {
            // O printf com "%2d " garante que os números fiquem alinhados 
            // (ocupa sempre 2 casas mais 1 espaço de separação)
            System.out.printf("%2d ", dia);
            
            // Se chegarmos à coluna 7 (Sábado), temos de quebrar a linha
            if (colunaAtual == 7) {
                System.out.println(); // Dá um "Enter"
                colunaAtual = 1;      // Reseta a coluna para Domingo (1)
            } else {
                colunaAtual++;        // Avança para o próximo dia da semana
            }
        }

        // Pular uma linha no final, caso o mês não tenha terminado num sábado,
        // para o terminal não colar texto na frente do último dia
        if (colunaAtual != 1) {
            System.out.println();
        }

        teclado.close();
    }
}
