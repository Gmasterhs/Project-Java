package Gaming_RPG.Entities.Enum;

public enum TipoElemento {
    FOGO,
    AGUA,
    PLANTA,
    NORMAL;

    public static double calularMultiplicador (TipoElemento ataque, TipoElemento tipagem)
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

}
