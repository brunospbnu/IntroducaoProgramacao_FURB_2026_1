package Unidade4;

import java.util.Scanner;

/*
Análise:
Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; 
suponha que não haja empates. 
Será considerado que o nome dos filhos não é variavel.

Entradas:
idadeMarquinhos
idadeZezinho
idadeLuluzinha


Saida:
O filho "X" é o caçula.


Algoritmo:
ler idadeMarquinhos
ler idadeZezinho
ler idadeLuluzinha
Se idade idadeMarquinhos < idadeZezinho E < idadeLuluzinha, então
escrever "O Marquinhos é o caçula"
Se idade idadeZezinho < idadeMarquinhos E < idadeLuluzinha, então
escrever "O Zezinho é o caçula"
Senão;
escrever "A Luluzinha é a caçula"
FIM

*/
public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para verificar quem é o filho caçula entre Marquinhos, Zezinho e Luluzinha");
        System.out.println ("Digite a idade de Marquinhos");
        int idadeMarquinhos = teclado.nextInt();
        System.out.println ("Digite a idade de Zezinho");
        int idadeZezinho = teclado.nextInt();
        System.out.println ("Digite a idade de Luluzinha");
        int idadeLuluzinha = teclado.nextInt();
        if ((idadeMarquinhos < idadeZezinho) && (idadeMarquinhos < idadeLuluzinha)) {
            System.out.println("O Marquinhos é o caçula");
        }
        if ((idadeZezinho < idadeMarquinhos) && (idadeZezinho < idadeLuluzinha)) {
            System.out.println("O Zezinho é o caçula");
        }
        else {
            System.out.println("A Luluzinha é a caçula");
        }
        teclado.close();}
    }
