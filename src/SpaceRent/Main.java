package SpaceRent;

import SpaceRent.entities.DailyRent;
import SpaceRent.entities.LongTermRent;
import SpaceRent.entities.RentContract;
import SpaceRent.entities.enums.ContractStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        List <RentContract> list = new ArrayList<>();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the number of contracts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Contract #" + (i + 1) + "data:");
            System.out.println("Long term or Daily rent (l/d)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Start date and time (dd/MM/yyyy): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
            System.out.println("Contract Status (STANDARD/PREMIUM): ");
            ContractStatus status = ContractStatus.valueOf(sc.next().trim().toUpperCase());

            if (op == 'l')
            {
                System.out.println("End date (dd/MM/yyyy): ");
                LocalDate endDate = LocalDate.parse(sc.next(),fmt);

                LongTermRent longTermRent = new LongTermRent(name,contractDate , status,endDate);
                list.add(longTermRent);

            } else if (op == 'd')
            {
                System.out.println("Days count: ");
                double daysCount = sc.nextInt();
                DailyRent dailyRent = new DailyRent(name,contractDate , status,daysCount);
                list.add(dailyRent);
            }

        }

        System.out.println("RENTAL REPORT:");
        System.out.println();
        for (RentContract x : list)
        {
            System.out.println("Name: " + x.getCliente() + "| Star: " + x.getStartDateTime() + "| Status: " + x.getStatus() + "| Total: " + String.format("%.2f", x.totalValue()));
        }

        sc.close();
    }
}
