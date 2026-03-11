import java.util.Scanner;

public class Uni3Exe15 {
    /*
    Entrada: numInteiro3digitos.
    Saída: centenas, dezenas e unidades.
    Processo:
    ler numInteiro3digitos
    centenas = numInteiro3digitos / 100
    dezenas = (numInteiro3digitos % 100) / 10
    unidades = numInteiro3digitos % 10
    escrever centenas, dezenas e unidades
    */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 3 dígitos: ");
        int numInteiro3digitos = teclado.nextInt();
        int centenas = numInteiro3digitos / 100;
        int dezenas = (numInteiro3digitos % 100) / 10;
        int unidades = numInteiro3digitos % 10;
        System.out.println(centenas + " centena(s), " + dezenas + " dezena(s) e " + unidades + " unidade(s).");
        teclado.close();

    }
    }
