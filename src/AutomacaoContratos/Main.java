package AutomacaoContratos;

import AutomacaoContratos.Entities.Contract;
import AutomacaoContratos.Entities.Installments;
import AutomacaoContratos.Services.ContractService;
import AutomacaoContratos.Services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");



            System.out.print("Entre os dados do contrato: ");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.println("Data (dd/MM/yyyy):");
            LocalDate date = LocalDate.parse(sc.next(),fmt);
            System.out.println("Valor do Contrato");
            double valorContrato = sc.nextDouble();
            Contract contract = new Contract(numero,date,valorContrato);
            System.out.println("Parcelas");
            int parcelas = sc.nextInt();
            ContractService contractService = new ContractService(new PaypalService());
            contractService.processContract(contract, parcelas);


        for (Installments parcela : contract.getParcelas())
        {
            System.out.println(parcela);
        }
        }




}
