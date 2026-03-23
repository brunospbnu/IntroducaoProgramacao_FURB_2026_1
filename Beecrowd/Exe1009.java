package Beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1009 {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.00");
    Scanner leitor = new Scanner(System.in);
    // Desnecessário: String nomeVendedor = leitor.nextLine();
    double salarioFixo = leitor.nextDouble();
    double totalVendas = leitor.nextDouble();
    double salarioFinal = salarioFixo + (totalVendas * 0.15);
    System.out.println ("TOTAL = R$ " + df.format(salarioFinal));
    leitor.close();
    }
}