package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Programa para cálcular informações sobre pedágios e evitar pedágios de determinado valor:" +
                            "\n\r Insira o valor em R$ do máximo a ser pago no pedágio: ");
        double valorMaximo = dados.nextDouble();
        double valorAtual = 0;
        int quantidadeTrechos = 1;
        int quantTrechosAcimaLimite = 0;
        double distanciaTrechoAtual = 0;
        int quantTrechosAbaixoLimiteMasAcima150KM = 0;

        System.out.print("Digite o valor em R$ do " + quantidadeTrechos + "º pedágio (ou valor negativo para finalizar): ");
        valorAtual = dados.nextDouble();

        while (valorAtual > 0) {

            System.out.print("Digite distância (em Km) do " + quantidadeTrechos + "º trecho: ");
            distanciaTrechoAtual = dados.nextDouble();

            if (valorAtual > valorMaximo) {
                quantTrechosAcimaLimite++;
            }

            if ((valorAtual <= valorMaximo) && (distanciaTrechoAtual > 150.00)) {
                quantTrechosAbaixoLimiteMasAcima150KM++;
                
            }

            quantidadeTrechos++;

            System.out.print("Digite o valor em R$ do " + quantidadeTrechos + "º pedágio: ");
            valorAtual = dados.nextDouble();
        }

        System.out.println("Trechos com valor acima do qual nega-se a pagar = " + quantTrechosAcimaLimite +
                            "\n\r Quantidade de trechos informados = " + (quantidadeTrechos-1) +
                        "\n\r Trechos acima de 150km com valor aceito = " + quantTrechosAbaixoLimiteMasAcima150KM);

        dados.close();
    }
}
