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
        double imp;
        if (healthExpenditure <= 20000.0)
        {
            imp = getAnualIncome() * 0.15;
        }
        else
        {
            imp =  getAnualIncome() * 0.25;
        }

        double res = imp - (healthExpenditure * 0.5);
        return  res;


    }
}
