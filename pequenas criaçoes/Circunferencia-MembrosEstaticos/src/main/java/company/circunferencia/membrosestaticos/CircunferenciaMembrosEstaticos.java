
package company.circunferencia.membrosestaticos;

import java.util.Scanner;

public class CircunferenciaMembrosEstaticos {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Informe o raio: "); 
        double radius = sc.nextDouble();

        double c = Cal.circumference (radius);
        double v = Cal.volume(radius);

        System.out.printf("Circunferenciae: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Cal.PI);

    }
}