package Principal;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Funcionarios Serão Registrados?");
		int n = sc.nextInt();
		sc.nextLine();
		Funcionario[] vect = new Funcionario[n];
		
	    for (int i = 0; i < vect.length; i++)
	    {
	    	System.out.println("Nome do Funcionário");
	    	String name = sc.nextLine();
	    	
	    	///1
	    	System.out.println("Salario");
	    	double monay = sc.nextDouble();
	    	sc.nextLine();
	    	
	    	Funcionario f = new Funcionario(name, monay);
	    	vect [i]= f;
	    	
	    	if (f.getSalario() < 2000.00)
	    	{
	    		f.aumentarSalario();
	    	}
	    }
	    
	    for (int i = 0; i < vect.length; i++)
    	{
    		System.out.println("Nome: " + vect[i].getNome() + "Salario:  " + vect[i].getSalario());
    	}
	    
	   
	    
	    
	    
	 sc.close();	
	}

}
