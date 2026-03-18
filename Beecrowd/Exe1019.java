package Beecrowd;
/*
Entradas: 
n (tempo em segundos de um evento)
Saida:
horas, minutos, segundos.
Algoritmo:
ler n
horas = n / 3600
minutos = (n % 3600) / 60
segundos = (n % 3600) %60
escrever horas+":"+minutos+":"+segundos
*/
import java.util.Scanner;

public class Exe1019 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int n = teclado.nextInt();
    int horas = n / 3600;
    int minutos = (n % 3600) / 60;
    int segundos = (n % 3600) % 60;
    System.out.println(horas+":"+minutos+":"+segundos);
    teclado.close();
    }
}
