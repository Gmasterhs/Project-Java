package Exercicio_Set01;

import Exercicio_Set01.Entities.VehicleLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Caminho do Doc: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho)))
        {
            Set<VehicleLog> set = new HashSet<VehicleLog>();

            String linha = br.readLine();
            while (linha != null)
            {
                String[] list = linha.split(" ");

                String placa = list[0];
                Instant momento = Instant.parse(list[1]);
                set.add(new VehicleLog(placa, momento));
                linha = br.readLine();
            }
            System.out.println(set.size());
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
