package Gaming_RPG.Entities;

import Gaming_RPG.Entities.Enum.TipoElemento;

public class BatalhaEngine
{
    private Monstrinho jogador;
    private Monstrinho oponente;

    //Construtor

    public BatalhaEngine(Monstrinho play, Monstrinho monstro) {
        this.jogador = play;
        this.oponente = monstro;
    }

    //Getters and Setters

    public Monstrinho getJogador() {
        return jogador;
    }

    public void setJogador(Monstrinho jogador) {
        this.jogador = jogador;
    }

    public Monstrinho getOponente() {
        return oponente;
    }

    public void setOponente(Monstrinho oponente) {
        this.oponente = oponente;
    }

    //Metodos


    public void iniciarbatalha ()
    {
        System.out.println(" Batalha Iniciada ");
        System.out.println(jogador.getNomne() + " VS " + oponente.getNomne());

        // Enquanto AMBOS estiverem vivos a baalha continua
        while (jogador.estaVIvo() && oponente.estaVIvo()) {
            // Busca golpe disponível do jogador
            Golpe golpeJogador = jogador.escolherGolpeValido();

            if (golpeJogador != null) {
                double multJogador = TipoElemento.calularMultiplicador(golpeJogador.getTipo(), oponente.getTipagem());
                jogador.ataque(oponente, golpeJogador, multJogador);
            } else {
                System.out.println(jogador.getNomne() + " está sem PP em todos os golpes e não pode atacar!");
            }

            // Busca golpe disponível do oponente
            if (oponente.estaVIvo()) {
                Golpe golpeOponente = oponente.escolherGolpeValido();
                if (golpeOponente != null) {
                    double multOponente = TipoElemento.calularMultiplicador(golpeOponente.getTipo(), jogador.getTipagem());
                    oponente.ataque(jogador, golpeOponente, multOponente);
                } else {
                    System.out.println(oponente.getNomne() + " está sem PP em todos os golpes e não pode atacar!");
                }
            }

            // Trava de segurança: Se AMBOS estiverem sem PP, encerra a batalha em empate para não travar o programa
            if (jogador.escolherGolpeValido() == null && oponente.escolherGolpeValido() == null) {
                System.out.println("Ambos os monstrinhos estão sem PP! A batalha terminou em empate.");
                break;
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
