package ExemploDEGenericos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {

    }
    {
        List<Integer> list = new ArrayList<>();

        String patch = "D:\\Docs\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(patch)))
        {
            String line = br.readLine();
            while (line != null)
            {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }

            Integer x = CalculateService.max(list);
            System.out.println("Max");
            System.out.println(x);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
