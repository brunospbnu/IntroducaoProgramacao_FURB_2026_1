package Beecrowd;
/*
Entradas: codPeca1, numPeca1, valorPeca1, codPeca2, numPeca2, valorPeca2.
Saída: valorPagar
Algoritmo:
ler codPeca1 (int), numPeca1 (int), valorPeca1 (double)
ler codPeca2 (int), numPeca2 (int), valorPeca2 (double)
valorPagar = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2)
escrever "VALOR A PAGAR: " + df.format(valorPagar)

*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1010 {
    public static void main(String[] args) throws Exception {
    DecimalFormat df = new DecimalFormat("0.00");
    Scanner leitor = new Scanner(System.in);
    int codPeca1 = leitor.nextInt();
    int numPeca1 = leitor.nextInt();
    double valorPeca1 = leitor.nextDouble();
    int codPeca2 = leitor.nextInt();
    int numPeca2 = leitor.nextInt();
    double valorPeca2 = leitor.nextDouble();
    double valorPagar = (numPeca1 *valorPeca1) + (numPeca2 * valorPeca2);
    System.out.println("VALOR A PAGAR: R$ " + df.format(valorPagar));
    leitor.close();
    }
}