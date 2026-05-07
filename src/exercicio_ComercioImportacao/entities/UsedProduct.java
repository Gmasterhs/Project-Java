package exercicio_ComercioImportacao.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product
{
    private LocalDate manufactureDate;

    //Constructor

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //Gettsrs and Setters

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //Metods


    @Override
    public String priceTag() {
        return super.priceTag()
                + "Date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
