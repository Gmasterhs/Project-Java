package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main
{
    public static void main(String[] args)
    {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        double min = 100.0;

        //list.removeIf(product -> product.getPrice() >= 100.00); pode resolver assim ou no modelo abaixo
        //list.removeIf(new ProductPredicate());

        Predicate<Product> pred = p -> p.getPrice() >= min; //Aqui podese aceitar valro parametrizado ou digitado pelo usuario
        list.removeIf(pred);

        for (Product p : list)
        {
            System.out.println(p);
        }
    }
}
