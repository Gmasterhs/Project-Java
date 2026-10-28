package Exercicio_Set_HashCode.Entities;

import java.time.Instant;
import java.util.Objects;

public class Log
{
    private String username;
    private Instant moment;

    //Getters and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    //Construtor


    public Log(String username, Instant moment) {
        this.username = username;
        this.moment = moment;
    }

    //HeshCode and Equales

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(username, log.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }


}
