package Unidade4;

import java.util.Scanner;

/*
Análise:
Ler idades de 3 irmãos e informar se são gêmeos, trigêmeos ou apenas irmãos.
OK

Entradas:
idade1
idade2
idade3


Saida:
GÊMEOS
OU
TRIGÊMEOS
OU
APENAS IRMÃOS


Algoritmo:
ler idade1
ler idade2
ler idade3
Se idade1 == idade2 E idade1 == idade3 E idade2 == idade3, então;
escrever "SÃO TRIGÊMEOS"
Se idade1 == idade2 OU idade1==idade3 OU idade2 == idade3 ,então;
escrever "SÃO GÊMEOS"
Senão;
escrever "SÃO APENAS IRMÃOS"
FIM

*/
public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---Programa para verificar se os irmãos são Trigêmeos, Gêmeos ou Apenas Irmãos---");
        System.out.println("Digite a idade do primeiro irmão");
        int idade1 = teclado.nextInt();
        System.out.println("Digite a idade do segundo irmão");
        int idade2 = teclado.nextInt();
        System.out.println("Digite a idade do terceiro irmão");
        int idade3 = teclado.nextInt();
        if ((idade1 == idade2) && (idade1== idade3) && (idade2== idade3)) {
            System.out.println("SÃO TRIGÊMEOS");
        }
        else { 
            if ((idade1 == idade2) || (idade1 == idade3) || (idade2 == idade3)) {
                System.out.println("SÃO GÊMEOS");
        }
            else {
                System.out.println("SÃO APENAS IRMÃOS");
        }}
        teclado.close();}
    }
