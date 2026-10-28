package Exercicio_Set_HashCode;

import Exercicio_Set_HashCode.Entities.Log;

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
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Document path");
            String path = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(path)))
            {
                Set<Log> set =  new HashSet<Log>();

                String line = br.readLine();
                while (line != null)
                {
                    String[] data = line.split(" ");

                    String username = data[0];
                    Instant id = Instant.parse(data[1]);

                    set.add(new Log(username,id));

                    line = br.readLine();
                }
                System.out.println("Total Users: " + set.size());

            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
