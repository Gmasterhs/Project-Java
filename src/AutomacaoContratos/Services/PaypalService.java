package AutomacaoContratos.Services;

public class PaypalService implements OnlinePaymentService
{
    public Double paymentFee(Double amount) //Taxa de 2%
    {
        return amount * 0.02;
    }

    public Double jurus(Double amount, Integer months)
    {
            return amount * 0.01 * months;
    }
}
