package SpaceRent.entities;

import SpaceRent.entities.enums.ContractStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class RentContract
{
    private String cliente;
    private LocalDate startDateTime;

    private ContractStatus status;


    // Getters and Setters

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDate startDateTime) {
        this.startDateTime = startDateTime;
    }

    public ContractStatus getStatus() {
        return status;
    }

    public void setStatus(ContractStatus status) {
        this.status = status;
    }

    // Constructor

    public RentContract(String cliente, LocalDate startDateTime, ContractStatus status) {
        this.cliente = cliente;
        this.startDateTime = startDateTime;
        this.status = status;
    }

    //Methods

    public abstract Double totalValue();


}
