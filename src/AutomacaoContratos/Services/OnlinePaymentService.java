package AutomacaoContratos.Services;

public interface OnlinePaymentService
{
    Double paymentFee (Double amount);
    Double jurus (Double amount, Integer months);
}
