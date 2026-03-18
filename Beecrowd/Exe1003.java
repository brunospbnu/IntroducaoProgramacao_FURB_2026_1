package Beecrowd;
import java.util.Scanner;

public class Exe1003 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int A = leitor.nextInt();
    int B = leitor.nextInt();
    int soma = A + B;
    System.out.println("SOMA = " + soma);    
    leitor.close();
    }
}