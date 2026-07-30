package SistemaLocacaoVeiculo.Service;

public class ServicoImpostoBrasil implements ServicoImposto
{
    public Double imposto (Double quantia)
    {
        if (quantia <= 100)
        {
            return quantia * 0.20;
        }
        else
        {
            return quantia * 0.15;
        }
    }
}
