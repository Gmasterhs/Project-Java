package BanckAcaunt;

import BanckAcaunt.Entities.Account;
import BanckAcaunt.Exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);


       try
       {
           System.out.println("Enter Account Data:");

           System.out.println("Number: ");
           int number = sc.nextInt();
           System.out.println("Holder: ");
           String holder = sc.nextLine();
           System.out.println("Initial Balance");
           double balance = sc.nextDouble();
           System.out.println("Whitdrow: ");
           double whitdrow = sc.nextDouble();

           Account acount = new Account(number, holder, balance, whitdrow);
       }
       catch (IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
       catch (DomainException e)
       {
           System.out.println(e.getMessage());
       }

   }
}
