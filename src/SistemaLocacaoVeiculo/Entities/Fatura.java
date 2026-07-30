package SistemaLocacaoVeiculo.Entities;

public class Fatura
{
    private Double pagamentoBasico;
    private Double imposto;

    //Construtor


    public Fatura(Double pagamentoBasico, Double imposto)
    {
        this.pagamentoBasico = pagamentoBasico;
        this.imposto = imposto;
    }

    //Getters and Setters

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getPagamentoTotal()
    {
        return pagamentoBasico + imposto;
    }

    public String toString ()
    {
        return "Pagamento Basico" + String.format("%.2f",pagamentoBasico)
                + "Imposto" + String.format("%.2f", imposto)
                + "Pagamento Total: " + String.format("%.2f",getPagamentoTotal());
    }

}
