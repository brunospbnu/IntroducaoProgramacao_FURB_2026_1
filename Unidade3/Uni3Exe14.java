import java.util.Scanner;

public class Uni3Exe14 {
    /*
    Entrada: distanciaPercorrida, tempoGasto
    Saída: velocidadeMédia, quantidadeCombGasto
    Algoritmo:
    ler distanciaPercorrida
    ler tempoGasto
    velocidadeMédia = distanciaPercorrida / tempoGasto
    quantidadeCombGasto = distanciaPercorrida / 12
    escrever velocidadeMédia
    escrever quantidadeCombGasto
    
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a distância percorrida (em km):");
        double distanciaPercorrida = teclado.nextDouble();
        System.out.println("Digite o tempo gasto (em horas):");
        double tempoGasto = teclado.nextDouble();
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        double quantidadeCombGasto = distanciaPercorrida / 12;
        System.out.print ("A velocidade média foi de " + velocidadeMedia + " km/h e a quantidade de combustível usado foi " + quantidadeCombGasto + " Litros");
        teclado.close();

    }
}
