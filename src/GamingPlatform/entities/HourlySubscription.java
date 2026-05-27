package GamingPlatform.entities;

import GamingPlatform.entities.enums.SubscriptionStatus;

import java.time.LocalDateTime;

public class HourlySubscription extends OnlineSubscription
{
    private Integer hourContract;

    //Gettsrs and Setters

    public Integer getHourContract() {
        return hourContract;
    }

    public void setHourContract(Integer hourContract) {
        this.hourContract = hourContract;
    }

    //Constructor

    public HourlySubscription(String userName, LocalDateTime activationDateTime, SubscriptionStatus status, Integer hourContract) {
        super(userName, activationDateTime, status);
        this.hourContract = hourContract;
    }

    //Methods

    @Override
    public Double totalCost()
    {
        if (getStatus() == SubscriptionStatus.SUSPEND)
        {
            return (hourContract * 1.50) * 1.20;
        } else {
            return hourContract * 1.50;
        }

    }



}
