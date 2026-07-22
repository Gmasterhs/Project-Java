package AutomacaoContratos.Services;

import AutomacaoContratos.Entities.Contract;
import AutomacaoContratos.Entities.Installments;

import java.time.LocalDate;

public class ContractService
{
    private OnlinePaymentService onlinePaymentService;

    public void processContract(Contract contract, Integer momths) //(Vai receber o objet Contract mas os meses direto do Main)
    {
        double valorBase = contract.getTotalvolue() / momths;

        for (int i = 1; i <= momths; i++)
        {
           double valorjurus = onlinePaymentService.jurus(valorBase, i);
           double valorTaxa = onlinePaymentService.paymentFee(valorBase + valorjurus);
           double valorFinal = valorBase + valorjurus + valorTaxa;

            LocalDate vencimento = contract.getDate().minusMonths(i);
            contract.getParcelas().add(new Installments(vencimento, valorFinal));


        }
    }
}
