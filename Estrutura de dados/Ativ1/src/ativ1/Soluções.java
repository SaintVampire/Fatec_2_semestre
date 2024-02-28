/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ1;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

/**
 *
 * @author leo_a
 */
public class Soluções {

    public double um, dois, tres, soma;

    // Tools ferramenta = new Tools();

    public void soma() {
        do {
            this.um = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            this.dois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
            this.tres = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));

            soma += um += dois += tres;

            JOptionPane.showMessageDialog(null, "Seu resultado é: " + soma);

            int resposta = JOptionPane.showConfirmDialog(
                    null, // Componente pai (null para centralizar na tela)
                    "Deseja continuar?", // Mensagem para o usuário
                    "Confirmação", // Título da caixa de diálogo
                    JOptionPane.YES_NO_OPTION // Tipo de opções (Sim/Não)
            );

            // Verifica a escolha do usuário
            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Obrigado e volte sempre!");
                break; // Sai do loop se o usuário escolher "Não"
            }

        } while (true); // Repete o loop indefinidamente
    }

    public void mes() {
        do {
            String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                    "Outubro", "Novembro", "Dezembro" };
            int numMes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês que deseja"));
            if (numMes >= 1 && numMes <= 12) {
                // Obtém o nome do mês correspondente ao número inserido pelo usuário
                String nomeMes = meses[numMes - 1];
                // Exibe o nome do mês correspondente ao número inserido pelo usuário
                JOptionPane.showMessageDialog(null, numMes + " é o mês de " + nomeMes);

            } else {
                // Se o número do mês estiver fora do intervalo válido, exibe uma mensagem de
                // erro
                JOptionPane.showMessageDialog(null, "Número de mês inválido. Digite um número entre 1 e 12.");
            }
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja continuar?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Obrigado e volte sempre!");
                break;
            }
        } while (true);
    }

    public void equilatero() {
        do {
            this.um = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro lado"));
            this.dois = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo lado"));
            this.tres = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do terceiro lado"));

            if (um == dois && um == tres) {
                JOptionPane.showMessageDialog(null, "Este triângulo é equilátero");
            } else {
                JOptionPane.showMessageDialog(null, "Este triângulo não é equilátero");
            }
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja continuar?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Obrigado e volte sempre!");
                break;
            }
        } while (true);
    }

    public void igualdade() {
        do {
            this.um = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            this.dois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
            if (um == dois) {
                JOptionPane.showMessageDialog(null, "Estes valores são iguais");
            } else {
                JOptionPane.showMessageDialog(null, "Estes valores não são iguais");
            }
            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja continuar?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Obrigado e volte sempre!");
                break;
            }
        } while (true);
    }

    public void negativo() {

        double[] numero = new double[3];
        numero[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        numero[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        numero[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));

        int negativa = 0;
        for (double num : numero) {
            if (num < 0) {
                negativa++;
            }
        }
        if (negativa > 0) {
            JOptionPane.showMessageDialog(null, "Dentre os números, " + negativa + " são negativos");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número é negativo");
        }
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Obrigado e volte sempre!");
        }
    }

    public void votacao() {
        try {
            do {
                int idade;
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
                if (idade < 16) {
                    JOptionPane.showMessageDialog(null, "Você não pode votar.");
                } else if (idade >= 16 && idade < 18 || idade >= 70) {
                    JOptionPane.showMessageDialog(null, "Seu voto é facultativo.");
                } else {
                    JOptionPane.showMessageDialog(null, "Seu voto é obtigatório");
                }

            } while (true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido");
            } 
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Obrigado e volte sempre!");
        }
    }
}