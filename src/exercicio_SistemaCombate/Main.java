package exercicio_SistemaCombate;

import exercicio_SistemaCombate.entities.Caracter;
import exercicio_SistemaCombate.entities.Melee;
import exercicio_SistemaCombate.entities.Mystic;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Caracter> list = new ArrayList<>();

        System.out.println("Enter the number of characters: ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++)
        {
            System.out.println("Character # " + (i + 1) + " data: ");
            System.out.println("Melee or Mystic (m/y)?");
            char op = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Level: ");
            int level = sc.nextInt();
            System.out.println("Base Strength: ");
            double baseStrength = sc.nextDouble();

            if (op == 'm')
            {
                System.out.println("Weapon Bonus:");
                double weappon = sc.nextDouble();
                Melee melee = new Melee(name, level, baseStrength, weappon);
                list.add(melee);
            } else if (op == 'y') {
                System.out.println("Focus Bonus:");
                double focus = sc.nextDouble();
                Mystic mysic = new Mystic(name, level, baseStrength, focus);
                list.add(mysic);
            }

        }

        System.out.println("DAMAGE REPORT");

        for (Caracter x : list)
        {
            System.out.println( x.getName() + " : " + String.format("%.2f", x.calculateDamage()));
        }
        sc.close();

    }
}
