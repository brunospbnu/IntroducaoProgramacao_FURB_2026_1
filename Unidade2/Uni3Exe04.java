import java.util.Scanner;

public class Notas {

    /*
    Análise: OK. Médias ponderadas das notas. Os pesos são fixos.
    Entradas: nota1, nota2, nota3.
    Saida: notaFinal
    Processo: notaFinal = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10
    Fluxograma:
    ler nota1
    ler nota2
    ler nota3
    notaFinal = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10
    escrever notaFinal
    */
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        float nota1 = notas.nextFloat();
        System.out.println("Digite a segunda nota:");
        float nota2 = notas.nextFloat();
        System.out.println("Digite a terceira nota:");
        float nota3 = notas.nextFloat();
        float notaFinal = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10;
        System.out.println("A nota final (média ponderada) é: " + notaFinal);
        notas.close();   
    }
}