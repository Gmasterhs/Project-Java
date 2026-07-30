package SistemaLocacaoVeiculo.Entities;

import SistemaLocacaoVeiculo.Entities.Enums.StatusLocacao;
import SistemaLocacaoVeiculo.Service.ServicoImposto;

import java.time.Duration;

public class ServicoLocacao {
    private Double precoPorHora;
    private Double precoPorDia;

    //Dependencia

    private ServicoImposto servicoImposto; //Usa a Interface

    //Construtor

    public ServicoLocacao(Double precoPorHora, Double precoPorDia, ServicoImposto servicoImposto) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.servicoImposto = servicoImposto;
    }
    //Geters and Setters

    public Double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public ServicoImposto getServicoImposto() {
        return servicoImposto;
    }

    public void setServicoImposto(ServicoImposto servicoImposto) {
        this.servicoImposto = servicoImposto;
    }

    //Metodos

    public void processarFatura(LocacaoVeiculo locacao) {
        double minutos = Duration.between(locacao.getInicio(), locacao.getFim()).toMinutes();
        double horas = minutos / 60.0;
        double dias = horas / 24;
        double valorBase;

        if (horas <= 12.0) {
            valorBase = getPrecoPorHora() * Math.ceil(horas);

        } else {
            valorBase = getPrecoPorDia() * Math.ceil(dias);
        }
        double Imposto = servicoImposto.imposto(valorBase);
        Fatura fatura = new Fatura(valorBase, Imposto);
        locacao.setFatura(fatura);
        locacao.setStatus(StatusLocacao.FINALIZADO);
    }
    public String toString()
    {
        return "Preço Por Dia: " + precoPorDia
                + "Preço Por Hora: " + precoPorHora;
    }
}




