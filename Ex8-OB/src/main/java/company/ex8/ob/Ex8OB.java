
package company.ex8.ob;

import java.util.Scanner;
import company.ex8.ob.Triangulo;

public class Ex8OB {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Digite os lados do triangulo X: ");
        x.a=sc.nextDouble();
        x.b=sc.nextDouble();
        x.c=sc.nextDouble();
        System.out.println("Digite os lados do triangulo Y: ");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble();
        
        double p=(x.a+x.b+x.c)/2;
        double areax=Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
        
        p=(y.a+y.b+y.c)/2;
        double areay=Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
        
        System.out.println("A area do triangulo x: "+areax);
        System.out.println("A area do triangulo y: "+areay);
        
        if (areax>areay){
            System.out.println("A area do triangulo X é maior: ");
        }else{
            System.out.println("A area do triangulo y é maior: ");
        }
    }
}