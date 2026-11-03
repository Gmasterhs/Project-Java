package Exercicio_Map01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Peth to the Archive: ");
       String peth = sc.nextLine();

       Map<String, Integer> map = new HashMap<>();

       try (BufferedReader br = new BufferedReader(new FileReader(peth)))
       {
           String ler = br.readLine();
           while (ler!=null)
           {
               String[] list = ler.split(",");
               String name = list[0];
               int votos = Integer.parseInt(list[1]);
               if (map.containsKey(name))
               {
                   map.put(name, map.get(name) + votos);
               }
               else
               {
                   map.put(name, votos);
               }
               ler = br.readLine();
           }
           System.out.println("Total de Votos: " +  map.size());
           for (String kay : map.keySet())
           {
               System.out.println(kay + ": " + map.get(kay));
           }
       }
       catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       sc.close();
   }
}
