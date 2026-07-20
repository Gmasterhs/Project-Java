package AutomacaoContratos.Services;

import AutomacaoContratos.Entities.Contract;

public class ContractService
{
    private OnlinePaymentService onlinePaymentService;

    public void processContract(Contract contract, Integer momths) //(Vai receber o objet Contract mas os meses direto do Main)
    {
        double basicVolue = contract.getTotalvolue() / momths;

        for (int i = 0; i < momths; i++)
        {
           double taxaDejurus = onlinePaymentService.jurus(basicVolue, i);

           double valorFinal = onlinePaymentService.paymentFee(basicVolue + taxaDejurus);


        }
    }
}
