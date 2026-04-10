package exercicio_WorkerUML_01.entities;

import java.time.LocalDate;

public class HourContract   //Contrato por Hora
{
    private LocalDate date;
    private Double valuePerHur;
    private Integer hours;

    //Contructors

    public HourContract() {

    }
    public HourContract(LocalDate date) {
        this.date = date;
    }

    //Getsrs and Setters

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //Metods

    public Double totalVolue ()
    {
        return valuePerHur * hours;
    }
}
