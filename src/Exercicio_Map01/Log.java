package Exercicio_Map01;

import java.util.Objects;

public class Log
{
    private String name;
    private Integer votos;

    //Construtor

    public Log(String name, Integer votos) {
        this.name = name;
        this.votos = votos;
    }

    //Gettsrs and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    //HashCode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(name, log.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
