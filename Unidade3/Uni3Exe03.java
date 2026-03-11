import java.util.Scanner;

public class Uni3Exe03 {
    /*
    Análise: Não foi informada a capacidade de litros do veiculo do motorista.
    Será considerado que o posto de gasolina tem combustível suficiente para abastecer o veículo do motorista.
    Entradas: precoLitroGasolina, valorPago
    Saidas: litrosAbastecidos.
    Processo:
    1. Solicitar ao usuário o preço do litro da gasolina.
    2. Solicitar ao usuário o valor pago.
    3. Solicitar ao usuário a capacidade de litros do veículo.
    4. Calcular a quantidade de litros abastecidos utilizando a fórmula: litrosAbastecidos = valorPago / precoLitroGasolina.
    5. Informar ao usuário a quantidade de litros abastecidos.
    Fluxograma:
    ler precoLitroGasolina
    ler valorPago
    litrosAbastecidos = valorPago / precoLitroGasolina
    escrever litrosAbastecidos
    Fim
    */
     public static void main(String[] args) {
        Scanner abastecimento = new Scanner(System.in);
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitroGasolina = abastecimento.nextDouble();
        System.out.print("Digite o valor pago: ");
        double valorPago = abastecimento.nextDouble();
        double litrosAbastecidos = valorPago / precoLitroGasolina;
        System.out.println("O motorista conseguiu colocar: " + litrosAbastecidos + " litros de gasolina.");
        abastecimento.close();
}}
