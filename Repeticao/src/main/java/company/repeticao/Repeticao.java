package company.repeticao;
import java.util.Scanner;
public class Repeticao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int soma=0;
        int  num;
        System.out.println("DIGITE UM VALOR: ");
        int valor=sc.nextInt();
        int vezes=0;
        while(vezes<valor){
            vezes++;
            System.out.println(vezes);
        }
        System.out.println("repstiu "+vezes+" vezes");
    
        do{
            System.out.println("DIgite um valor: ");
            num=sc.nextInt();  
            soma=soma+num;
        } while(num!=-1);
        System.out.println("a soma é: "+(soma+1));
    
        for(int par=0; par!=soma; par+=2){
            System.out.println(par);
    }
    }
}
