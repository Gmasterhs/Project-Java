package Exercicio_Contribuinte2.Entidades;

public class PessoaJuridica extends Contrinuinte
{

    private int funcionario;
    private String especificacao;

    //Construtor

    public PessoaJuridica(String nome, Double renda, int funcionario, String especificacao) {
        super(nome, renda);
        this.funcionario = funcionario;
        this.especificacao = especificacao;
    }

    //Gettsrs e Setters

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
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
