package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("\n--- SISTEMA DO HOTEL ---");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    // Limpando o "lixo" (o Enter) deixado pelo nextInt() anterior
                    teclado.nextLine(); 
                    
                    System.out.print("\nNome do hóspede: ");
                    String nomeHospede = teclado.nextLine();
                    
                    System.out.print("Número de diárias: ");
                    int diarias = teclado.nextInt();

                    // Calculando a taxa de serviço de acordo com as regras
                    double taxaServico;
                    if (diarias < 15) {
                        taxaServico = 7.50;
                    } else if (diarias == 15) {
                        taxaServico = 6.50;
                    } else {
                        taxaServico = 5.00;
                    }

                    // Cálculo final: (diárias * valor base) + (diárias * taxa do serviço)
                    double totalAPagar = (diarias * 50.00) + (diarias * taxaServico);

                    // O printf formata o valor como moeda (duas casas decimais)
                    System.out.printf("-> Hóspede: %s | Total a pagar: R$ %.2f\n", nomeHospede, totalAPagar);
                    
                    // Incrementa o contador de contas encerradas
                    contasEncerradas++; 
                    break;
                    
                case 2:
                    System.out.println("\n-> Número de contas encerradas até o momento: " + contasEncerradas);
                    break;
                    
                case 3:
                    System.out.println("\nEncerrando o sistema da recepção...");
                    break;
                    
                default:
                    System.out.println("\nOpção incorreta! Tente novamente.");
                    break;
            }

        } while (opcao != 3); // O laço só para quando o recepcionista digitar 3

        teclado.close();
    }
}