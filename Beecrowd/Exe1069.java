package Beecrowd;

import java.util.Scanner;

public class Exe1069 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantCasos = teclado.nextInt();
        teclado.nextLine();
        String[] gaveta = new String[quantCasos];

        

        for (int h = 0; h < quantCasos; h++)
        {
            gaveta[h] = teclado.nextLine();
            String palavraAtual = gaveta[h];
            
            int paresCompletos = 0;
            int abertos = 0;

            for (int j = 0; j < palavraAtual.length(); j++) {

                char caractereAtual = palavraAtual.charAt(j);
                
                // Regra 1: Achou uma abertura, guardamos na memória
                if (caractereAtual == '<') {
                abertos++;}

                // Regra 2: Achou um fechamento, vamos verificar se tem alguém esperando
                else if (caractereAtual == '>') {
                
                // Só forma par se tiver algum '<' aberto anteriormente
                if (abertos > 0) { 
                    paresCompletos++; // Sucesso! Formamos um par válido.
                    abertos--;        // Aquele '<' que estava aberto, agora foi resolvido/fechado.
                }
                // Se 'abertos' for 0, esse '>' é ignorado, pois não tem par para ele.
                
            }
    }
    
    System.out.println(paresCompletos);
    
        }
        teclado.close();
    }}
