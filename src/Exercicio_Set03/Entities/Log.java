package Exercicio_Set03.Entities;

import java.time.Instant;
import java.util.Objects;

public class Log {
    private String ID;
    private String COdigo;
    private Instant data;

    public Log(String ID, String COdigo, Instant data) {
        this.ID = ID;
        this.COdigo = COdigo;
        this.data = data;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCOdigo() {
        return COdigo;
    }

    public void setCOdigo(String COdigo) {
        this.COdigo = COdigo;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(ID, log.ID) && Objects.equals(COdigo, log.COdigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, COdigo);
    }
}