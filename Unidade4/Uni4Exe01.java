package Unidade4;

import java.util.Scanner;

/*
Análise:
Considerando jornada de 40 horas semanais calcular o salário.
Considerar que o que excede 40 horas é hora extra e paga com adicional de 50%
Mês com 4 semanas exatas.


Entradas:
horasTrabalhadasMes
valorPagoHora

Saida:
salario

Algoritmo:
ler horasTrabalhadasMes
ler valorPagoHora
salario = horasTrabalhadasMes * valorPagoHora
Se horasTrabalhadasMes > 160 então
salario = salario + (((horasTrabalhadasMes - 160)/ 2) * valorPagoHora )
escrever "O salário total é: " + salario
*/
public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas no mês");
        double horasTrabalhadasMes = teclado.nextDouble();
        System.out.println("Digite o valor pago por hora");
        double valorPagoHora = teclado.nextDouble();
        double salario = horasTrabalhadasMes * valorPagoHora;
        if (horasTrabalhadasMes > 160) {
            salario = salario + (((horasTrabalhadasMes - 160)/ 2) * valorPagoHora ); }
        System.out.println("O salário total é: " + salario);
        teclado.close();
    }

}
