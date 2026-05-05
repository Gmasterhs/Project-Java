package exercico_Herança;

public class Conta
{
    private Double balance;
    private Integer numero;
    private String holder;

    public Conta()
    {
    }

    public Conta(Double balance, Integer numero, String holder)
    {
        this.balance = balance;
        this.numero = numero;
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }




}
