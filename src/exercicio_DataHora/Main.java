package exercicio_DataHora;

import javax.swing.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String[] args)
    {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Considera o Fuso Horario do Sistema Local, como o Instant não tem o metodo .format devemso chamar apartir do fmt2
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d05 = LocalDate.parse("20/07/2026", fmt1);


        System.out.println("Data Local do Meu Sistema: " + d01);
        System.out.println("Hora do Meu Sistema: " + d02);
        System.out.println("Data GMT: " + d03);
        System.out.println("Data Personalizada no formato 8601: " + d04);
        System.out.println(d05);
        System.out.println(d05.format(fmt1));
        System.out.println(fmt2.format(d03));
    }
}
