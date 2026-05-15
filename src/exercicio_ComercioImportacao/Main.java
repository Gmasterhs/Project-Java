package exercicio_ComercioImportacao;

import exercicio_ComercioImportacao.entities.ImportedProduct;
import exercicio_ComercioImportacao.entities.Product;
import exercicio_ComercioImportacao.entities.UsedProduct;

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
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");

        List <Product> list = new ArrayList();

        System.out.println("Enter The Number of Product: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.println("Product # + " + i + " Data: ");
            System.out.println("Cammon, Used or Imported (c/u/i)");
            char esc = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if (esc == 'u')
            {
                System.out.println("Manufacture Date (dd/MM/yyy)");
                String date = sc.next();
                LocalDate dateFormater = LocalDate.parse(date, fmt);

                Product product = new UsedProduct(name,price,dateFormater);

                list.add(product);

            } else if (esc == 'i')
            {
                System.out.println("Customs Fee: ");
                double customeFee = sc.nextDouble();

                Product product = new ImportedProduct(name,price,customeFee);

                list.add(product);

            }

            Product product = new Product(name,price);
            list.add(product);
        }

        for (Product prod : list)
        {
            System.out.println(prod.priceTag());
        }




    }
}
