
package company.vet1;

import java.util.Scanner;

public class Vet1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        double p[] = new double[n];
        
        
        for(int i=0; i<n;i++){
             p[i]=sc.nextDouble();
        }
        double soma = 0;
        for(int i=0;i<n;i++){
            soma+=p[i];
        }
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+soma/n);
    }
}
