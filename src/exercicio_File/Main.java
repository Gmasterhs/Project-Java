package exercicio_File;

import java.io.File;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Caminho");
        String caminho = sc.nextLine();

        File file = new File(caminho);

        String pastaPai = file.getParent();

        String cnovoCaminho = pastaPai + "\\out";

    }
}
