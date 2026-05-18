package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Programa para cálculo de remuneração e dados de fabrica: ");
       
        int diaAtual;
        int contiuar = 1;

        int quantPecasTurnoManhaAtual = 0;
        int quantPecasTurnoTardeAtual = 0;

        int producaoDoMaiorDia = 0;
        int diaDaMaiorProducao = 0;

        int quantGeralTurnoManha = 0;
        int quantGeralTurnoTarde = 0;
        String turnoMaiorProducao = "Desconhecido";

        while (contiuar == 1) {

            System.out.print("Informe o dia do mês (entre 1 e 30): ");
            diaAtual = teclado.nextInt();

            while (diaAtual < 1 || diaAtual > 30) {
            System.out.print("DIA INVÁLIDO - Informe o dia do mês (entre 1 e 30): ");
            diaAtual = teclado.nextInt();

            }

            System.out.print("Informe o total de peças produzidas pelo funcionario no turno da manhã: ");
            quantPecasTurnoManhaAtual = teclado.nextInt();
            System.out.print("Informe o total de peças produzidas pelo funcionario no turno da tarde: ");
            quantPecasTurnoTardeAtual = teclado.nextInt();

            int totalPecasDoDia = quantPecasTurnoManhaAtual + quantPecasTurnoTardeAtual;

            double valorRecebidoFuncionaro = 0;

            quantGeralTurnoManha = quantGeralTurnoManha + quantPecasTurnoManhaAtual;
            quantGeralTurnoTarde = quantGeralTurnoTarde + quantPecasTurnoTardeAtual;

            if (totalPecasDoDia > producaoDoMaiorDia) {
                producaoDoMaiorDia = totalPecasDoDia;
                diaDaMaiorProducao = diaAtual;
            }



            if (diaAtual <= 15) {
                if (totalPecasDoDia > 100 && quantPecasTurnoManhaAtual >= 30 && quantPecasTurnoTardeAtual >= 30) {

                    valorRecebidoFuncionaro = 0.80 * totalPecasDoDia;
                }
                else {
                    valorRecebidoFuncionaro = 0.50 * totalPecasDoDia;
                } 
            }

            if (diaAtual >= 16) {
                valorRecebidoFuncionaro = (quantPecasTurnoManhaAtual * 0.40) + (quantPecasTurnoTardeAtual * 0.30);
            }

            System.out.println("Valor recebido pelo funcionário neste dia: R$ " + valorRecebidoFuncionaro);

            System.out.println("Deseja analisar um novo funcionário? (1.sim 2.não)");
            contiuar = teclado.nextInt();
        }

        int quantDoMaiorTurno = 0;

        if (quantGeralTurnoManha > quantGeralTurnoTarde) {
            turnoMaiorProducao = "Manhã";
            quantDoMaiorTurno = quantGeralTurnoManha;
        }

        else {
            turnoMaiorProducao = "Tarde";
            quantDoMaiorTurno = quantGeralTurnoTarde;
        }
        System.out.println("---- FINALIZANDO ----- \n\r Dia com maior produção: " + diaDaMaiorProducao + "\n\r Período em que o funcionário mais produz: " + turnoMaiorProducao + "/ Valor produzido: " + quantDoMaiorTurno);

        teclado.close();
    }
    
}
