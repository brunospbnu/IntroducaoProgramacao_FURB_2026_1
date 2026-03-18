package Beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1002 {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.0000");
    Scanner leitor = new Scanner(System.in);
    double raio = leitor.nextDouble();
    double n = 3.14159;
    double areaCirculo = n * Math.pow(raio, 2);
    System.out.println ("A=" + df.format(areaCirculo));
    leitor.close();
    }
}