package exercicio_Funcionario.entities;

public class OutsourcedEmployee extends Employee
{
    private Double additionalCharge;

    //Construtor

    public OutsourcedEmployee()
    {
        super();
    }

    public OutsourcedEmployee(Integer hours, String name, Double volueHour, Double additionalCharge) {
        super(hours, name, volueHour);
        this.additionalCharge = additionalCharge;
    }

    //Gettsrs and Setters


    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //Metodos


    @Override
    public Double payment() {
        return super.payment() + additionalCharge *1.1;
    }
}





