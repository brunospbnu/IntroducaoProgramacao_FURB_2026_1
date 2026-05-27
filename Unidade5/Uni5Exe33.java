package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        
        // A variável precisa nascer fora do 'do-while' para que a condição no final consiga enxergá-la
        int voto;

        System.out.println("--- URNA ELETRÔNICA ---");
        System.out.println("1, 2, 3, 4 = Voto para os respectivos candidatos");
        System.out.println("5 = Voto Nulo");
        System.out.println("6 = Voto em Branco");
        System.out.println("0 = Encerrar votação");

        // O 'do-while' começa direto, sem precisar ler o voto antes!
        do {
            System.out.print("\nInforme o código do voto (ou 0 para encerrar): ");
            voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    totalVotos++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalVotos++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalVotos++;
                    break;
                case 4:
                    votosCandidato4++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                case 0:
                    // Faz o programa sair silenciosamente sem dar erro de "Opção incorreta"
                    System.out.println("Apuração dos votos iniciada...");
                    break;
                default:
                    // Se digitar 7, 8, etc.
                    System.out.println("Opção incorreta! Tente novamente.");
                    break;
            }

        } while (voto != 0); // O laço se repete ENQUANTO o voto não for zero

        System.out.println("\n--- RESULTADO DA ELEIÇÃO ---");
        
        if (totalVotos > 0) {
            System.out.println("Total de votos - Candidato 1: " + votosCandidato1);
            System.out.println("Total de votos - Candidato 2: " + votosCandidato2);
            System.out.println("Total de votos - Candidato 3: " + votosCandidato3);
            System.out.println("Total de votos - Candidato 4: " + votosCandidato4);
            System.out.println("Total de votos Nulos: " + votosNulos);
            System.out.println("Total de votos em Branco: " + votosBrancos);

            double percentualNulos = ((double) votosNulos / totalVotos) * 100;
            double percentualBrancos = ((double) votosBrancos / totalVotos) * 100;

            System.out.printf("\nPercentual de votos Nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Percentual de votos em Branco: %.2f%%\n", percentualBrancos);
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        teclado.close();
    }
}