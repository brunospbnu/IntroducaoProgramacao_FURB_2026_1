import java.util.Scanner;

public class CustoRefeição {

/*
Análise: Ler peso do prato em quilos com comida e calcular o valor da refeição. OK.
Entrada: pesoTotalPrato
Saida: valorAPagar
Processo: valorAPagar = (pesoTotalPrato - 0,750) * 25,00
Fluxograma
ler pesoTotalPrato
valorAPagar = (pesoTotalPrato - 0,750) * 25,00
escrever valorAPagar
FIM

*/


    public static void main(String args[]) {
        Scanner leituraPesoTotal = new Scanner(System.in);
        System.out.println("Digite o peso total do prato com a comida, em quilos: ");
        float pesoTotalPrato = leituraPesoTotal.nextFloat();
        float valorAPagar = (pesoTotalPrato - 0.750f) * 25.00f;
        System.out.println("O valor a pagar é: R$ " + valorAPagar);
        leituraPesoTotal.close();
    }
}
