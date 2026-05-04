package Unidade5;
/*
Exercício: Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia). 
*/
public class Uni5Exe11 {
    public static void main(String[] args) {
        System.out.println("Programa para cálcular biscoitos quebrados por dia por máquina com defeito");
        double biscoitosQuebrados = 0;

        for (int horas = 1; horas <=16; horas++ ) {
            if (horas == 1) {
                biscoitosQuebrados++;
                
            }
            if (horas == 2) {
                biscoitosQuebrados = biscoitosQuebrados + 3;
                
            }

            if (horas > 2) {
                
                biscoitosQuebrados = biscoitosQuebrados + Math.pow(3.00,(horas-1));
                
            }
        }
        System.out.printf("A quantidade de biscoitos quebrados é de %.0f", biscoitosQuebrados);
    }
}
