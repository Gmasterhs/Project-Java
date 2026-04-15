package exercicio_WorkerUML_01;

import exercicio_WorkerUML_01.entities.Department;
import exercicio_WorkerUML_01.entities.Worker;
import exercicio_WorkerUML_01.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Department Name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double workerSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

        System.out.println("Enter Contract to theis worker");
        int n = sc.nextInt();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i <= n; i++)
        {
            System.out.println("Enter Contract" + i + "Dara");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(),fmt);

            System.out.println("Volue Per Hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.println("Duration Contract per hours");
            int duratinPerHours =

        }

    }
}

