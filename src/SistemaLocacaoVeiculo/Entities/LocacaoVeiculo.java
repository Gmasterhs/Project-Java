package SistemaLocacaoVeiculo.Entities;

import SistemaLocacaoVeiculo.Entities.Enums.StatusLocacao;

import java.time.LocalDateTime;

public class LocacaoVeiculo
{
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Veiculo veiculo;

    //Dependencias / Associação

    Fatura fatura;
    StatusLocacao status;

    //Construtor

    public LocacaoVeiculo(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo, StatusLocacao status) {
        this.inicio = inicio;
        this.fim = fim;
        this.veiculo = veiculo;
        this.status = status;
    }

    //Getters and Seters

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public StatusLocacao getStatus() {
        return status;
    }

    public void setStatus(StatusLocacao status) {
        this.status = status;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Modelo: ").append(veiculo).append("\n");
        sb.append("Inicio: ").append(inicio).append("\n");
        sb.append("Fim").append(fim).append("\n");
        sb.append("Status: ").append(status).append("\n");
        if (fatura != null) {
            sb.append(fatura); // Pediu a Fatura!
        }

        return sb.toString();
    }
}
