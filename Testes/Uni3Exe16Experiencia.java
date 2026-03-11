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
        JFrame janela = new JFrame("Calculadora de Troco");
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
            int Notas100 = (int) (diferenca / 100);
            int Notas10 = (int) (diferenca % 100) / 10;
            int Notas1 = (int) ((diferenca % 100) % 10);
            int numMinNotas = Notas100 + Notas10 + Notas1;
        labelResultado.setText("<html>O número mínimo de notas de troco é: " + numMinNotas +
                "<br>Quantidade de Notas de 100 necessárias: " + Notas100 +
                "<br>Quantidade de Notas de 10 necessárias: " + Notas10 +
                "<br>Quantidade de Notas de 1 necessárias: " + Notas1 + "</html>");
    

    }}
        
    );
        janela.setVisible(true);
}}
