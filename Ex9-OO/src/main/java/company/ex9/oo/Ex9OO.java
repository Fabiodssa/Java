

package company.ex9.oo;

import java.util.Scanner;
import company.ex9.oo.Triagu;

public class Ex9OO {

     public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Triagu x,y;
        x = new Triagu();
        y = new Triagu();
        System.out.println("Digite os lados do triangulo X: ");
        x.a=sc.nextDouble();
        x.b=sc.nextDouble();
        x.c=sc.nextDouble();
        System.out.println("Digite os lados do triangulo Y: ");
        y.a=sc.nextDouble();
        y.b=sc.nextDouble();
        y.c=sc.nextDouble();
        
        double areax=x.area();
        double areay=y.area();
        
        System.out.println("A area do triangulo x: "+areax);
        System.out.println("A area do triangulo y: "+areay);
        
        if (areax>areay){
            System.out.println("A area do triangulo X é maior: ");
        }else{
            System.out.println("A area do triangulo y é maior: ");
        }
    }
}