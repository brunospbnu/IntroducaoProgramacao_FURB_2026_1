import java.util.Scanner;

public class Uni3Exe11 {

    /*
    Entrada: temperaturaCelsius
    Saida: temperaturaFahrenheit
    Processamento: temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32
    Algoritmo:
    ler temperaturaCelsius
    ler temperaturaFahrenheit
    temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32
    escrever temperaturaFahrenheit
    */

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = teclado.nextDouble();
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);
        teclado.close();
        
    }
}
