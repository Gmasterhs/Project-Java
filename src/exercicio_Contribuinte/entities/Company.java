package exercicio_Contribuinte.entities;

public class Company extends TaxPayment
{
    private int namberOfEmployees;

    //Getts and Setters


    public int getNamberOfEmployees() {
        return namberOfEmployees;
    }

    public void setNamberOfEmployees(int namberOfEmployees) {
        this.namberOfEmployees = namberOfEmployees;
    }

    //Constructor

    public Company(String name, Double anualIncome, int namberOfEmployees) {
        super(name, anualIncome);
        this.namberOfEmployees = namberOfEmployees;
    }

    //Methods

    @Override
    public Double tax() {
        if (namberOfEmployees > 10) {
            return (getAnualIncome() * 0.14);
        }
        else {
            return (getAnualIncome() * 0.16);
        }

    }
}
