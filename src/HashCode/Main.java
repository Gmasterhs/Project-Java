package HashCode;

public class Main
{
    public static void main(String[] args)
    {
        Cliente c1 = new Cliente("maria", "maria@gmail.com");
        Cliente c2 = new Cliente("alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // Para Comparar 2 objetos pro igualdade pelo conteudo usa equales
        System.out.println(c1 == c2); // Para comparar por referencia de memoria usa o ==
    }
}
