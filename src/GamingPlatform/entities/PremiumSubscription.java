package GamingPlatform.entities;

import GamingPlatform.entities.enums.SubscriptionStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PremiumSubscription extends OnlineSubscription
{
    private LocalDate expiryDate;

    //Getters and Setters


    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    //Constructor

    public PremiumSubscription(String userName, LocalDateTime activationDateTime, SubscriptionStatus status, LocalDate expiryDate) {
        super(userName, activationDateTime, status);
        this.expiryDate = expiryDate;
    }


    //Methods

    @Override
    public Double totalCost()
    {

        double counter = ChronoUnit.MONTHS.between(getActivationDateTime().toLocalDate(), expiryDate);

        double res = counter * 30.00;
        return res;
    }


}
