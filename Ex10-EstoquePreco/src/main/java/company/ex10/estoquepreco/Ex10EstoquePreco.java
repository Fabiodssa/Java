
package company.ex10.estoquepreco;

import java.util.Scanner;
import company.ex10.estoquepreco.Produto;

 class Ex10EstoquePreco {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Cadastre seu produto: ");
        System.out.println("Nome: ");
        produto.nome=sc.nextLine();
        System.out.println("Preco: ");
        produto.preco=sc.nextDouble();
        System.out.println("Quantidade: ");
        produto.estoque=sc.nextInt();
        
        //     System.out.println("Estoque: "+produto.nome+","+produto.preco+","+produto.estoque);
        System.out.println(produto);
        
        System.out.println("");
        System.out.println("Digite quanto deseja adicionar: ");
        int estoque=sc.nextInt();
        produto.addEstoque(estoque);
        
        System.out.println("Atualizado: "+produto);
        
        System.out.println("");
        System.out.println("Digite quanto deseja remover: ");
        estoque=sc.nextInt();
        produto.deletEstoque(estoque);
        
        System.out.println("Atualizado: "+produto);
    }
}
