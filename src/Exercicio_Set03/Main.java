package Exercicio_Set03;

import Exercicio_Set03.Entities.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Caminho do Arquivo: ");
        String arquivo = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(arquivo)))
        {
            Set<Log> set = new HashSet<Log>();

            String linha = br.readLine();
            while (linha != null)
            {
                String[] list = linha.split(" ");
                String id = list[0];
                String codigo = list[1];
                Instant data = Instant.parse(list[2]);

                set.add(new Log(id, codigo, data));
                linha = br.readLine();
            }
            System.out.println(set.size());
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
