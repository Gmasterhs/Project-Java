package exercicio_WorkerUML_01.entities;

import exercicio_WorkerUML_01.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker
{

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //Associações

    private Department department;

    private List <HourContract> contracts = new ArrayList<>();

    // Constructor

    public Worker()
    {

    }
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department)
    {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Methods

    public void addContract (HourContract contract)
    {
        contracts.add(contract);
    }

    public void removeContract (HourContract contract)
    {
        contracts.remove(contract);
    }

    public Double income(int yeah, int month)
    {
        double sum = baseSalary;
        for (HourContract c : contracts)
        {
            int c_year = c.getDate().getYear();
            int c_month = c.getDate().getMonthValue();
            if (c_year == yeah && c_month == month)
            {
                sum += c.totalVolue();
            }
        }
        return sum;
    }



}
