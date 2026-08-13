package Gaming_RPG.Entities;

import Gaming_RPG.Entities.Enum.TipoElemento;

public class Golpe
{
    private String nome;
    private int danoBase;
    private int ppAtual;
    private int ppMax;

    //Dependencia

    private TipoElemento tipo;

    //Construtor

    public Golpe(String nome, int danoBase, int ppAtual, int ppMax, TipoElemento tipo) {
        this.nome = nome;
        this.danoBase = danoBase;
        this.ppAtual = ppAtual;
        this.ppMax = ppMax;
        this.tipo = tipo;
    }

    //Getters and Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public int getPpAtual() {
        return ppAtual;
    }

    public void setPpAtual(int ppAtual) {
        this.ppAtual = ppAtual;
    }

    public int getPpMax() {
        return ppMax;
    }

    public void setPpMax(int ppMax) {
        this.ppMax = ppMax;
    }

    public TipoElemento getTipo() {
        return tipo;
    }

    public void setTipo(TipoElemento tipo) {
        this.tipo = tipo;
    }

    //Methods

    public boolean gastarPP ()
    {
        if (ppAtual > 0)
        {
            ppAtual--;
        }
        return true;
    }

}
