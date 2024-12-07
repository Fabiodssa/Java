
package company.vet2;

import java.util.Scanner;
import company.vet2.Produtos;

public class Vet2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos produtos: ");
        int n=sc.nextInt();
        Produtos []vet=new Produtos[n];
        
        
        for (int i = 0; i < n; i++) {
            vet[i] = new Produtos();
            sc.nextLine();
            System.out.println("");
            System.out.println("Digite o nome do produto: ");
            vet[i].nome = sc.nextLine();
            System.out.println("Du«igite o preco do produto: ");
            vet[i].preco = sc.nextDouble();
            System.out.println("Produto: " + vet[i].nome + ", Preco: " + vet[i].preco);
        }
        
        double soma=0;
        for (int i=0; i<n;i++){
            soma+=vet[i].preco;  
        }
        System.out.println("Soma: "+soma);
        sc.close();
    }
}
