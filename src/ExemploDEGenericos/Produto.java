package ExemploDEGenericos;

public class Produto implements Comparable<Produto> //Implementa a Interface Comparable
{
    private String nome;
    private Double preco;

    //Construtor

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getters e Setters

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

    public String toString()
    {
        return nome + " , " + String.format("%.2f", preco);
    }

    @Override
    public int compareTo(Produto outro) {
        return preco.compareTo(outro.getPreco());
    }
}
