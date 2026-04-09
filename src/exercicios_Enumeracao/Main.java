package exercicios_Enumeracao;

import exercicios_Enumeracao.Entities.Enum.OrderStatus;
import exercicios_Enumeracao.Entities.Order;

import java.time.Instant;

public class Main
{
    public static void main(String[] args)
    {

        Order order = new Order(1080, Instant.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

    }
}
