
package company.comprardolar;

public class Conversor {
    public static double custo(double dolar, double quantidade){
        return (dolar*quantidade)+((dolar*quantidade)*0.06);
    }
}
