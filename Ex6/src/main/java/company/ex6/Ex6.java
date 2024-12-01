package company.ex6;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double n1=sc.nextInt();
        System.out.println("Digite outro numero: ");
        double n2=sc.nextInt();
        
        double m = soma(n1,n2);
        mostrar(m);
        
    }
    public static double soma(double a, double b) {
        double s;
        s=a+b;
        return s;
    }
    
    public static void mostrar(double ca){
        System.out.println("a soma dos dois valores é: "+ca);
    }
            
}
