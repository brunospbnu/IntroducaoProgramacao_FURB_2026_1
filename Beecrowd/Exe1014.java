package Beecrowd;
/*
Análise:
Calcular o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
Apresentar o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
OK.

Entradas:
x (distancia total percorrida, numero inteiro)
y (total de combustivel gasto, numero real com um dígito após ponto decimal)

Saídas:
consumoMedio (consumo em KM/L)

Algoritmo:
ler x
ler y
consumoMedio = x/y


*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1014 {
    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.000");
    Scanner teclado = new Scanner(System.in);
    int x = teclado.nextInt();
    double y = teclado.nextDouble();
    double consumoMedio = x / y;
    System.out.println(df.format(consumoMedio) + " km/l"); 
    teclado.close();
    }
}