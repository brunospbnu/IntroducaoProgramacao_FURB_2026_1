import java.util.Scanner;

public class Uni3Exe13 {
    /*
    Entradas: comprimentoParede; alturaParede.
    Saida: valorGasto
    Processo:
    valorGasto = (comprimentoParede * alturaParede* 9) * 12,50
    Algoritmo:
    ler comprimentoParede
    ler alturaParede
    valorGasto = (comprimentoParede * alturaParede* 9) * 12,50
    escrever valorGasto em R$
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o comprimento da parede: ");
        double comprimentoParede = teclado.nextDouble();
        System.out.println("Digite a altura da parede: ");
        double alturaParede = teclado.nextDouble();
        double valorGasto = (comprimentoParede * alturaParede * 9) * 12.50;
        System.out.println("O valor final é: R$ " + valorGasto);


    }
}
