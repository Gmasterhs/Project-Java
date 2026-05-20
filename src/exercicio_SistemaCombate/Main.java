package exercicio_SistemaCombate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Character> list = new ArrayList<>();

        System.out.println("Enter the number of characters: ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {

            System.out.println("Character # " +  (i + 1) + " data: ");
            System.out.println("Melee or Mystic (m/y)?");
            char op = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();


            if (op == 'm') {
                System.out.println("Weapon Bonus:");
            }

        }

    }
}
