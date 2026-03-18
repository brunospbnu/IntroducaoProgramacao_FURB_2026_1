package Beecrowd;
import java.util.Scanner;

public class Exe1007 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int D = leitor.nextInt();
        int diferenca = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + diferenca);
        leitor.close();
    }
}