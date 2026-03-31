package exercicios_lista;

public class Entidades 
{
	private int Id;
	private String name;
	private Double salary;
	
	// Geters and Setters
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// Construtor 
	
	public Entidades(int id, String name, Double salary) 
	{
		this.Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Entidades() 
	{
		
	}
	
	// Metodos
	
	public void aumentoSalario(double porcentagem)
	{
		this.salary += this.salary * porcentagem / 100.0;
	}
	
	//@Override
	public String toString() 
	{
	    return "ID: " + this.Id 
	         + ", Nome: " + this.name 
	         + ", Salário: " + String.format("%.2f", salary);
	}
	
	
}
