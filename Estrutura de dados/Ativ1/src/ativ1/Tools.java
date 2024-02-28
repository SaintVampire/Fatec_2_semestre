package ativ1;

import javax.swing.JOptionPane;

public class Tools {
    
    public static boolean confirmarContinuacao() {
        
            int resposta = JOptionPane.showConfirmDialog(
                null, // Componente pai (null para centralizar na tela)
                "Deseja continuar?", // Mensagem para o usuário
                "Confirmação", // Título da caixa de diálogo
                JOptionPane.YES_NO_OPTION // Tipo de opções (Sim/Não)
            );
    
            // Retorna verdadeiro se a opção selecionada for "Sim" e falso caso contrário
            return resposta == JOptionPane.YES_OPTION;
        }
}

