package Beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1008 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        int numeroFunc = teclado.nextInt();
        int horasTrabalhadas = teclado.nextInt();
        float valorHora = teclado.nextFloat();
        float salario = valorHora * horasTrabalhadas;
        System.out.println("NUMBER = " + numeroFunc);
        System.out.println("SALARY = U$ " + df.format(salario));
        teclado.close();
    }
}