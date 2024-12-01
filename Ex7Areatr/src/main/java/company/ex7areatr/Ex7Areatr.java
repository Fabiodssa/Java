package company.ex7areatr;
import java.util.Scanner;
public class Ex7Areatr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite os valores do triangulo X: ");
        double xa=sc.nextDouble();
        double xb=sc.nextDouble();
        double xc=sc.nextDouble();
        System.out.println("Digte os valores do triangulo Y: ");
        double ya=sc.nextDouble();
        double yb=sc.nextDouble();
        double yc=sc.nextDouble();
        
        double p=(xa+xb+xc)/2;
        double areax=Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
        
        p=(ya+yb+yc)/2;
        double areay=Math.sqrt(p*(p-ya)*(p-yb)*(p-yc));
        
        System.out.println("A area do triangulo x: "+areax);
        System.out.println("A area do triangulo y: "+areay);
        
        if (areax>areay){
            System.out.println("A area do triangulo X é maior: ");
        }else{
            System.out.println("A area do triangulo y é maior: ");
        }
    }
}
