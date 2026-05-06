package exercicio_Funcionario;

import exercicio_Funcionario.entities.Employee;
import exercicio_Funcionario.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();

        System.out.println("Enter the nuber of Employess: ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++)
        {
            System.out.println("Outsourced? (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

                System.out.println("Nome: ");
                String name = sc.nextLine();
                System.out.println("Hours");
                int hours = sc.nextInt();
                System.out.println("Volue per Hours: ");
                double volue = sc.nextDouble();
            if (ch == 'y')
            {
                System.out.println("Aditional Charge: ");
                double aditional = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(hours, name, volue, aditional);
                list.add(emp);
            }
             else if (ch == 'n')

            {
                Employee emp = new Employee(hours,name, volue);
                list.add(emp);
            }

        }
        System.out.println("Peyment: ");
        for (Employee emp: list)
        {
            System.out.println(emp.getName() + " $ " + String.format("%.2f", emp.payment())) ;
        }
    }
}
