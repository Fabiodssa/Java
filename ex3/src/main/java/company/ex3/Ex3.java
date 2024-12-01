package company.ex3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Digite ate quanto deseja contar: ");
        int x=sc.nextInt();
        do{
            i++;
            System.out.println("contando: "+i);
            
        } while(i<x);
    }
}
// no DO - WHILE o codigo é executado pelo menos uma vez