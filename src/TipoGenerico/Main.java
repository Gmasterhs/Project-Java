package TipoGenerico;

import java.util.Scanner;

public class Main
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();
        int n =  sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            int valor = sc.nextInt();
            ps.addVolue(valor);
        }

        ps.print();
        System.out.println("Primeiro: " + ps.first());


    }
}
