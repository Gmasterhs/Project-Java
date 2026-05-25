package SpaceRent.entities;

import SpaceRent.entities.enums.ContractStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LongTermRent extends RentContract
{
    private LocalDate endDate;

    //Gettsrs and Setters

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    //Constructor

    public LongTermRent(String cliente, LocalDateTime startDateTime, ContractStatus status, LocalDate endDate)
    {
        super(cliente, startDateTime, status);
        this.endDate = endDate;
    }

    // Methods

    @Override
    public Double totalValue()
    {
        double totalDays = ChronoUnit.DAYS.between(getStartDateTime(), endDate) + 1;
        return totalDays * 50.00;
    }
}
