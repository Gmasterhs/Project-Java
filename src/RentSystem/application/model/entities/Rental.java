package RentSystem.application.model.entities;

import RentSystem.application.model.enums.RentalType;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public abstract class Rental
{
   private Integer id;
   private Date starDate;
   private Date endDate;
   private Double priceperDay;
   private RentalType rentalType;

   //Constructor

    public Rental(Integer id, Date starDate, Date endDate, Double priceperDay, RentalType rentalType) {
        this.id = id;
        this.starDate = starDate;
        this.endDate = endDate;
        this.priceperDay = priceperDay;
        this.rentalType = rentalType;
    }

    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getPriceperDay() {
        return priceperDay;
    }

    public void setPriceperDay(Double priceperDay) {
        this.priceperDay = priceperDay;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    //Methods

    public  long durationInDays()
    {
        LocalDate initial = starDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fim = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return ChronoUnit.DAYS.between(initial,fim);
    }

    public abstract Double totalVolue();

    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("RECEIPT: ");
        sb.append("ID: ").append(getId());
        sb.append(", Type: ").append(getRentalType());
        sb.append(", Period:").append(getStarDate()).append(" to ").append(getEndDate()).append(" to ").append(durationInDays());
        sb.append("Total Value: ").append(" $").append(String.format("%.2f",totalVolue()));

        return sb.toString();
    }

}
