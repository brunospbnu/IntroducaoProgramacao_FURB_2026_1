import java.util.Scanner;

public class Uni3Exe12 {

/*
Entradas: nomeFunc, horasTrab, numeroDependentes.
Saídas: nomeFunc, salarioBruto, salarioLiquido.
Algoritmo:
ler nomeFunc
ler horasTrab
ler numeroDependentes
salarioBrutoInicial = horasTrab * 10.00
salarioBruto = salarioBrutoInicial + (numeroDependentes * 60.00)
salarioLiquido = salarioBrutoInicial - (salarioBrutoInicial * 0.05) - (salarioBrutoInicial * 0.085) + (numeroDependentes * 60.00)
escrever nomeFunc, salarioBruto, salarioLiquido

*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nomeFunc = teclado.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        double horasTrab = teclado.nextDouble();
        System.out.println("Digite o número de dependentes: ");
        int numeroDependentes = teclado.nextInt();
        double salarioBrutoInicial = horasTrab * 10.00;
        double salarioBruto = salarioBrutoInicial + (numeroDependentes * 60.00);
        double salarioLiquido = salarioBrutoInicial - (salarioBrutoInicial * 0.05) - (salarioBrutoInicial * 0.085) + (numeroDependentes * 60.00);
        System.out.println("O funcionário " + nomeFunc + " possui um salário bruto de R$ " + salarioBruto + " e um salário líquido de R$ " + salarioLiquido);
        teclado.close();


    }
}

