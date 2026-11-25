package Exercicio_Contribuinte2.Entidades;

public abstract class Contrinuinte
{
    private String nome;
    private Double renda;

    //Construtor

    public Contrinuinte(String nome, Double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    //Getts and Settes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    //ToString

    @Override
    public String toString() {
        return "Contrinuinte{" +
                "nome='" + nome + '\'' +
                ", renda=" + renda +
                '}';
    }

    //Methods

    public abstract Double imposto();
}
