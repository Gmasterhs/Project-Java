package Exercicio_Contribuinte2;

import Exercicio_Contribuinte2.Entidades.Contrinuinte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digfite o Caminho do Arquivo: ");
        String arquivo = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo)))
        {
            List<Contrinuinte> lista = new ArrayList<>();

            while (br.readLine() != null)
            {
                String[] linha = br.readLine().split(",");

            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
