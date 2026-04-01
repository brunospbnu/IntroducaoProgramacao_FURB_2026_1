package Beecrowd;

import java.util.Scanner;

/*
Análise:
Leia a hora inicial e a hora final de um jogo. 
A seguir calcule a duração do jogo, 
sabendo que o mesmo pode começar em um dia e terminar em outro, 
tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entradas:

horaInicio
horaFim


Saída:
"O JOGO DUROU " + horasDuracao + " HORA(S)"


*/
public class Exe1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaInicio = teclado.nextInt();
        int horaFim = teclado.nextInt();
        int horasDuracao = 0;

        if (horaFim == horaInicio) {
            horasDuracao = 24;}

        else if (horaFim < horaInicio) {
            horasDuracao = 24 - (horaInicio - horaFim);
        }
        else {
            horasDuracao = horaFim - horaInicio;
        }

        System.out.println("O JOGO DUROU " + horasDuracao + " HORA(S)");

        teclado.close();}
    }
