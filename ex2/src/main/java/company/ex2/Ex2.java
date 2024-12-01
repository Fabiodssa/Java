package company.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s=0;
        System.out.println("Quantos valores deseja somar?");
        int x=sc.nextInt();
        
        for (int i=0; i<x; i++){
            System.out.println("Digite um numero: ");
            double n=sc.nextDouble();
            s+=n;
        }
        System.out.println("SOMA: "+s);
    }
}
