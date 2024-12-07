package company.cadastro;

import java.util.Scanner;
import company.cadastro.Dados;

public class Cadastro {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Quantas pessoas sao digitadas: ");
        int n=sc.nextInt();
        Dados []vet=new Dados[n];
        
        for(int i=0; i<n;i++){
            vet[i]=new Dados();
            System.out.println("Dados da "+(i+1)+"a Pessoa");
            System.out.print("Nome: ");
            sc.nextLine();
            vet[i].nome=sc.nextLine();
            System.out.print("Idade: ");
            vet[i].idade=sc.nextInt();
            System.out.print("Altura: ");
            vet[i].altura=sc.nextDouble();
        }
       
        double soma=0;
        for(int i=0; i<n; i++){
            soma+=vet[i].altura;
        }
         System.out.println("Media: "+soma/n);
         
        int menor16=0;
        for (int i = 0; i < n; i++) {
            if (vet[i].idade < 16) {
                menor16++;
            }
        }
        System.out.printf("Porecentagem de menores de 16 anor:%.2f%% "+menor16*100/n);
        
        for (int i = 0; i < n; i++) {
            if (vet[i].idade < 16) {
                System.out.println(vet[i].nome);
            }
        }
        
}
}
