package RentSystem.application.model.entities;

import RentSystem.application.model.enums.RentalType;
import RentSystem.application.model.excepitions.DomainException;

import java.util.Date;

public class EquipmentRental extends Rental {
    private Double maintenanceFee;

    //Constructor

    public EquipmentRental(Integer id, Date starDate, Date endDate, Double priceperDay, RentalType rentalType, Double maintenanceFee) {
        super(id, starDate, endDate, priceperDay, rentalType);
        this.maintenanceFee = maintenanceFee;
    }

    //Getters and Setters

    public Double getMaintenanceFee() {
        return maintenanceFee;
    }

    public void setMaintenanceFee(Double maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }

    //Methods


    @Override
    public Double totalVolue() throws DomainException
    {
        if (durationInDays() <0 || getPriceperDay() < 0 )
        {
            throw new DomainException ("Duration In Days and Price Per Dau Conot be Negative");
        }
        return  (durationInDays() * getPriceperDay()) + maintenanceFee;
    }
}