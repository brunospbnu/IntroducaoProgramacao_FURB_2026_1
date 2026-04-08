package Testes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uni3Exe16Experiencia {

    /*
    Entrada: valorTotalCompra, valorDadoPeloCliente.
    Saídas: numMinNotas, Notas100, Notas10, Notas1.
    Algorítimo:
    INICIO
    ler valorTotalCompra
    ler valorDadoPeloCliente
    diferenca = valorDadoPeloCliente - valorTotalCompra
    Notas100 = diferenca / 100
    Notas10 = (diferenca % 100) / 10
    Notas1 = (diferenca % 100) % 10
    numMinNotas = Notas100 + Notas10 + Notas1
    escrever "O número mínimo de notas de troco é: " + numMinNotas
    escrever "Quantidade de Notas de 100 necessárias: " + Notas100
    escrever "Quantidade de Notas de 10 necessárias: " + Notas10
    escrever "Quantidade de Notas de 1 necessárias: " + Notas1
    FIM
    */
    public static void main(String[] args){
        JFrame janela = new JFrame("Calculadora de Troco - Usar ponto para separar centavos");
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        JLabel labelValorTotalCompra = new JLabel("Valor Total da Compra:");
        JTextField textValorTotalCompra = new JTextField(10);
        JLabel labelValorDadoPeloCliente = new JLabel("Valor Dado pelo Cliente:");
        JTextField textValorDadoPeloCliente = new JTextField(10);
        JButton botaoCalcular = new JButton("Calcular Troco");
        JLabel labelResultado = new JLabel("");
        janela.add(labelValorTotalCompra);
        janela.add(textValorTotalCompra);
        janela.add(labelValorDadoPeloCliente);
        janela.add(textValorDadoPeloCliente);
        janela.add(botaoCalcular);
        janela.add(labelResultado);
        botaoCalcular.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            double valorTotalCompra = Double.parseDouble(textValorTotalCompra.getText());
            double valorDadoPeloCliente = Double.parseDouble(textValorDadoPeloCliente.getText());
            double diferenca = valorDadoPeloCliente - valorTotalCompra;
            int Notas100 = (int) diferenca / 100;
            diferenca = (diferenca % 100);
            int Notas50 = (int) diferenca / 50;
            diferenca = diferenca  % 50;
            int Notas20 = (int) diferenca / 20;
            diferenca = diferenca % 20;
            int Notas10 =(int) diferenca / 10;
            diferenca = diferenca % 10;
            int Notas5 = (int) diferenca / 5;
            diferenca = diferenca % 5;
            int Notas2 = (int) diferenca / 2;
            diferenca = diferenca % 2;
            int Moedas1 = (int) diferenca / 1;
            diferenca = (diferenca % 1)*100;
            int Moedas050 = (int) diferenca / 50;
            diferenca = diferenca % 50;
            int Moedas025 = (int) diferenca / 25;
            diferenca = diferenca % 25;
            int Moedas010 = (int) diferenca /10;
            diferenca = diferenca % 10;
            int Moedas005 = (int) diferenca /5;
            diferenca = diferenca % 5;
            int Moedas001 = (int) diferenca /1;



            int numMinNotas = Notas100 + Notas50 + Notas20 + Notas10 + Notas5 + Notas2;
        labelResultado.setText("<html>O número mínimo de notas de troco é: " + numMinNotas +
                "<br> Quantidade de Notas / Moedas necessárias: <br> " 
                + "<br>" + Notas100 + " nota(s) de R$ 100.00; " 
                + "<br>" + Notas50 + " nota(s) de R$ 50.00; " 
                + "<br>" + Notas20 + " nota(s) de R$ 20.00; "
                + "<br>" + Notas10 + " nota(s) de R$ 10.00; "
                + "<br>" + Notas5 + " nota(s) de R$ 5.00; "
                + "<br>" + Notas2 + " nota(s) de R$ 2.00; "
                + "<br>" + Moedas1 + " moeda(s) de R$ 1.00; "
                + "<br>" + Moedas050 + " moeda(s) de R$ 0.50; "
                + "<br>" + Moedas025 + " moeda(s) de R$ 0.25; "
                + "<br>" + Moedas010 + " moeda(s) de R$ 0.10; "
                + "<br>" + Moedas005 + " moeda(s) de R$ 0.05; "
                + "<br>" + Moedas001 + " moeda(s) de R$ 0.01; "
                 + "</html>");
    
    }}
        
    );
        janela.setVisible(true);
}}
