import java.util.Scanner;

public class Uni3Exe09 {
    /*
    Entradas: raioLata, alturaLata.
    Saída: volumeLata.
    Processamento: volumeLata = 3,14159265 * raioLata^2 * alturaLata.
    Algoritmo:
    ler raioLata
    ler alturaLata
    volumeLata = 3,14159265 * raioLata^2 * alturaLata
    escrever volumeLata
    
    */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio da lata: ");
        double raioLata = teclado.nextDouble();
        System.out.println("Digite a altura da lata: ");
        double alturaLata = teclado.nextDouble();
        double volumeLata = 3.14159265 * Math.pow(raioLata, 2) * alturaLata;
        System.out.println("O volume da lata de óleo é: " + volumeLata);
        teclado.close();

    }
}