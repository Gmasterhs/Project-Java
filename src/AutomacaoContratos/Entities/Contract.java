package AutomacaoContratos.Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract
{
    private Integer number;
    private LocalDate date;
    private Double Totalvolue;

    //Dependencia

    private List<Installments> parcelas = new ArrayList<>();

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

    public List<Installments> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Installments> parcelas) {
        this.parcelas = parcelas;
    }

    //Consturctor

    public Contract(Integer number, LocalDate date, Double totalvolue)
    {
        this.number = number;
        this.date = date;
        Totalvolue = totalvolue;
    }

    public String toString()
    {
        return "Numero: " + getNumber() + ", Date: " + getDate() + ", Valor total: " + getTotalvolue() + ", Parcelas: " +getParcelas();
    }


}
