package exercicio_PedidoComposition.entities;

import exercicio_PedidoComposition.entities.enums.statusPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido
{
    private LocalDateTime momento;
    private statusPedido status;

    //Composição

    private Cliente cliente;
    private List <itemPedido> itens = new ArrayList<>();

    //Gettsrs e Setters

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public statusPedido getStattus() {
        return status;
    }

    public void setStattus(statusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Construtor

    public Pedido() {
    }

    public Pedido(LocalDateTime momento, statusPedido status, Cliente cliente)
    {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    //Metodos

    public void addItem (itemPedido item)
    {
        itens.add(item);
    }
    public void removeItem (itemPedido item)
    {
        itens.remove(item);
    }

    public double total()
    {
        double soma = 0;
        for (itemPedido c : itens)
        {
            soma += c.subTotal();
        }
        return soma;
    }

    //itemPedido item = new itemPedido();


    @Override
    public String toString()
        {
            StringBuilder sb = new StringBuilder();
            // Formatadores
            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            sb.append("ORDER SUMMARY:\n");
            sb.append("Order moment: ").append(momento.format(fmt1)).append("\n");
            sb.append("Order status: ").append(status).append("\n");

            // Linha do Cliente
            sb.append("Client: ").append(cliente.getNome())
                    .append(" (").append(cliente.getLocalDate().format(fmt2)).append(") - ")
                    .append(cliente.getEmail()).append("\n");

            sb.append("Order items:\n");

            // Laço dos itens
            for (itemPedido it : itens) {
                sb.append(it.getProduto().getNome()) // Pega o NOME do produto
                        .append(", $").append(String.format("%.2f", it.getPreco()))
                        .append(", Quantity: ").append(it.getQuantidade())
                        .append(", Subtotal: $").append(String.format("%.2f", it.subTotal()))
                        .append("\n");
            }

            // Adiciona o total ao texto
            sb.append("Total price: $").append(String.format("%.2f", total()));

            return sb.toString();

        }
}

