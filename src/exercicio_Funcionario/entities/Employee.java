package exercicio_Funcionario.entities;

public class Employee
{
    private String name;
    private Integer hours;
    private Double volueHour;

    public String getName() {
        return name;
    }

    //Constructor

    public Employee()
    {
    }

    public Employee(Integer hours, String name, Double volueHour) {
        this.hours = hours;
        this.name = name;
        this.volueHour = volueHour;
    }

    //Gettsrs and Setters

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getVolueHour() {
        return volueHour;
    }

    public void setVolueHour(Double volueHour) {
        this.volueHour = volueHour;
    }

    //Metods

    public Double payment ()
    {
        return volueHour * hours;
    }
}
