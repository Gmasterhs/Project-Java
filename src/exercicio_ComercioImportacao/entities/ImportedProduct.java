package exercicio_ComercioImportacao.entities;

public class ImportedProduct extends Product
{
    private Double customsFee;

    //Constructor


    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //  Gettsrs and Setters


    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    //Metods


    @Override
    public String priceTag() {
        return super.priceTag()
                + " Tax: "
                +String.format("%.2f", customsFee)
                + totalPrice();
    }

    public Double totalPrice()
    {
        return getPrice() - customsFee;
    }
}
