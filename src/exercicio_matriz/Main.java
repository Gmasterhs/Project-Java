package exercicio_matriz;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Linha");
        int l = sc.nextInt();

        System.out.println("Digite a Coluna");
        int c = sc.nextInt();

        int [][] mat = new int[l][c];

        for (int i = 0; i<l;i++)
        {
            for (int j = 0; j<c;j++)
            {
                System.out.println("Digite o Valor Para Dentro da Matriz");
               mat[i][j] =  sc.nextInt();
            }
        }

        System.out.println("Digite o número X a ser procurado:");
        int x = sc.nextInt();

        for (int i = 0; i < l; i++)
        { // i < l
            for (int j = 0; j < c; j++)
            { // j < c
                if (mat[i][j] == x)
                {
                    System.out.println("Position " + i + "," + j + ":");

                    if (j > 0) System.out.println("Left: " + mat[i][j-1]);

                    if (j < c - 1) { // mude l-1 para c-1 (limite de colunas)
                        System.out.println("Right: " + mat[i][j+1]);
                    }

                    if (i > 0) System.out.println("Up: " + mat[i-1][j]);

                    if (i < l - 1) { // mude c-1 para l-1 (limite de linhas)
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }



    }
}
