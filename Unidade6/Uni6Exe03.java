package Unidade6;

import java.util.Scanner;

public class Uni6Exe03 {
    public Uni6Exe03() {
        double valoresReais[] = new double[12];

        valoresReais = lerDados();

        double valoresAjustados[] = new double[12];

        valoresAjustados = ajustarValores(valoresReais, valoresAjustados);

        escreverValores(valoresReais, valoresAjustados);

    }

    private double[] lerDados() {

        Scanner s = new Scanner(System.in);

        double valoresReais[] = new double[12];

        for (int i = 0; i < valoresReais.length; i++) {
            System.out.print("Digite o número real de posição " + (i+1) + ": ");
            valoresReais[i] = s.nextDouble();
            }
            s.close();

            return valoresReais;
    }

    private double[] ajustarValores(double valoresReais[], double valoresAjustados[]) {
        for (int i = 0; i < valoresReais.length; i++) {
            if (valoresReais[i] % 2 == 0) {
                valoresAjustados[i] = valoresReais[i] + (valoresReais[i] * 0.02);
            }
            else {
                valoresAjustados[i] = valoresReais[i] + (valoresReais[i] * 0.05);
            }
        }
        return valoresAjustados;
    }

    private void escreverValores(double valoresReais[], double valoresAjustados[]) {
        for (int i = 0; i < valoresReais.length; i++) {
            System.out.println("Valor real = " + valoresReais[i]);
            System.out.println("Valor ajustado = " + valoresAjustados[i] + "\n\r ------------");
        }
    }
    public static void main(String[] args) {
        new Uni6Exe03();
    }
    
}
