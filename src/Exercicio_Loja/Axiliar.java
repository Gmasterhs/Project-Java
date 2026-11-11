package Exercicio_Loja;

import java.util.List;
import java.util.function.Predicate;

public class Axiliar
{
    public double GoTest (List<Product> list, Predicate<Product> p)
    {
        double som = 0.00;
        for (Product listProd : list)
        {
            if (p.test(listProd))
            {
                som += listProd.getValor();
            }
        }
        return som;
    }
}
