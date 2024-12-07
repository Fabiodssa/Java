package company.banco;

import company.banco.Cliente;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner (System.in);
        Cliente cliente;
        System.out.println("Numero da conta: ");
        String conta=sc.nextLine();
        System.out.println("Nome: ");
        String nome=sc.nextLine();
        System.out.println("Deseja entrar com deposito inicial sim (y) nao(n)? ");
        String yn=sc.nextLine();
        
        if (yn.equalsIgnoreCase("y")){
            System.out.println("Valor no deposito inicial: ");
            double depositoInicial=sc.nextDouble();
             cliente=new Cliente(conta,nome,depositoInicial);
        } else{
             cliente=new Cliente(conta,nome);
          }

        System.out.println();
        System.out.println("Atualizado: ");
        System.out.println(cliente);

        System.out.println("Quanto deseja depositar? ");
        double deposito1=sc.nextDouble();
        cliente.addDeposito(deposito1);
        
        System.out.println("Atualizado: ");
        System.out.println(cliente);
                
        System.out.println("Qaunto deseja retirar? ");
        double retdeposito=sc.nextDouble();
        cliente.delDeposito(retdeposito);
        
        System.out.println("Atualizado: ");
        System.out.println(cliente);
    }
}

////////////////////////
	