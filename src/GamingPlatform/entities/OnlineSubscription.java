package GamingPlatform.entities;

import GamingPlatform.entities.enums.SubscriptionStatus;

import java.time.LocalDateTime;

public abstract class OnlineSubscription
{
    private String userName;
    private LocalDateTime activationDateTime;
    private SubscriptionStatus Status;

    //Gettsrs and Setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getActivationDateTime() {
        return activationDateTime;
    }

    public void setActivationDateTime(LocalDateTime activationDateTime) {
        this.activationDateTime = activationDateTime;
    }

    public SubscriptionStatus getStatus() {
        return Status;
    }

    public void setStatus(SubscriptionStatus status) {
        Status = status;
    }

    // Constructor

    public OnlineSubscription(String userName, LocalDateTime activationDateTime, SubscriptionStatus status) {
        this.userName = userName;
        this.activationDateTime = activationDateTime;
        Status = status;
    }

    //Methods

    public abstract Double totalCost();
}
