package SistemaLocacaoVeiculo;

import SistemaLocacaoVeiculo.Entities.Enums.StatusLocacao;
import SistemaLocacaoVeiculo.Entities.LocacaoVeiculo;
import SistemaLocacaoVeiculo.Entities.ServicoLocacao;
import SistemaLocacaoVeiculo.Entities.Veiculo;
import SistemaLocacaoVeiculo.Service.ServicoImpostoBrasil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("(dd/MM/yyyy HH:mm)");

        System.out.print("Entre Com os Dados da Locação");
        System.out.print("Modelo do Carro: ");
        String modelo = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(sc.next(),fmt);
        System.out.println("Devolução (dd/MM/yyyy HH:mm): ");
        LocalDateTime fim = LocalDateTime.parse(sc.next(),fmt);
        System.out.println("Preco por Hora: ");
        System.out.println("Status: ATIVO ou FINALIZADO");
        StatusLocacao status = StatusLocacao.valueOf(sc.next().trim().toUpperCase());

        LocacaoVeiculo locacaoVeiculo = new LocacaoVeiculo(inicio,fim,new Veiculo(modelo),status);

        System.out.println("Valor Por Hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Valor por Dia:");
        double valorDia = sc.nextDouble();

        ServicoLocacao servicoLocacao = new ServicoLocacao(valorHora, valorDia, new ServicoImpostoBrasil());

        System.out.println(LocacaoVeiculo);

    }
}
