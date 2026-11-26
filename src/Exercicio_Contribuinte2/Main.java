package Exercicio_Contribuinte2;

import Exercicio_Contribuinte2.Entidades.Contrinuinte;
import Exercicio_Contribuinte2.Entidades.PessoaFisica;
import Exercicio_Contribuinte2.Entidades.PessoaJuridica;

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

            String linha = br.readLine();
            while (linha != null)
            {
                String[] listinha  = linha.split(",");
                char tipodaPessoa = listinha[0].charAt(0);
                String nomePessoa = listinha[1];
                double rendaAnual  = Double.parseDouble(listinha[2]);
                double gastoOufuncionario  = Double.parseDouble(listinha[3]);
                if (tipodaPessoa == 'F')
                {
                    PessoaFisica pf = new PessoaFisica(nomePessoa, rendaAnual,tipodaPessoa, gastoOufuncionario);
                    lista.add(pf);
                }
                if (tipodaPessoa == 'J')
                {
                    PessoaJuridica pj = new PessoaJuridica(nomePessoa, rendaAnual,gastoOufuncionario, tipodaPessoa);
                    lista.add(pj);
                }
                linha = br.readLine();
            }

            lista.stream().sorted(Contrinuinte::comperTo).forEach(System.out::println);


            sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
