package Exercicio_Loja;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args)
    {
        List<Product> list = new ArrayList<Product>();

        list.add(new Product("Papel", 90.0));
        list.add(new Product("Caneta", 100.0));
        list.add(new Product("Caderno", 200.0));
        list.add(new Product("Borracha", 300.0));
        list.add(new Product("Grampo", 400.0));

        Axiliar ax = new Axiliar();

        double som = ax.GoTest(list, (Product p) -> p.getValor() >= 100.0);
        System.out.println(som);
    }
}
