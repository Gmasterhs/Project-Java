package TipoGenerico;

import java.util.Scanner;

public class Main
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        PrintService <Integer> ps = new PrintService<Integer>(); //Posso colcoar qualquer tip ode variavel pois a Classe PrintService é do tipo T

        System.out.println("Digite um numero: ");
        int n =  sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            int valor = sc.nextInt();
            ps.addVolue(valor);
        }

        ps.print();
        System.out.println("Primeiro: " + ps.first());

        sc.close();


    }
}
