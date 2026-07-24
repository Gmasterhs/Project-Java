package AutomacaoContratos.Services;

import AutomacaoContratos.Entities.Contract;
import AutomacaoContratos.Entities.Installments;

import java.time.LocalDate;

public class ContractService
{
    private OnlinePaymentService onlinePaymentService;

    //Construtor


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer momths) //(Vai receber o objet Contract junto dos meses direto do Main)
    {
        double valorBase = contract.getTotalvolue() / momths;

        for (int i = 1; i <= momths; i++)
        {
           double valorjurus = onlinePaymentService.jurus(valorBase, i);
           double valorTaxa = onlinePaymentService.paymentFee(valorBase + valorjurus);
           double valorFinal = valorBase + valorjurus + valorTaxa;

            LocalDate vencimento = contract.getDate().plusMonths(i);
            contract.getParcelas().add(new Installments(vencimento, valorFinal));


        }
    }
}
