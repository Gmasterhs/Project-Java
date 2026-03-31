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
		sc.nextLine();
		
		for (int i=0; i<n;i++)
		{
			System.out.println("Digite o ID");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome");
			String nome = sc.nextLine();
			
			System.out.println("Salario");
			double salario = sc.nextDouble();
			
			Entidades enti = new Entidades(id, nome, salario);
			list.add(enti);
			
		}
		for (Entidades x: list)
		{
			System.out.println(x);
		}
		System.out.println("Deseja Fazer uma Operação de Aumento do salario?: ");
		System.out.println("Digite Yes ou No");
		sc.nextLine();
		String op = sc.nextLine();
		
		
		if (op.equalsIgnoreCase("Yes"))
		{
			System.out.println("Digite o ID");
			int idBusca = sc.nextInt();
		
		
		
		   Entidades comparacao = list.stream().filter(x -> x.getId() == idBusca).findFirst().orElse(null);
		   if (comparacao != null)
		   {
			 System.out.println("Digite e Procentagem de Aumento");
			 double aumento = sc.nextDouble();
			 comparacao.aumentoSalario(aumento);
			 System.out.println("Novo Valor: " + comparacao.getSalary());
		   }
		}
				
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Entidades obj : list) {
		    System.out.println(obj);
		}
		
		
	sc.close();	
	}

}
