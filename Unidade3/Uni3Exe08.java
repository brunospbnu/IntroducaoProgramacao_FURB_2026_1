import java.util.Scanner;

public class Uni3Exe08 {
    /*
    Análise: OK.
    Entradas: valorEmDolares, cotacaoDolar
    Saida: valorEmReais
    Algoritmo:
    ler valorEmDolares
    ler cotacaoDolar
    valorEmReais = valorEmDolares x cotacaoDolar
    escrever valorEmReais
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor em dólares: ");
        double valorEmDolares = teclado.nextDouble();
        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = teclado.nextDouble();
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.println("O atendente deve devolver R$ " + valorEmReais + " para o cliente.");
        teclado.close();

    }
}
