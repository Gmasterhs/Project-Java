package Exercicio_ProgFuncional;

import Exercicio_ProgFuncional.Entidades.Funcionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Caminho do arquivo");
        String arquivo = sc.nextLine();
        System.out.println("Salario do Filtro");
        double filtro = sc.nextDouble();

        List <Funcionario> list = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(arquivo)))
        {
            String ler = br.readLine();
            while (ler != null)
            {
                String[] linha = ler.split(",");
                String nome = linha[0];
                String email = linha[1];
                double salario = Double.parseDouble(linha[2]);

                Funcionario funcionario = new Funcionario(nome, email, salario);
                list.add(funcionario);
                ler = br.readLine();
            }
            //Corpo do Codigo

            List<Funcionario> salarioFiltrado =  list.stream()
                    .filter(p -> p.getSalario() > filtro)
                    .toList();  //Filtro do valor informado pelo usuario

            List<String> salarioEmailFiltrado = salarioFiltrado.stream()
                    .map(p-> p.getEmail())
                    .sorted()
                    .toList();

            salarioEmailFiltrado.forEach(System.out::println);

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
