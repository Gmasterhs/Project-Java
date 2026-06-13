package RentSystem.application.model.entities;

import RentSystem.application.model.enums.RentalType;

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

    public abstract long durationInDays();

    public abstract Double totalVolue();

    public String toString()
    {

    }

}
