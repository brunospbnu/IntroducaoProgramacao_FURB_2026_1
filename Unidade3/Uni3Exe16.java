import java.util.Scanner;

public class Uni3Exe16 {

    /*
    Entrada: valorTotalCompra, valorDadoPeloCliente.
    Saídas: numMinNotas, Notas100, Notas10, Notas1.
    Algorítimo:
    INICIO
    ler valorTotalCompra
    ler valorDadoPeloCliente
    diferenca = valorDadoPeloCliente - valorTotalCompra
    Notas100 = diferenca / 100
    Notas10 = (diferenca % 100) / 10
    Notas1 = (diferenca % 100) % 10
    numMinNotas = Notas100 + Notas10 + Notas1
    escrever "O número mínimo de notas de troco é: " + numMinNotas
    escrever "Quantidade de Notas de 100 necessárias: " + Notas100
    escrever "Quantidade de Notas de 10 necessárias: " + Notas10
    escrever "Quantidade de Notas de 1 necessárias: " + Notas1
    FIM
    */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: ");
        double valorTotalCompra = teclado.nextDouble();
        System.out.print("Digite o valor dado pelo cliente: ");
        double valorDadoPeloCliente = teclado.nextDouble();
        double diferenca = valorDadoPeloCliente - valorTotalCompra;
        int Notas100 = (int) (diferenca / 100);
        int Notas10 = (int) (diferenca % 100) / 10;
        int Notas1 = (int) ((diferenca % 100) % 10);
        int numMinNotas = Notas100 + Notas10 + Notas1;
        System.out.println("O número mínimo de notas de troco é: " + numMinNotas);
        System.out.println("Quantidade de Notas de 100 necessárias: " + Notas100);
        System.out.println("Quantidade de Notas de 10 necessárias: " + Notas10);
        System.out.println("Quantidade de Notas de 1 necessárias: " + Notas1);
        teclado.close();
        
    }
}
