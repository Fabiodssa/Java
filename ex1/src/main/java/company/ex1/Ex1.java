package company.ex1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=1;
        double s=0;
        while(x != 0){
            System.out.println("Digite um numero: ");
            double nn=sc.nextDouble();
            s+=nn;
            System.out.println("Quer continuar? (1)sim e (0)nao");
            x=sc.nextInt();
        }
        System.out.println("Soma: "+s);
    }
}
