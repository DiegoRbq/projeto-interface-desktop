package atividade.pkg01.tds.uc.pkg09.diego_rodrigues;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Atividade01TDSUC09Diego_Rodrigues {

    public static void main(String[] args) {
        // Criação e configuração da Janela
        JFrame janela = new JFrame();
        janela.setTitle("Sistema de Vendas - MVP");
        janela.setSize(400, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null);

        // Componentes visuais
        JLabel rotulo = new JLabel("Informe o valor da venda (R$):");
        JTextField campoValor = new JTextField(10);
        JButton botaoCalcular = new JButton("Calcular Venda");

        // Adicionando componentes à janela
        janela.add(rotulo);
        janela.add(campoValor);
        janela.add(botaoCalcular);

        // Evento de clique do botão
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String textoDigitado = campoValor.getText().trim();

                    // Validação de campo vazio
                    if (textoDigitado.isEmpty()) {
                        JOptionPane.showMessageDialog(janela, "Informe o valor da venda.");
                        return;
                    }

                    textoDigitado = textoDigitado.replace(",", ".");
                    double valorVenda = Double.parseDouble(textoDigitado);

                    // Validação de valor positivo
                    if (valorVenda <= 0) {
                        JOptionPane.showMessageDialog(janela, "O valor da venda deve ser maior que zero.");
                        return;
                    }

                    double valorTotal = valorVenda;

                    // Regra: se o valor for maior que 500, pede o percentual de desconto
                    if (valorVenda > 500.0) {
                        String textoDesconto = JOptionPane.showInputDialog(
                            janela, 
                            "Venda acima de R$ 500,00!\nInforme o percentual de desconto (%):"
                        );

                        if (textoDesconto != null && !textoDesconto.trim().isEmpty()) {
                            textoDesconto = textoDesconto.trim().replace(",", ".");
                            double desconto = Double.parseDouble(textoDesconto);

                            if (desconto < 0 || desconto > 100) {
                                JOptionPane.showMessageDialog(janela, "Percentual de desconto inválido. Nenhum desconto aplicado.");
                            } else {
                                valorTotal = valorVenda - (valorVenda * (desconto / 100.0));
                            }
                        }
                    }

                    // Exibição do total final formatado
                    JOptionPane.showMessageDialog(
                        janela, 
                        String.format("Valor total da venda: R$ %.2f", valorTotal)
                    );

                    // Limpa o campo e devolve o foco
                    campoValor.setText("");
                    campoValor.requestFocus();

                } catch (NumberFormatException erro) {
                    JOptionPane.showMessageDialog(janela, "Digite apenas valores numéricos válidos.");
                }
            }
        });

        // Exibe a janela
        janela.setVisible(true);
    }
}