package exercicio_PedidoComposition.entities;

import exercicio_PedidoComposition.entities.enums.statusPedido;

import java.time.LocalDateTime;
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



}
