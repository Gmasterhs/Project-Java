package exercicio_Contribuinte.entities;

public class Individual extends TaxPayment
{
    private Double healthExpenditure;

    //Gettsrs and Setteres


    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    //Constructor

    public Individual(String name, Double anualIncome, Double healthExpenditure) {
        super(name, anualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    // Methods


    @Override
    public Double tax()
    {
        double basicTax = (getAnualIncome() < 20000.00) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
        double rebate = healthExpenditure * 0.5;
        double finalTax = basicTax - rebate;

        if (finalTax < 0)
        {
            return  0.0;
        } else {
            return finalTax;
        }
    }
}
