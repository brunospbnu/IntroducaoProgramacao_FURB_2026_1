package Unidade4;

import java.util.Scanner;

/*
Análise:
Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal

Entradas:
letra


Saida:
"Vogal"
"NÃO é vogal"


Algoritmo:
ler letra
transformar letra em maíuscula sempre.
Se letra for = A ou E ou I ou O ou U, então
escrever "Vogal"
senão
escrever "NÃO é vogal"
FIM

*/
public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Verificador de Vogal --- Digite uma letra abaixo");
        char letra = teclado.next().charAt(0);
        /*
        Poderia ser usado também a variavel String.
        O char trabalha com aspas simples e o String com aspas duplas.
        */
        letra = Character.toUpperCase(letra);
        /*
        toLowerCase colca tudo em minusculo
        toUpperCase colova tudo em maiusculo
        */
        if (letra == 'A' || letra == 'E'|| letra == 'I' || letra == 'O'|| letra == 'U') {
            System.out.println("É vogal");
        }
        else {
            System.out.println("NÃO é vogal");
        }
        teclado.close();}
    }
