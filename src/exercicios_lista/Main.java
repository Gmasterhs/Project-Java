package exercicios_lista;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Entidades> list = new ArrayList<>();
		
		System.out.println("Quantas Pessaos Deseja Adicionar? ");
		Integer n = sc.nextInt();
		sc.next();
		
		for (int i=1; i<n;i++)
		{
			System.out.println("Digite o ID");
			int id = sc.nextInt();
			
			System.out.println("Nome");
			String nome = sc.nextLine();
			
			System.out.println("Salario");
			double salario = sc.nextDouble();
			
			Entidades enti = new Entidades(id, nome, null);
			list.add(enti);
			
		}
		
		System.out.println("Qual a Porcentagem que Deseja Aumentar?");
		
	sc.close();	
	}

}
