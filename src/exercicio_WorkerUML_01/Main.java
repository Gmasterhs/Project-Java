package exercicio_WorkerUML_01;

import exercicio_WorkerUML_01.entities.Department;
import exercicio_WorkerUML_01.entities.HourContract;
import exercicio_WorkerUML_01.entities.Worker;
import exercicio_WorkerUML_01.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
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
        System.out.println("Enter worker data: ");
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

        for (int i = 1; i <= n; i++)
        {
            System.out.println("Enter Contract " + i + " Dara");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(),fmt);

            System.out.println("Volue Per Hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.println("Duration Contract per hours");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYY): ");
        String monthAndYear = sc.next();

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        YearMonth ym = YearMonth.parse(monthAndYear, fmt2);
        int month = ym.getMonthValue();
        int yeah = ym.getYear();

        System.out.println("Name> " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(yeah, month)));

        sc.close();
    }
}

