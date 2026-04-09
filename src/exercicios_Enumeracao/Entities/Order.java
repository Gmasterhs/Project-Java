package exercicios_Enumeracao.Entities;

import exercicios_Enumeracao.Entities.Enum.OrderStatus;

import java.time.Instant;

public class Order
{
    private Integer id;
    private Instant moment;
    private OrderStatus status;

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    //Constructors


    public Order(Integer id, Instant moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    // ToString


    @Override
    public String toString()
    {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
