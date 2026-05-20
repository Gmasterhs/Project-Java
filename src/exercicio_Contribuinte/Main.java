package exercicio_Contribuinte;

import exercicio_Contribuinte.entities.Company;
import exercicio_Contribuinte.entities.Individual;
import exercicio_Contribuinte.entities.TaxPayment;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List <TaxPayment> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Taxpayer " + "#" + (i  + 1) + " data:");
            System.out.println("Individual or company(i/c)?");
            char esc = sc.next().charAt(0);
            sc.nextLine();

            if (esc == 'i')
            {
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);

            } else if (esc == 'c')
            {
                System.out.println("Name:");
                String name = sc.nextLine();
                System.out.println("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Numberofemployees: ");
                int namberEmplyees = sc.nextInt();
                Company company = new Company(name, anualIncome,namberEmplyees);
                list.add(company);
            }
        }
        double totalTax = 0.0;

        System.out.print("----------");
        System.out.println("TAXES PAIND: ");

        for (TaxPayment x : list)
        {
            System.out.println(x.getName() + " $ "+ String.format("%.2f", x.tax()));
             totalTax += x.tax();
        }

        System.out.println("TOTAL TAX: " + String.format("%.2f" , totalTax));

        sc.close();

    }
}
