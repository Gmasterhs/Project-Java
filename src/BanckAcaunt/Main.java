package BanckAcaunt;

import BanckAcaunt.Entities.Account;
import BanckAcaunt.Exceptions.DomainException;

import java.util.InputMismatchException;
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
           sc.nextLine();
           System.out.println("Holder: ");
           String holder = sc.nextLine();
           System.out.println("Initial Balance");
           double balance = sc.nextDouble();
           System.out.println("Whitdrow Limit: ");
           double whitdrowLimit = sc.nextDouble();

           Account acount = new Account(number, holder, balance, whitdrowLimit);

           System.out.println("Enter amount for withdraw: ");
           double witchdrow = sc.nextDouble();
           acount.Withdraw(witchdrow);

           System.out.println("Witchdrow: ");
           System.out.println("Number: " + acount.getNumber());
           System.out.println("Holder: " + acount.getHolder());
           System.out.printf("New balance: %.2f%n", acount.getBalance());

       }
       catch (IllegalArgumentException e)
       {
           System.out.println("Argument error: " + e.getMessage());
       }
       catch (DomainException e)
       {
           System.out.println("Withdraw error: " + e.getMessage());
       }
       catch (InputMismatchException e)
       {
           System.out.println("Ilegal imput " + e.getMessage());
       }



   }
}
