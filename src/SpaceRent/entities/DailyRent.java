package SpaceRent.entities;

import SpaceRent.entities.enums.ContractStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyRent extends RentContract
{
    private Double daysCount;

    // Gettsrs and Setters

    public Double getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(Double daysCount) {
        this.daysCount = daysCount;
    }


    // Constructor

    public DailyRent(String cliente, LocalDate startDateTime, ContractStatus status, Double daysCount) {
        super(cliente, startDateTime, status);
        this.daysCount = daysCount;
    }

    //Methods

    @Override
    public Double totalValue()
    {
        double voluebase = daysCount * 70;

        if (getStatus() == ContractStatus.PREMIUM)
        {
            return voluebase * 0.90;
        }
        return voluebase;
    }
}
