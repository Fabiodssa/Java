
package company.dadosfuncionario;

import java.util.Scanner;
import company.dadosfuncionario.Metodo;

public class DadosFuncionario {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Metodo metodo=new Metodo();
        System.out.println("Nome do funcionario: ");
        metodo.nome=sc.nextLine();
        System.out.println("Digite o salario: ");
        metodo.salario=sc.nextDouble();
        System.out.println("Digite o desconto: ");
        metodo.desconto=sc.nextDouble();
        
        System.out.println("nome: "+ metodo.nome+"\nSalario: "+(metodo.salario-metodo.desconto));
        
        System.out.println("Deseja almentar o salario em quanto porcento? ");
        double x=sc.nextDouble();
        metodo.aumento(x);
        
        System.out.println("Atualizado: \n nome: "+metodo.nome+"\n salario: "+ metodo.aumento(x));
    }
}
