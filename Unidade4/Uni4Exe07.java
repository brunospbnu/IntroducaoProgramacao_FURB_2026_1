package Unidade4;

import java.util.Scanner;

/*
Análise:
O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, em que excedem aquele peso.
Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
OK.

Entradas:
pesoCarta


Saida:
custoSelo


Algoritmo:
ler pesoCarta
Se pesoCarta <= 50, então
custoSelo = 0.45
senão
custoSelo = 0.45 + (0.45 *((pesoCarta - 50)/20 + 1)
escrever custoSelo
FIM

*/
public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Peso da Carta");
        int pesoCarta = teclado.nextInt();
        double custoSelo = 0.45;
        double custoExtra = 0;
        if (pesoCarta <= 50) {
            System.out.println("O custo do Selo é de R$ " + custoSelo);
        }
        else {
            custoExtra = 0.45 *(((pesoCarta - 50)/20) + 1);
            // O mais 1 foi colocado acima pois o valor extra sempre e somado inteiramente.
            // Ou seja, mesmo que fechem 10 gramas adicionais vai ser cobrado 0.45, nunca apenas uma parte desse valor. 
            custoSelo = custoSelo + custoExtra;
            System.out.println("O custo do Selo é de R$ " + custoSelo);}
        teclado.close();
    }
    }