package company.metodo;
import java.util.Scanner;
public class Metodo { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Scanner sc=new Scanner(System.in);
        System.out.println("DIGITE DOS VALORES: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sm=soma(a, b);
        System.out.println("A SOMA É: "+sm);
        

    }
    static int soma(int a, int b){ 
        int s=a+b;
       // System.out.println(s);
       return s;
    }
}
