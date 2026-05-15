package exercicio_Contribuinte.entities;

public class Individual extends TaxPayment
{
    private Double healthExpenditure;

    //Constructor

    public Individual(String name, Double anualIncome, Double healthExpenditure)
    {
        super(name, anualIncome);
    }

    //Gettsrs and Setters


    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    //Methods


    @Override
    public double Tax()
    {
        double res;
        if (getAnualIncome() <= 20000.00)
        {
            res = getAnualIncome() - (getAnualIncome() * (15.0 / 100.0) - (healthExpenditure / 2));

        } else
        {
            res = getAnualIncome() - (getAnualIncome() * (25.0 / 100.0) - (healthExpenditure / 2));
        }
        if (res < 0) {
            res = 0.0;
        return res;
    }
}
