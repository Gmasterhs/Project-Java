package Exercicio_Set02;

import Exercicio_Set_HashCode.Entities.Log;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.println("Quantos Alunos na Classe A");
        int classeA = sc.nextInt();
        for (int i = 0; i < classeA; i++)
        {
            System.out.println("Codigo do Aluno");
            A.add(sc.nextInt());
        }

        System.out.println("Quantos Alunos na Classe B");
        int classeB = sc.nextInt();
        for (int i = 0; i < classeB; i++)
        {
            System.out.println("Codigo do Aluno");
            B.add(sc.nextInt());
        }

        System.out.println("Quantos Alunos na Classe C");
        int classeC = sc.nextInt();
        for (int i = 0; i < classeC; i++)
        {
            System.out.println("Codigo do Aluno");
            C.add(sc.nextInt());
        }

        Set<Integer> D = new HashSet<>(A);
        D.addAll(B);
        D.addAll(C);

        System.out.println(D.size());
        sc.close();

    }
}
