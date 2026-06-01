// Bruno Schwabe Patricio

package Avaliações;

import java.util.Scanner;

public class Prova2Questão1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        int quantParticipantesGeral = 0;
        do {
            System.out.print("_______ Controle de Oficinas _______ \n\r1. cadastrar participantes em uma oficina"+
                            "\n\r2. verificar total de participantes cadastrados\n\r3. sair\n\rEscolha uma opção: ");
            opcao = teclado.nextInt();
           

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome da oficina: ");
                    String nomeOficina = teclado.next();
                    String nomeParticipanteAtual = "";
                    int quantVagas = 0;
                    int quantParticipantesOficinaAtual = 0;
                    do {
                        System.out.print("Informe a quantidade de vagas da oficina: ");
                        quantVagas = teclado.nextInt();
                        if (quantVagas <= 0) {
                            System.out.println("Quantidade de vagas invalida:");
                        }
                    } while (quantVagas <= 0);
                    while (quantVagas > quantParticipantesOficinaAtual) {
                        System.out.print("Informe o nome do participante: ");
                        nomeParticipanteAtual = teclado.next();
                        quantParticipantesOficinaAtual++;
                        quantParticipantesGeral++;
                        int escolha = 0;
                        do {
                            if (quantVagas <= quantParticipantesOficinaAtual) {
                                break;
                            }
                            System.out.print("Deseja cadastrar outro participante para essa oficina? (1 = SIM / 2 = NÃO)");
                            escolha = teclado.nextInt();
                            if (escolha < 1 || escolha > 2) {
                                System.out.print("Opção inválida!");
                            }
                        } while (escolha < 1 || escolha > 2);

                        if (escolha == 2) {
                            break;
                        }
                    }
                    int vagasRestantes = quantVagas - quantParticipantesOficinaAtual;

                    System.out.println("Oficina: " + nomeOficina + 
                                            "\n\rParticipantes cadastrados nesta oficina: " + quantParticipantesOficinaAtual +
                                        "\n\rVagas restantes: " + vagasRestantes);

                    break;
                case 2:
                    System.out.println("O total geral de participantes cadastrados em todas as oficinas é: " + quantParticipantesGeral);
                    break;
                case 3:
                    System.out.println("Programa Finalizado");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);
        
        





        teclado.close();
    }
}
