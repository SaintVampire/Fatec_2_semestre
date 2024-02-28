package ativ1;

import javax.swing.*;

public class Ativ1 {

    public static void main(String[] args) {
        boolean sucesso = false;
        Soluções objeto = new Soluções();
        OUTER: do {
            try {
                Object[] opcoes = { "Questão 1", "Questão 2", "Questão 3", "Questão 4", "Questão 5", "Questão 6",
                        "Questão 7", "Fechar" };
                int escolha = JOptionPane.showOptionDialog(
                        null, // Componente pai (null para centralizar na tela)
                        "Escolha uma opção:", // Mensagem para o usuário
                        "Opções", // Título da caixa de diálogo
                        JOptionPane.DEFAULT_OPTION, // Tipo de opções (padrão)
                        JOptionPane.QUESTION_MESSAGE, // Tipo de mensagem (pergunta)
                        null, // Ícone personalizado (null para usar o padrão)
                        opcoes, // Opções disponíveis
                        opcoes[0] // Opção padrão selecionada
                );
                switch (escolha) {
                    case JOptionPane.CLOSED_OPTION -> {
                        JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.\nObrigado.");
                        break OUTER;
                    }
                    case 0 -> {
                        objeto.soma();
                        sucesso = true; // Definindo sucesso como true após a operação bem-sucedida
                    }
                    case 1 -> {
                        objeto.mes();
                        sucesso = true;
                    }

                    case 2 -> {
                        objeto.mes();
                        sucesso = true;
                    }

                    case 3 -> {
                        objeto.equilatero();
                        sucesso = true;
                    }

                    case 4 -> {
                        objeto.igualdade();
                        sucesso = true;
                    }

                    case 5 -> {
                        objeto.negativo();
                        sucesso = true;
                    }

                    case 6 -> {
                        objeto.votacao();
                        sucesso = true;
                    }

                    case 7 -> {
                        // Lidar com outras opções selecionadas pelo usuário
                        JOptionPane.showMessageDialog(null, "Obrigado por me avaliar.\nAté mais!");
                        break OUTER;
                    }
                }

            } catch (Exception e) {
                // Tratamento genérico de exceção, se ocorrer qualquer exceção não prevista
                JOptionPane.showMessageDialog(null, "Erro inesperado. Tente novamente.");
            }
        } while (sucesso);

    }
}
