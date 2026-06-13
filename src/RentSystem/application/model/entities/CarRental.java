package RentSystem.application.model.entities;

import RentSystem.application.model.enums.RentalType;

import java.util.Date;

public class CarRental extends Rental
{
    private Double insurance;

    //Constructor

    public CarRental(Integer id, Date starDate, Date endDate, Double priceperDay, RentalType rentalType, Double insurance) {
        super(id, starDate, endDate, priceperDay, rentalType);
        this.insurance = insurance;
    }

    //Getters and Setters

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    //Methods

    @Override
    public Double totalVolue() {
        return 0.0;
    }

    @Override
    public long durationInDays() {
        return 0;
    }
}
