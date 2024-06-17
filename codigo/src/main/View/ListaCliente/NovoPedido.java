package main.View.ListaCliente;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class NovoPedido extends JDialog {
    private Cliente cliente;
    private Map<JCheckBox, JSpinner> itensSelecionados;

    public NovoPedido(Cliente cliente) {
        this.cliente = cliente;
        this.itensSelecionados = new HashMap<>();
        criarEExibirGUI();
    }

    private void criarEExibirGUI() {
        setTitle("Novo Pedido para " + cliente.getNome());
        setLayout(new BorderLayout());
        setSize(400, 300);

        JPanel painelItens = new JPanel(new GridLayout(0, 1, 10, 10)); // 1 coluna para itens com espaçamento
        painelItens.setBorder(new EmptyBorder(10, 10, 10, 10)); // Borda vazia para espaçamento externo

        // Adicionar pratos
        JPanel painelPratos = new JPanel(new GridLayout(0, 1, 5, 5)); // 1 coluna para pratos com espaçamento
        painelPratos.setBorder(BorderFactory.createTitledBorder("Pratos"));
        painelPratos.add(criarItemPanel("Moqueca de Tilapia - R$50,00", 50.00));
        painelPratos.add(criarItemPanel("Falafel Assado - R$20,00", 20.00));
        painelPratos.add(criarItemPanel("Salada Primavera com Macarrão Konjac - R$25,00", 25.00));
        painelPratos.add(criarItemPanel("Escondidinho de Frango - R$35,00", 35.00));
        painelPratos.add(criarItemPanel("Strogonoff - R$30,00", 30.00));
        painelPratos.add(criarItemPanel("Cacarola de carne com legumes - R$40,00", 40.00));

        // Adicionar bebidas
        JPanel painelBebidas = new JPanel(new GridLayout(0, 1, 5, 5)); // 1 coluna para bebidas com espaçamento
        painelBebidas.setBorder(BorderFactory.createTitledBorder("Bebidas"));
        painelBebidas.add(criarItemPanel("Água - R$5,00", 5.00));
        painelBebidas.add(criarItemPanel("Suco - R$8,00", 8.00));
        painelBebidas.add(criarItemPanel("Refrigerante - R$8,00", 8.00));
        painelBebidas.add(criarItemPanel("Cerveja - R$6,00", 6.00));
        painelBebidas.add(criarItemPanel("Taça de vinho - R$18,00", 18.00));

        painelItens.add(painelPratos);
        painelItens.add(painelBebidas);

        JButton botaoAdicionar = new JButton("Adicionar Pedido");
        botaoAdicionar.addActionListener(new AdicionarPedidoListener());

        add(new JScrollPane(painelItens), BorderLayout.CENTER);
        add(botaoAdicionar, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel criarItemPanel(String descricao, double preco) {
        JPanel painelItem = new JPanel(new BorderLayout());
        JCheckBox checkBox = new JCheckBox(descricao);
        JSpinner spinnerQuantidade = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        Dimension spinnerSize = new Dimension(50, spinnerQuantidade.getPreferredSize().height); // Diminui o tamanho do
                                                                                                // JSpinner
                                                                                                // verticalmente
        spinnerQuantidade.setPreferredSize(spinnerSize);

        spinnerQuantidade.addChangeListener(e -> {
            int quantidade = (int) spinnerQuantidade.getValue();
            checkBox.setSelected(quantidade > 0);
        });

        painelItem.add(checkBox, BorderLayout.CENTER);
        painelItem.add(spinnerQuantidade, BorderLayout.EAST);

        itensSelecionados.put(checkBox, spinnerQuantidade);
        return painelItem;
    }

    private class AdicionarPedidoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Pedido pedido = cliente.getPedido();
            for (Map.Entry<JCheckBox, JSpinner> entry : itensSelecionados.entrySet()) {
                if (entry.getKey().isSelected()) {
                    int quantidade = (int) entry.getValue().getValue();
                    if (quantidade > 0) {
                        String descricao = entry.getKey().getText();
                        double preco = extrairPreco(descricao);
                        for (int i = 0; i < quantidade; i++) {
                            pedido.adicionarItem(new Item(descricao, preco));
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(NovoPedido.this,
                    "Pedido adicionado para " + cliente.getNome() + ". Total: R$" + pedido.getTotal());

            dispose();
        }

        private double extrairPreco(String descricao) {
            String[] partes = descricao.split(" - R\\$");
            return Double.parseDouble(partes[1].replace(",", "."));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Cliente cliente = new Cliente("Fulano", 2); // Exemplo de cliente
            new NovoPedido(cliente);
        });
    }
}
