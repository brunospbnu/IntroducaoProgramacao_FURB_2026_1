package Beecrowd;

import java.util.Scanner;

public class Exe1042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        int valor3 = teclado.nextInt();
        
        if (valor1 < valor2 && valor2 < valor3)
            System.out.println(valor1 + "\n" + valor2 +"\n" + valor3);

        else if (valor1 < valor3 && valor3 < valor2)
            System.out.println(valor1 + "\n" + valor3 +"\n" + valor2);

        else if (valor2 < valor1 && valor1 < valor3)
            System.out.println(valor2 + "\n" + valor1 +"\n" + valor3);

        else if (valor2 < valor3 && valor3 < valor1)
            System.out.println(valor2 + "\n" + valor3 +"\n" + valor1);

        else if (valor3 < valor1 && valor1 < valor2)
            System.out.println(valor3 + "\n" + valor1 +"\n" + valor2);

        else if (valor3 < valor2 && valor2 < valor1) {
            System.out.println(valor3 + "\n" + valor2 +"\n" + valor1);}

        System.out.println("\n" + valor1 + "\n" + valor2 +"\n" + valor3);


        teclado.close();}
    }
