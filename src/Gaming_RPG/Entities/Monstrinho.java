package Gaming_RPG.Entities;

import Gaming_RPG.Entities.Enum.TipoElemento;

import java.util.ArrayList;
import java.util.List;

public class Monstrinho
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

    List <Golpe> golpeList = new ArrayList<>();

    //Construtor


    public Monstrinho(String nomne, int nivel, int hpMax, int hpAtual, int ataque, int defesa, int velocidade, TipoElemento tipagem) {
        this.nomne = nomne;
        this.nivel = nivel;
        this.hpMax = hpMax;
        this.hpAtual = hpAtual;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.tipagem = tipagem;
        this.golpeList = new ArrayList<>();
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

    public List<Golpe> getGolpeList() {
        return golpeList;
    }

    public void setGolpeList(List<Golpe> golpeList) {
        this.golpeList = golpeList;
    }

    //Methods

    public void aprenderGolpe (Golpe golpe)
    {
        if (this.golpeList.size() < 4)
        {
            golpeList.add(golpe);
        }
    }

    public void danoRecebido (int dano)
    {
        hpAtual = hpAtual - dano;
        if (hpAtual < 0)
        {
            hpAtual = 0; // Garante que a vida não fique negativa
        }
    }

    public boolean estaVIvo ()
    {
        return this.hpAtual > 0; //Estrutura if simplificada retorna true se + e folse se -
    }

    public void ataque (Monstrinho alvo, Golpe golpe, double multiplicadorElemento)
    {

        if (golpe.gastarPP()) {
            int danoTotal = ataque + golpe.getDanoBase();// Calcula o ataque total do atacante
            int danoRecebido = danoTotal - alvo.getDefesa();

            //Sorteio do Critico
            boolean aCritico = Math.random() < 0.10;
            double mutiplicadorCritico = aCritico ? 1.5 : 1.0;

            //Aplica o Multiplicador
            int danoFinal = (int) (danoRecebido * mutiplicadorCritico * multiplicadorElemento);
            danoFinal = Math.max(1, danoFinal);

            if (aCritico) {
                System.out.println("Acerto Critico!");
            }
            alvo.danoRecebido(danoFinal);

        } else {
            System.out.println("Sem PP para usar esse golpe!");

        }

    }

    public Golpe escolherGolpeValido()
    {
        for (Golpe g : golpeList) {
            if (g.getPpAtual() > 0) {
                return g;
            }
        }
        return null; // Nenhum golpe tem PP restante
    }


}
