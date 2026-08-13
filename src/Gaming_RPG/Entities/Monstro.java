package Gaming_RPG.Entities;

import Gaming_RPG.Entities.Enum.TipoElemento;

import java.util.ArrayList;
import java.util.List;

public class Monstro
{
    private String nomne;
    private int nivel;
    private int hpMax;
    private int hpAtual;
    private int ataque;
    private int defesa;
    private int velocidade;

    //Dependencia

    private TipoElemento tipagem;

    List <Golpe> list = new ArrayList<>();

    //Construtor


    public Monstro(String nomne, int nivel, int hpMax, int hpAtual, int ataque, int defesa, int velocidade, TipoElemento tipagem, List<Golpe> list) {
        this.nomne = nomne;
        this.nivel = nivel;
        this.hpMax = hpMax;
        this.hpAtual = hpAtual;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.tipagem = tipagem;
        this.list = list;
    }

    //Getters e Setters

    public String getNomne() {
        return nomne;
    }

    public void setNomne(String nomne) {
        this.nomne = nomne;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getHpAtual() {
        return hpAtual;
    }

    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public TipoElemento getTipagem() {
        return tipagem;
    }

    public void setTipagem(TipoElemento tipagem) {
        this.tipagem = tipagem;
    }

    public List<Golpe> getList() {
        return list;
    }

    public void setList(List<Golpe> list) {
        this.list = list;
    }

    //Methods


}
