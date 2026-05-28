package GamingPlatform;

import GamingPlatform.entities.HourlySubscription;
import GamingPlatform.entities.OnlineSubscription;
import GamingPlatform.entities.PremiumSubscription;
import GamingPlatform.entities.enums.SubscriptionStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        List <OnlineSubscription> list = new ArrayList<>();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the number of subscriptions:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Subscription #" + (i + 1) + " data:");

            System.out.println("Premium or Hourly subscription (p/h)?");
            char op = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("User Name:");
            String name = sc.nextLine();

            System.out.println("Start date and time (dd/MM/yyyy HH:mm):");
            LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine(), fmt1);

            System.out.println("Subscription Status (ACTIVE/SUSPENDED): ");
            SubscriptionStatus status = SubscriptionStatus.valueOf(sc.next().trim().toUpperCase());
            sc.nextLine();

            if (op == 'p')
            {
                System.out.println("Expiry date (dd/MM/yyyy): ");
                LocalDate dateExpiry = LocalDate.parse(sc.next(), fmt2);
                sc.nextLine();

                PremiumSubscription premiumSub = new PremiumSubscription(name, dateTime,status,dateExpiry);
                list.add(premiumSub);

            } else if (op == 'h')
            {
                System.out.println("Hours count: ");
                int hoursContract = sc.nextInt();
                sc.nextLine();

                HourlySubscription hourlySub = new HourlySubscription(name, dateTime,status,hoursContract);
                list.add(hourlySub);
            }
        }

        System.out.println("SUBSCRIPTION REPORT: ");

        for (OnlineSubscription x : list)
        {
            System.out.println(x.getUserName() + " | " + " Activation: " + x.getActivationDateTime().format(fmt1) + " | " + x.getStatus() + "| " + "Total: " + x.totalCost());
        }
    }
}
