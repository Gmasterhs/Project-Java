package Gaming_RPG;

import Gaming_RPG.Entities.BatalhaEngine;
import Gaming_RPG.Entities.Enum.TipoElemento;
import Gaming_RPG.Entities.Golpe;
import Gaming_RPG.Entities.Monstrinho;

public class Main
{
    public static void main(String[] args)
    {
        // 1. Criando os Golpes com os 5 parâmetros corretos: (nome, danoBase, ppAtual, ppMax, tipo)

        Golpe lançaChamas = new Golpe("Lança-Chamas", 30,10, 10, TipoElemento.FOGO);
        Golpe jatoDagua = new Golpe("Jato-Dagua",30, 10, 10, TipoElemento.AGUA);
        Golpe folhaNavalha = new Golpe( "Folha-Navalha", 30, 10, 10, TipoElemento.PLANTA);
        Golpe ataqueRapido = new Golpe("Jato-Dagua",30, 10, 10, TipoElemento.NORMAL);
        Golpe garraAfiada = new Golpe("Garra-Afiada",30, 10, 10, TipoElemento.NORMAL);

        // 2. Criando o Monstro do Jogador

        Monstrinho Charizard = new Monstrinho("Charizard", 50, 100, 100,40, 80, 51, TipoElemento.FOGO);
        Charizard.aprenderGolpe(lançaChamas);
        Charizard.aprenderGolpe(garraAfiada);

        // 3. Criando o Monstro do Oponente

        Monstrinho Brastoise = new Monstrinho("Blastoise", 50, 100, 100,40, 85, 40, TipoElemento.AGUA);
        Brastoise.aprenderGolpe(jatoDagua);
        Brastoise.aprenderGolpe(ataqueRapido);

        // 4. Rodando a Batalha

        BatalhaEngine engine = new BatalhaEngine(Charizard, Brastoise);
        engine.iniciarbatalha();


    }
}
