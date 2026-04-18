package exercicio_PedidoComposition.entities;

public class Produto {
    private String nome;
    private Double preco;

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //Construtor


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
