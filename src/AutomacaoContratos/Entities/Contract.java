package AutomacaoContratos.Entities;

import java.time.LocalDate;

public class Contract
{
    private Integer number;
    private LocalDate date;
    private Double Totalvolue;

    //Dependencia

    Installments installments;

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
