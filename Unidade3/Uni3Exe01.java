import java.util.Scanner;
public class Uni03Exe01 {
    //Análise: será considerado metros.
    //Entrada: largura, comprimento.
    //Saida: area.
    //Processo: area = largura * comprimento.
    /*Fluxograma: 
    ler largura
    ler comprimento
    area = largura * comprimento
    escrever area
    */
       public static void main(String[] args) {
          Scanner leitor = new Scanner(System.in);
          System.out.print("Digite a largura do terreno em metros: ");
          float largura = leitor.nextFloat();
          System.out.print("Digite o comprimento do terreno em metros: ");
          float comprimento = leitor.nextFloat();
          float area = largura * comprimento;
          System.out.println("A área do terreno é: " + area + " metros quadrados.");
          leitor.close();    }    
        }
