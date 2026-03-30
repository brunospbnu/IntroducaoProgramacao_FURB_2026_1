package Unidade4;

import java.util.Scanner;

/*
Análise:
Cálcular o IMC e dizer o grau de obesidade de um indivíduo.
IMC = Massa / Altura²
< 18.5 Magreza 
18.5 - 24.9 Saudável
25.0 - 29.9 Sobrepeso 
30.0 - 34.9 Obesidade Grau I 
35.0 - 39.9 Obesidade Grau II (severa) 
>= 40.0 Obesidade Grau III (mórbida) 

Entradas:
altura
massa


Saida:
imcClass
grauObes



Algoritmo:
ler entradas

imc = massa / altura²
imcClass = "Não informado"

imc = massa / altura²

SE imc < 18.5
imcClass = "Magreza"

Senão SE imc >= 18.5 E imc <= 24.9
imcClass = "Saudável"

Senão SE imc >= 25.0 E imc <= 29.9
imcClass = "Sobrepeso"

Senão SE imc >= 30.0 E imc <= 34.9
imcClass = "Obesidade Grau I"

Senão SE imc >= 35.0 E imc <= 39.9
imcClass = "Obesidade Grau II (severa)"

Senão SE imc >= 40.0
imcClass = "Obesidade Grau III (mórbida)"

Senão
imcClass = "Erro"

escrever "O IMC do indivíduo é = " + imc + ". O grau de obesidade do individuo é: " + imcClass "."

*/
public class Uni4Exe21 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para cálcular o IMC de um indivíduo e exibir o grau de obesidade ---");
        System.out.println("Informe a massa do indivíduo:");
        double massa = teclado.nextDouble();
        System.out.println("Informe a altura do indivíduo:");
        double altura = teclado.nextDouble();

        double imc = massa / (Math.pow(altura,2));

        String imcClass = "Não Informado";

        if (imc < 18.5) {
            imcClass = "Magreza"; 
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            imcClass = "Saudável";
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            imcClass = "Sobrepeso";
        }
        else if (imc >= 30.0 && imc <= 34.9) {
            imcClass = "Obesidade Grau I";
        }
        else if (imc >= 35.0 && imc <= 39.9) {
            imcClass = "Obesidade Grau II (severa)";
        }
        else if (imc >= 40.0) {
            imcClass = "Obesidade Grau III (mórbida)";
        }
        else {
            imcClass = "Erro";
        }
        
        System.out.println("O IMC do indivíduo é = " + imc + ". O grau de obesidade do individuo é: " + imcClass);


        teclado.close();}
    }
