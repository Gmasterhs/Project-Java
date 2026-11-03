package Exercicio_Set01.Entities;

import java.time.Instant;
import java.util.Objects;

public class VehicleLog
{
    private String placa;
    private Instant momento;

    //Construtor

    public VehicleLog(String placa, Instant momento)
    {
        this.placa = placa;
        this.momento = momento;
    }

    //Gettsrs and Seters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    //HeshCode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VehicleLog that = (VehicleLog) o;
        return Objects.equals(placa, that.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(placa);
    }
}
