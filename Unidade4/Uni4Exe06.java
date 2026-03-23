package Unidade4;

import java.util.Scanner;

/*
Análise:
Faça um algoritmo que leia um caractere. 
Caso seja digitada a letra 'M' escreva “Masculino”. 
Se for digitada a letra 'F' escreva “Feminino”. 
Se for informado 'I' escreva “Não Informado”. 
Qualquer outra letra digitada escreva “Entrada Incorreta”. 
Atenção: antes de testar a letra, converta-a para maiúscula.


Entradas:
letra


Saida:
Masculino
OU
Feminino
OU
Não Informado
OU
Entrada Incorreta


Algoritmo:
ler letra
formatar a letra para sempre maiúsculo
SE letra for "M", então
escrever "Masculino"
SE letra for "F" então,
escrever "Feminino"
SE letra for "I" então,
escrever "Não Informado"
Se não
escrever "Entrada Incorreta"
FIM

*/
public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Sexo do Indivíduo");
        System.out.println("Digite M, F ou I");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);
        if (letra == 'M') {
            System.out.println("Masculino");
        }
        else
            if (letra == 'F') {
                 System.out.println("Feminino");
                
            }
            else
                if (letra == 'I') {
                    System.out.println("Não Informado");
                }
                else
                    System.out.println("Entrada Incorreta");
        teclado.close();}
    }
