package RentSystem.application;

import GamingPlatform.entities.enums.SubscriptionStatus;
import RentSystem.application.model.entities.CarRental;
import RentSystem.application.model.entities.EquipmentRental;
import RentSystem.application.model.entities.Rental;
import RentSystem.application.model.enums.RentalType;
import RentSystem.application.model.excepitions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Rental rental = null;

        System.out.println("Enter rental data:");

            try {

                System.out.println("Contract ID: ");
                int id = sc.nextInt();
                System.out.println("Start Date (dd/MM/yyyy)");
                Date starDate = sdf.parse(sc.next());
                System.out.println("End Date (dd/MM/yyyy)");
                Date endDate = sdf.parse(sc.next());
                System.out.println("Price per day: ");
                double pricePerDay = sc.nextDouble();
                System.out.println("Type (CAR/EQUIPMENT) ");
                RentalType status = RentalType.valueOf(sc.next().trim().toUpperCase());


                if (status == RentalType.CAR)
                {
                    System.out.println("Insurance value: ");
                    double insure = sc.nextDouble();
                    rental = new CarRental(id, starDate, endDate, pricePerDay, status, insure);
                }
                if (status == RentalType.EQUIPMENT)
                {
                    System.out.println("Maintence fee Volue: ");
                    double maintenceFee = sc.nextDouble();

                    rental = new EquipmentRental(id, starDate, endDate, pricePerDay, status, maintenceFee);
                }

            }
            catch (ParseException e) {
                System.out.println("Format error: Invalid date format!" + e.getMessage());
            }
            catch (DomainException e)
            {
                System.out.println("Argument error: Invalid rental type or negative value!" + e.getMessage());
            }

        System.out.println(rental);







    }
}
