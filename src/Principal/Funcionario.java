package Principal;

public class Funcionario 
{
	private String nome;
	private double salario;
	
	//Getters and Setters
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public double getSalario() 
	{
		return salario;
	}
	public void setSalario(double salario) 
	{
		this.salario = salario;
	}
	
	
	// Construtores
	
	public Funcionario(String nome, double salario) 
	{
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario() 
	{
		
	}
	
	//Metodos
	
	public void aumentarSalario()
	{
			salario *= 1.1;
	}
	
	
	
}
