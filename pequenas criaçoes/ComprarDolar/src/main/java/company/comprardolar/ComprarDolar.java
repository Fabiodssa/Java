

package company.comprardolar;

import company.comprardolar.Conversor;
import java.util.Scanner;

public class ComprarDolar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quanto custa o dolar? ");
        double dolar=sc.nextDouble();
        System.out.println("Qauntos dolares deseja comprar? ");
        double quantidade=sc.nextDouble();
        double custo=Conversor.custo(dolar, quantidade);
        System.out.println("Custara em reais: "+String.format("%.2f%n",custo));
        
    }
}
