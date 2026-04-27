package Unidade5;

public class Uni5Exe03 {
    public static void main(String[] args) {
        System.out.println("Somador de frações de 1/1 + 1/2 ... até 1/100");
        int repeticoes = 0;
        double fracao = 0;
        double soma = 0;
        for (repeticoes = 1; repeticoes <=100; repeticoes++)
        {
            fracao = 1.0/repeticoes;
            soma = soma + fracao;
            System.out.println("A soma parcial é = " + soma);
        }
        System.out.println("A soma total é = " + soma);
    }
}
