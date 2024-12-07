
package company.estoquemelhorado;

import java.util.Scanner;


public class EstoqueMelhorado {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Cadastre seu produto: ");
        System.out.println("Nome: ");
        String nome=sc.nextLine();        
        System.out.println("Preco: ");
        double preco=sc.nextDouble();
        System.out.println("Quantidade: ");
        int estoque=sc.nextInt();
        
        Produto produto=new Produto(nome, preco, estoque);
        // System.out.println("Estoque: "+produto.nome+","+produto.preco+","+produto.estoque);
        System.out.println(produto);
        
        System.out.println("");
        System.out.println("Digite quanto deseja adicionar: ");
        estoque=sc.nextInt();
        produto.addEstoque(estoque);
        
        System.out.println("Atualizado: "+produto);
        
        System.out.println("");
        System.out.println("Digite quanto deseja remover: ");
        estoque=sc.nextInt();
        produto.deletEstoque(estoque);
        
        System.out.println("Atualizado: "+produto);
    }
}


