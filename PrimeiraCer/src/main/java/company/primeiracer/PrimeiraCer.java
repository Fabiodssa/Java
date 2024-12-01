package company.primeiracer;
import java.util.Scanner;
public class PrimeiraCer {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    
        System.out.println("Digite o dia da semana: ");
        int x=sc.nextInt();
        String dia;
        
        dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Qauarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "sabado";
            default -> "valor invalido";
        };
        System.out.println("O dia: "+dia);
        
        System.out.println("Digite e valor da compra: ");
        double v=sc.nextDouble();
        double d= (v>100)? v*0.2 : v*0.1;
        System.out.println("o valor final é "+(v-d));
    }
}