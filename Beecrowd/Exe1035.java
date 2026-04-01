package Beecrowd;

import java.util.Scanner;

/*
Análise:
Leia 4 valores inteiros A, B, C e D. 
A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entradas:
a, b, c, d


Saida:
"Valores aceitos"
"Valores nao aceitos"


*/
public class Exe1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        }

        else {
            System.out.println("Valores nao aceitos");
        }
        teclado.close();}
    }
