package AutomacaoContratos.Entities;

import java.time.LocalDate;

public class Installments //Parcelas
{
    private LocalDate dueDate; //(data de vencimento)
    private Double amount; //(valor da parcela)

    //Getters and Setters

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    //Constructor

    public Installments(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    //Methods

    public String toString()
    {
        return "Valor da Parcela: " + amount + ", Data de Vencimento: " + dueDate;
    }
}