package exercicio_File;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Caminho");
        String caminho = sc.nextLine();

        File file = new File(caminho);

        String pastaPai = file.getParent(); //obtem o caminho despresando o nome do arquivo
        String novoCaminho = pastaPai + "\\out";

        File novaPasta = new File(novoCaminho);
        novaPasta.mkdir(); // cria novo diretorio

        String arquivoFinal = novoCaminho + "\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho)) ;
             BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoFinal)))
        {
            String line = br.readLine(); // ler a proxima linha e se não achar nada retorna null

            while (line != null)
            {
                System.out.println(line);
                String [] campo = line.split(","); //usa um marcador para recortar uma String

                String nome = campo[0];
                double preco = Double.parseDouble(campo[1]);
                int quantidade = Integer.parseInt(campo[2]);

                double total = preco * quantidade;

                bw.write(nome + "," + String.format("%.2f",total));
                bw.newLine();

                line = br.readLine();
            }

            System.out.println("Salvo com Sucesso");



        }
        catch (FileNotFoundException e) {
            System.out.println("Error " + e.getMessage() );
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage() );
        }


    }
}
