package AutomacaoContratos.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract
{
    private Integer number; //(número do contrato)
    private LocalDate date; //(data do contrato)
    private Double Totalvolue; //(Valro Total do Contrato)

    //Dependencia

     List<Installments> list = new ArrayList<>(); //( <-- Pegar o Resultado de Paypal Service e Jogar aqui dentro)

    //Gettsrs and Setters

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalvolue() {
        return Totalvolue;
    }

    public void setTotalvolue(Double totalvolue) {
        Totalvolue = totalvolue;
    }

    //Consturctor

    public Contract(Integer number, LocalDate date, Double totalvolue)
    {
        this.number = number;
        this.date = date;
        Totalvolue = totalvolue;
    }
}
