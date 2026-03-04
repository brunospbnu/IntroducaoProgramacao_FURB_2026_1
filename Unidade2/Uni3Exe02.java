import java.util.Scanner;

public class Classe {
    /* 
    Análise: OK. Valores em Reais.
    Entradas: valorProduto.
    Saidas: valorDesconto, valorProdutoComDesconto.
    Fluxograma:
    Ler valorProduto
    valorDesconto = valorProduto * 0.12
    valorProdutoComDesconto = valorProduto - valorDesconto
    Imprimir valorDesconto
    Imprimir valorProdutoComDesconto
    
    */
    public static void main(String[] args) {
        Scanner valorProdutosScanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        float valorProduto = valorProdutosScanner.nextFloat();
        float valorDesconto = valorProduto * 0.12f;
        float valorProdutoComDesconto = valorProduto - valorDesconto;
        System.out.println("Valor do desconto é de R$: " + valorDesconto);
        System.out.println("Valor do produto com desconto é de R$: " + valorProdutoComDesconto);
        valorProdutosScanner.close();
}}
