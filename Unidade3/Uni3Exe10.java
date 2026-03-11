import java.util.Scanner;

public class Uni3Exe10 {
/*
Entradas: catetoOposto, catetoAdjacente
Saida: hipotenusa
Processo: 
hipotenusa² = (catetoOposto^2 + catetoAdjacente^2)
hipotenusa = raiz quadrada de hipotenusa²
Algoritmo:
ler catetoOposto
ler catetoAdjacente
hipotenusaAoQuadrado = (catetoOposto^2 + catetoAdjacente^2)
hipotenusa = raiz quadrada de hipotenusaAoQuadrado
escrever hipotenusa

*/
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do cateto oposto: ");
        double catetoOposto = teclado.nextDouble();
        System.out.println("Digite o valor do cateto adjacente: ");
        double catetoAdjacente = teclado.nextDouble();
        double hipotenusaAoQuadrado = Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2);
        double hipotenusa = Math.sqrt(hipotenusaAoQuadrado);
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
        teclado.close();
    }}