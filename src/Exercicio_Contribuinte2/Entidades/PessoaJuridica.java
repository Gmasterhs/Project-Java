package Exercicio_Contribuinte2.Entidades;

public class PessoaJuridica extends Contrinuinte
{

    private Double funcionario;
    private char especificacao;

    //Construtor

    public PessoaJuridica(String nome, Double renda, Double funcionario, char especificacao) {
        super(nome, renda);
        this.funcionario = funcionario;
        this.especificacao = especificacao;
    }

    //Gettsrs e Setters

    public Double getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Double funcionario) {
        this.funcionario = funcionario;
    }

    public char getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(char especificacao) {
        this.especificacao = especificacao;
    }

    //ToString

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "funcionario=" + funcionario +
                ", especificacao='" + especificacao + '\'' +
                '}';
    }

    //Metodos

    @Override
    public Double imposto()
    {
        return (getFuncionario() > 10 ? getRenda()*0.14 : getRenda()*0.16);
    }

}
