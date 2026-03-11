import java.util.Scanner;

public class Uni3Exe7 {

/*
Análise: Clálcular quantos litros o comerciante comprou da fábrica considerando os diferentes tipos de recipientes.
OK. Todos os dados disponíveis.
Entrada: quantLata350, quantGarrafa600, quantGarrafa2000
Saída: totalLitros
Processamento: totalLitros = (quantLata350 *0,35) + (quantGarrafa600 * 0,6) + (quantGarrafa2000 * 2)
Algoritmo:
ler quantLata350
ler quantGarrafa600
ler quantGarrafa2000
totalLitros = (quantLata350 *0,35) + (quantGarrafa600 * 0,6) + (quantGarrafa2000 * 2)
escrever totalLitros

*/

    public static void main(String[] args) {
        Scanner calcularlitros = new Scanner(System.in);
        System.out.println("Digite a quantidade de latas de 350ml: ");
        int quantLata350 = calcularlitros.nextInt();
        System.out.println("Digite a quantidade de garrafas de 600ml: ");
        int quantGarrafa600 = calcularlitros.nextInt();
        System.out.println("Digite a quantidade de garrafas de 2000ml: ");
        int quantGarrafa2000 = calcularlitros.nextInt();
        double totalLitros = (quantLata350 * 0.35) + (quantGarrafa600 * 0.6) + (quantGarrafa2000 * 2);
        System.out.println("O total de litros comprados é: " + totalLitros);
        calcularlitros.close();
    }
}
