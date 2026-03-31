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
		Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Metodos
	
	public static void aumentoSalario()
	{
		
	}
	
	
}
