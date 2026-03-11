import java.util.Scanner;

public class Uni3Exe05 {
/*
Análise: Calcular os gastos com compras de Chips e anais de identificação para frangos. OK.
Entrada: quantFrangos.
Saida: gastoTotal.
Processo: gastoTotal = (4 + 2*3.50) * quantFrangos.
Fluxograma:
ler anelChip
ler anelIdentificação
ler quantFrangos
gastoTotal = (4 + 2*3.50) * quantFrangos
escrever gastoTotal

*/
    public static void main(String[] args) {
        Scanner frangos = new Scanner(System.in);
        System.out.println("Digite a quantidade de frangos: ");
        int quantFrangos = frangos.nextInt();
        float gastoTotal = (4 + 2*3.50f) * quantFrangos;
        System.out.println("O gasto total é de R$: " + gastoTotal);
        frangos.close();
    }}
