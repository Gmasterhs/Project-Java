package Exercicio_ProgFuncional02;

import Exercicio_ProgFuncional02.Entidades.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Programa
{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Caminho do Arquivo");
        String arquivo = sc.nextLine();

        System.out.println("Digite o Valor do Filtro");
        Double filtro = sc.nextDouble();

        List<Produto> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo)))
        {
            String ler;
            while ((ler = br.readLine()) != null)
            {

                String[] line = ler.split(",");
                lista.add(new Produto(line[0], Double.parseDouble(line[1])));

                List<Produto> newLista = lista.stream().filter(p-> p.getPreco() < filtro).toList();

                List<String> ultimateLista = newLista.stream().map(p -> p.getNome()).sorted().toList();
                ultimateLista.forEach(System.out::println);
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
