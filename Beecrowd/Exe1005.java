package Beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1005 {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat ("0.00000");
    Scanner teclado = new Scanner(System.in);
    double A = teclado.nextDouble();
    double B = teclado.nextDouble();
    double media = (A*3.5 + B*7.5) / 11;
    System.out.println("MEDIA = " + df.format(media));
    teclado.close();
    }
}