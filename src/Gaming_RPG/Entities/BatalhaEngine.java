package Gaming_RPG.Entities;

import Gaming_RPG.Entities.Enum.TipoElemento;

public class BatalhaEngine
{
    private Oponente jogador;
    private Oponente oponente;

    //Construtor

    public BatalhaEngine(Oponente play, Oponente monstro) {
        this.jogador = play;
        this.oponente = monstro;
    }

    //Getters and Setters

    public Oponente getJogador() {
        return jogador;
    }

    public void setJogador(Oponente jogador) {
        this.jogador = jogador;
    }

    public Oponente getOponente() {
        return oponente;
    }

    public void setOponente(Oponente oponente) {
        this.oponente = oponente;
    }

    //Metodos

    public double calularMultiplicador(TipoElemento ataque, TipoElemento tipagem)
    // Recebe o tipo do elemento do ataque e o tipo do elemento de quem está defendendo, e retorna o multiplicador de dano (2.0, 0.5 ou 1.0).
    {
        //vantagens
        if (ataque == TipoElemento.FOGO && tipagem == TipoElemento.PLANTA) return 2.00;
        if (ataque == TipoElemento.AGUA && tipagem == TipoElemento.FOGO) return 2.00;
        if (ataque == TipoElemento.PLANTA && tipagem == TipoElemento.AGUA) return 2.00;

        //Desvantagens

        if (ataque == TipoElemento.FOGO && tipagem == TipoElemento.AGUA) return 0.5;
        if (ataque == TipoElemento.AGUA && tipagem == TipoElemento.PLANTA) return 0.5;
        if (ataque == TipoElemento.PLANTA && tipagem == TipoElemento.FOGO) return 0.5;

        //Normal
        return 1.0;
    }

    public void iniciarbatalha ()
    {
        System.out.println(" Batalha Iniciada ");
        System.out.println(jogador.getNomne() + " VS " + oponente.getNomne());

        // Enquanto AMBOS estiverem vivos a baalha continua
        while (jogador.estaVIvo() && oponente.estaVIvo())
        {
            //Jogador usa o primeiro golpe disponível na lista
            Golpe golpeJogador = jogador.getGolpeList().getFirst();

            //Jogador ataca o oponente
            jogador.ataque(oponente, golpeJogador);

            // O oponente so ataca se tiver vida apos o ataque
            if (oponente.estaVIvo())
            {
                Golpe golpeOponente = oponente.getGolpeList().getFirst();
                oponente.ataque(jogador, golpeOponente);
            }
        }

        //Fim da Batalha
        if (jogador.estaVIvo())
        {
            System.out.println(" Parabens! " + jogador.getNomne() + " Venceu a Batalha ");
        }
        else {
            System.out.println("Derrota " + oponente.getNomne() + " Venceu a Batalha ");
        }
    }
}
