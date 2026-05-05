package exercico_Herança;

public class contaPremiun extends Conta
{
    private Double loanLimit;

    public contaPremiun(Double balance, Integer numero, String holder, Double loanLimit) {
        super(balance, numero, holder);
        this.loanLimit = loanLimit;
    }
}
