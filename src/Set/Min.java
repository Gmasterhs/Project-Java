package Set;

import java.util.*;

public class Min
{
    public static void main(String[] args)
    {
        Set <String> set1 = new HashSet<>(); //Mais Rapido, não ordenado
        Set <String> set2 = new TreeSet<>(); //Main lento, ordenado pelo
        Set <String> set3 = new LinkedHashSet<>(); // Velocidade Intermediaria, na ordem que sã oadicionados

        set1.add("a");
        set2.add("b");
        set3.add("c");

        System.out.println(set1.contains("a"));

        for (String p : set1)
        {
            System.out.println(p);
        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //União

        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Interseção

        Set<Integer> d = new TreeSet<>(a);
        d.removeAll(b);
        System.out.println(d);

        //Diferente

        Set<Integer> e = new TreeSet<>(a);
        e.retainAll(b);
        System.out.println(e);

    }

}
