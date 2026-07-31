package SistemaLocacaoVeiculo;

import SistemaLocacaoVeiculo.Entities.Enums.StatusLocacao;
import SistemaLocacaoVeiculo.Entities.LocacaoVeiculo;
import SistemaLocacaoVeiculo.Entities.ServicoLocacao;
import SistemaLocacaoVeiculo.Entities.Veiculo;
import SistemaLocacaoVeiculo.Service.ServicoImpostoBrasil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try
        {
            System.out.print("Entre Com os Dados da Locação");
            System.out.print("Modelo do Carro: ");
            String modelo = sc.nextLine();
            System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
            LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(),fmt);
            System.out.println("Devolução (dd/MM/yyyy HH:mm): ");
            LocalDateTime fim = LocalDateTime.parse(sc.nextLine(),fmt);
            System.out.println("Preco por Hora: ");
            System.out.println("Status: ATIVO ou FINALIZADO");
            StatusLocacao status = StatusLocacao.valueOf(sc.nextLine().trim().toUpperCase());

            LocacaoVeiculo locacaoVeiculo = new LocacaoVeiculo(inicio,fim,new Veiculo(modelo),status);

            System.out.println("Valor Por Hora: ");
            double valorHora = sc.nextDouble();
            System.out.println("Valor por Dia:");
            double valorDia = sc.nextDouble();

            ServicoLocacao servicolLocacao = new ServicoLocacao(valorHora, valorDia, new ServicoImpostoBrasil());
            servicolLocacao.processarFatura(locacaoVeiculo);

            System.out.println("--Resultado--");
            System.out.println(locacaoVeiculo);
        } catch (NumberFormatException e)
        {
            System.out.println("Formato do Numero Ilegal" + e.getMessage());
        } catch (IllegalArgumentException e)
        {
            System.out.println("Argumento Ilegal" + e.getMessage());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Erro de Imput: " + e.getMessage());
        }
        catch (DateTimeParseException e)
        {
            System.out.println("Erro no Formato da Data: " + e.getMessage());
        }
        finally {
            sc.close();
        }

    }
}
