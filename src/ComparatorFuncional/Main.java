package ComparatorFuncional;

import ComparatorFuncional.Entities.MyComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = (Product p1, Product p2) -> p1.getPrice().compareTo(p2.getPrice());

        list.sort(comp); //Forma Funcional
        list.sort(new MyComparator()); //Forma não Funcional

        for (Product p : list)
        {
            System.out.println(p);
        }

    }
}
