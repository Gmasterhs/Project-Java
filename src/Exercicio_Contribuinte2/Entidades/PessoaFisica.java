package Exercicio_Contribuinte2.Entidades;

public class PessoaFisica extends Contrinuinte
{
    String especificacao;
    double gastoSaude;

    // Construtor

    public PessoaFisica(String nome, Double renda, String especificacao, double gastoSaude) {
        super(nome, renda);
        this.especificacao = especificacao;
        this.gastoSaude = gastoSaude;
    }

    //Setters e Getters

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    //ToString

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "especificacao='" + especificacao + '\'' +
                ", gastoSaude=" + gastoSaude +
                '}';
    }

    //Metodos


    @Override
    public Double imposto()
    {
      double res = (getRenda() < 20000.00) ?getRenda()*0.15 : getRenda()*0.25;

      if (gastoSaude > 0.00)
      {
          res -= gastoSaude *0.50;
      }
      return (res < 0)  ? 0.0 : res;
    }
}
