package exercicio_Contribuinte;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Taxpayer " + "#" + (i  + 1) + " data:");
            System.out.println("Individual or company(i/c)?");
            char esc = sc.next().charAt(0);
            System.out.println("Name:");
            String name = sc.nextLine();
            sc.next();
            System.out.println("Anual income: ");
            double anualIncome = sc.nextDouble();
            System.out.println("Health expenditures: ");
            double healthExpenditures = sc.nextDouble();

        }

    }
}
