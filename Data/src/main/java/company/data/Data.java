package company.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Data {

    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate d1 = LocalDate.now();
        LocalDateTime dh1 = LocalDateTime.now();
        Instant dh2 = Instant.now();
        
        LocalDate d2 =LocalDate.parse("2024-12-15");
        LocalDateTime dh3 =LocalDateTime.parse("2024-12-15T01:30:58");
        Instant dh4 = Instant.parse("2024-12-15T01:30:58Z");
        Instant dh5 = Instant.parse("2024-12-15T01:30:58-03:00"); // 3 horas a mais q o horario local
        
        LocalDate dh6 = LocalDate.parse("20/12/2024",fmt1);
        
        LocalDate dh7 = LocalDate.of(2024, 12, 10);
        LocalDateTime dh8 = LocalDateTime.of(2024, 12, 10, 23, 40);
       
        System.out.println("A data: "+d1);
        System.out.println("A data e o horario (local): "+dh1); // horario local da maquina
        System.out.println("A data e o horario (global): "+dh2); // a data e hora global (londres)
        System.out.println("");
        System.out.println("A data: "+d2);  
        System.out.println("A data: "+dh3);
        System.out.println("A data: "+dh4);
        System.out.println("A data: "+dh5);
        System.out.println("");
        System.out.println("Data formatada: "+dh6);
        System.out.println("");
        System.out.println("Data recebita diretamente: "+dh7);
        System.out.println("Data recebita diretamente: "+dh8);
        System.out.println("");
        
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    LocalDate dd1 = LocalDate.parse("2024-12-18");
    LocalDateTime dd2 =LocalDateTime.parse("2024-12-15T01:30:58");
    
        System.out.println("data: "+dd1.format(fm1));
        System.out.println("Data e hora: "+fm1.format(dd2));
    }
}
