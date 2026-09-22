package TipoGenerico;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>
    //T sendo um tipo generico
{
   private List <T> list = new ArrayList<T>();

   public void addVolue(T obj)
    {
        list.add(obj);
    }
    public Object first()
    {
        if (list.isEmpty()) //Verifica se esta vazia
        {
            throw new IllegalStateException("Lista vazia");
        }
        return list.get(0);
    }
    public void print()
    {
        System.out.println("[");
        if(!list.isEmpty())
        {
            System.out.println(list.get(0));
        }
        for (int i = 1; i < list.size(); i++)
        {
            System.out.println(","+list.get(i));
        }
        System.out.println("]");
    }


}
