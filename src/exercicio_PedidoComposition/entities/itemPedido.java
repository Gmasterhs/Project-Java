package exercicio_PedidoComposition.entities;

public class itemPedido {
    private Integer quantidade;
    private Double preco;

    //Composição

    private Produto produto;

    //Gettsrs e Setters

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    //Construtores

    public itemPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    //Metodos

    public Double subTotal()
    {
        return preco * quantidade;
    }
}
