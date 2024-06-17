package main.View.ListaCliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Cliente> clientes;
    private JFrame frame;
    private JList<Cliente> listaClientes;
    private JLabel labelTotalClientes;

    public Restaurante() {
        clientes = new ArrayList<>();
        clientes.add(new Cliente("Lucas", 2));
        clientes.add(new Cliente("Maia", 4));
        clientes.add(new Cliente("Rocha", 3));
        criarEExibirGUI();
    }

    private void criarEExibirGUI() {
        frame = new JFrame("Lista de Clientes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel painelCabecalho = new JPanel(new BorderLayout());
        labelTotalClientes = new JLabel("Total de Clientes: " + clientes.size());
        painelCabecalho.add(labelTotalClientes, BorderLayout.EAST);

        JPanel painelLista = new JPanel(new BorderLayout());
        listaClientes = new JList<>(new DefaultListModel<>());
        atualizarListaClientes();
        painelLista.add(new JScrollPane(listaClientes), BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();
        JButton botaoNovoPedido = new JButton("Novo Pedido");
        botaoNovoPedido.addActionListener(new NovoPedidoListener());
        JButton botaoFinalizarAtendimento = new JButton("Finalizar Atendimento");
        botaoFinalizarAtendimento.addActionListener(new FinalizarAtendimentoListener());
        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e -> frame.dispose());

        painelBotoes.add(botaoNovoPedido);
        painelBotoes.add(botaoFinalizarAtendimento);
        painelBotoes.add(botaoVoltar);

        frame.add(painelCabecalho, BorderLayout.NORTH);
        frame.add(painelLista, BorderLayout.CENTER);
        frame.add(painelBotoes, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void atualizarListaClientes() {
        DefaultListModel<Cliente> model = (DefaultListModel<Cliente>) listaClientes.getModel();
        model.clear();
        for (Cliente cliente : clientes) {
            model.addElement(cliente);
        }
        labelTotalClientes.setText("Total de Clientes: " + clientes.size());
    }

    private class NovoPedidoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Cliente clienteSelecionado = listaClientes.getSelectedValue();
            if (clienteSelecionado != null) {
                new NovoPedido(clienteSelecionado);
            } else {
                JOptionPane.showMessageDialog(frame, "Por favor, selecione um cliente.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class FinalizarAtendimentoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Cliente clienteSelecionado = listaClientes.getSelectedValue();
            if (clienteSelecionado != null) {
                Pedido pedido = clienteSelecionado.getPedido();
                if (pedido != null) {
                    double valorTotal = pedido.getTotal();
                    double valorComTaxas = valorTotal * 1.10;

                    String mensagem = String.format(
                            "Valor Total para %s: R$ %.2f\nValor com taxas: R$ %.2f",
                            clienteSelecionado.getNome(), valorTotal, valorComTaxas);

                    JOptionPane.showMessageDialog(frame, mensagem, "Resumo do Pedido", JOptionPane.INFORMATION_MESSAGE);

                    clientes.remove(clienteSelecionado);
                    atualizarListaClientes();
                    JOptionPane.showMessageDialog(frame, "Atendimento finalizado para " + clienteSelecionado.getNome());
                } else {
                    JOptionPane.showMessageDialog(frame, "O cliente não tem um pedido.", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Por favor, selecione um cliente.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Restaurante::new);
    }
}