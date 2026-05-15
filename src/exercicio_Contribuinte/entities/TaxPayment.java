package exercicio_Contribuinte.entities;

public abstract class TaxPayment
{
    private String name;
    private Double anualIncome;

    // Constructor

    public TaxPayment(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    //Methods

    public abstract double Tax ();


}
