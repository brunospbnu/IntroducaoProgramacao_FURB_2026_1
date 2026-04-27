package Unidade5;


public class Uni5Exe02 {
    public static void main(String[] args) {
        System.out.println("Soma dos números pares e impares entre 1 e 100");
        int numeroAtual = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (numeroAtual = 0; numeroAtual <= 100; numeroAtual = numeroAtual + 1)
        {
            if (numeroAtual % 2 == 0) {
                somaPares = somaPares + numeroAtual;
            }

            else {
                somaImpares = somaImpares + numeroAtual;
            }

        }

        System.out.println("A soma dos números PARES é = " + somaPares);
        System.out.println("A soma dos números IMPARES é = " + somaImpares);
    }
}
