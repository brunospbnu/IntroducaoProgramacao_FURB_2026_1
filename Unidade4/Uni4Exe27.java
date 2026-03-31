package Unidade4;

import java.util.Scanner;

/*
Análise:
Ler as horas e minutos em 2 valores inteiros, referentes a entrada de um veículo no estacionamento.
Cálcular e exibir o custo estacionado
1° e 2° hora - R$ 5,00 cada 
3° e 4° hora - R$ 7,50 cada 
5° hora e seguintes - R$ 10,00 cada 
Os valores são arredondados sempre para a hora, sendo para a mais proxima.

OK.

Entradas:
horaChegada
minChegada
horaSaida
minSaida


Saida:
precoCobrado


Algoritmo:
ler as entradas.

horas = horaSaida - horaChegada
horasEmMin = horas * 60
min = minSaida - minChegada
diferencaEmMin = horasEmMin + min

horasPerm = diferencaEmMin / 60
minPerm = diferencaEmMin % 60

escrever "O tempo de permanênica foi de " + horasPerm +" horas e " + minPerm + " minutos."

Se diferencaEmMin < 1440 && > 0

    Se diferencaEmMin < 60
    precoCobrado = 5

    Senão se diferencaEmMin > 60 && diferencaEmMin < 90
    precoCobrado = 5

    Senão se diferencaEmMin >= 90 && diferencaEmMin < 150
    precoCobrado = 10

    Senão se diferencaEmMin >= 150 && diferencaEmMin < 210
    precoCobrado = 17,5

    Senão se diferencaEmMin >= 210 && diferencaEmMin < 270
    precoCobrado = 25

    Senão se diferencaEmMin >= 270 && diferencaEmMin < 330
    precoCobrado = 35

    Senão se diferencaEmMin >= 330
    quantHorasMais = diferencaEmMin / 330
    precoCobrado = 35 + (10 * quantHorasMais)

escrever "Preço Cobraro = " + precoCobrado

Senão
escrever "Tempo informado incorretamente"


*/
public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- Programa para calcular o tempo estacionado de um carro e o valor cobrado ---");
        System.out.println("Insira a Hora da Chegada");
        int horaChegada = teclado.nextInt();
        System.out.println("Insira os Minutos da Chegada");
        int minChegada = teclado.nextInt();
        System.out.println("Insira a Hora da Saida");
        int horaSaida = teclado.nextInt();
        System.out.println("Insira aos Minutos da Saida");
        int minSaida = teclado.nextInt();
        
        int tempoChegadaEmMin = (horaChegada * 60) + minChegada;
        int tempoSaidaEmMin = (horaSaida * 60) + minSaida;

        int diferencaEmMin = tempoSaidaEmMin - tempoChegadaEmMin;
        int horasPerm = diferencaEmMin / 60;
        int minPerm = diferencaEmMin % 60;
        
        System.out.println("O tempo de permanênica foi de " + (int) horasPerm +" horas e " + (int) minPerm + " minutos.");

        // 2. Lógica do Arredondamento (Se sobrou 30 min ou mais, cobra +1 hora)

        int horasCobradas = diferencaEmMin / 60;

        if (diferencaEmMin % 60 >= 30) {
            horasCobradas++; 
        }
        
        // Se ficou menos de 30 min, arredondaria para zero. Cobramos o mínimo de 1 hora.

        if (horasCobradas == 0 && diferencaEmMin > 0) {
            horasCobradas = 1;
        }

        // 3. Calcula o preço baseado NAS HORAS REDONDAS
        double precoCobrado = 0;
        
        if (horasCobradas == 1 || horasCobradas == 2) {
            // 1ª e 2ª hora custam 5 reais cada
            precoCobrado = horasCobradas * 5.0;
        } 
        else if (horasCobradas == 3 || horasCobradas == 4) {
            // Se ficou 3 ou 4 horas: Paga R$ 10 (pelas duas primeiras) + R$ 7,50 por hora extra
            precoCobrado = 10.0 + ((horasCobradas - 2) * 7.5);
        } 
        else if (horasCobradas >= 5) {
            // Se ficou 5 ou mais: Paga R$ 25 (pelas quatro primeiras) + R$ 10,00 por hora extra
            precoCobrado = 25.0 + ((horasCobradas - 4) * 10.0);
        }

        System.out.println("Preço Cobrado = " + precoCobrado);
    
    teclado.close();
    }
    }
