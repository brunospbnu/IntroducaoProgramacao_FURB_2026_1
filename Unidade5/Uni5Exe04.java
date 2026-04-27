package Unidade5;

public class Uni5Exe04 {
    public static void main(String[] args) {
        System.out.println("Programa para somar os 20 primeiros termos de: 3/2 + 5/6 + 7/12 + 9/20 + 11/30 ...");
        int repeticoes = 0;
        int numerador = 3;
        int denominador = 2;
        double soma = 0;
        int termoASomarNoDenom = 4;
        for (repeticoes = 0; repeticoes <20; repeticoes++)
        {
            soma = soma + (double)numerador/(double)denominador;
            System.out.println("Soma parcial = " + soma);

            numerador = numerador + 2;
            denominador = denominador + termoASomarNoDenom;
            termoASomarNoDenom = termoASomarNoDenom +2;

            System.out.println("num = " + numerador + "den =" +denominador);
        }

        System.out.println("A soma final é = " + soma);
    }

}
