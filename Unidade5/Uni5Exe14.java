package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular lucro e valor de venda total de mercadorias");

        int quantMercadorias = 0;

        String nomeAtual = "";
        String nomesTodos = "";

        double precoCompraAtual = 0;
        double precoVendaAtual = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        double lucroAtualPorcentagem = 0;
        double lucroAtualValor = 0;
        double lucroTotalEmReais = 0;

        int lucroMenor10 = 0;
        int lucroEntre10E20 = 0;
        int lucroMaior20 = 0;


        System.out.print("Digite a quantidade de mercadorias: ");
        quantMercadorias = teclado.nextInt();

        for (int contagem = 1; contagem <= quantMercadorias; contagem++) {
           
            System.out.println("Digite o nome da mercadoria nº " + contagem + " : ");
            nomeAtual = teclado.next();
            nomesTodos = nomesTodos + " " + contagem + ") "+ nomeAtual;

            System.out.println("Digite o preço de compra (PC) da mercadoria nº " + contagem + " : ");
            precoCompraAtual = teclado.nextDouble();
            valorTotalCompra = valorTotalCompra + precoCompraAtual;

            System.out.println("Digite o preço de venda (PV) da mercadoria nº " + contagem + " : ");
            precoVendaAtual = teclado.nextDouble();
            valorTotalVenda = valorTotalVenda + precoVendaAtual;

            lucroAtualValor = precoVendaAtual - precoCompraAtual;
            lucroTotalEmReais = lucroTotalEmReais + lucroAtualValor;

            lucroAtualPorcentagem = ((precoVendaAtual - precoCompraAtual) / (precoCompraAtual * 100.00)) * 10000; 
            System.out.println("O lucro da mercadoria " + nomeAtual + " de nº " + contagem + " é: " + lucroAtualPorcentagem + "%");

            if (contagem < quantMercadorias) {
            System.out.println("--- Seguindo para a próxima mercadoria ---");
            }

            if (contagem == quantMercadorias) {
                System.out.println("---- Finalizando ---");
                
            }

            if (lucroAtualPorcentagem < 10) {

                lucroMenor10++;

            }
            else if (lucroAtualPorcentagem >= 10 && lucroAtualPorcentagem <= 20) {

                lucroEntre10E20++;
            }

            else {
                lucroMaior20++;
            }
        }
        System.out.println("As mercadorias são: " + nomesTodos);
        System.out.println("Mercadorias com lucro < 10% = " + lucroMenor10);
        System.out.println("Mercadorias com lucro entre 10% e 20% (incluindo esses numeros) = " + lucroEntre10E20);
        System.out.println("Mercadorias com lucro > 20% = " + lucroMaior20);
        System.out.println(" ------------");
        System.out.println("Valor total da compra = " + valorTotalCompra);
        System.out.println("Valor total da venda = " + valorTotalVenda);
        System.out.println("Valor total do lucro em reais: " + lucroTotalEmReais);


        teclado.close();
    }
}
