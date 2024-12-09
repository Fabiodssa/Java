
package company.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Funcionario {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            List<Dados> list = new ArrayList<>();

            System.out.print("Quantos funcionarios deseja cadastrar? ");
            int n = sc.nextInt();

            for (int i=0; i<n; i++) {

                    System.out.println();
                    System.out.println("Duncionario #" + (i + 1) + ":");
                    System.out.print("Id: ");
                    Integer id = sc.nextInt();
                    while (hasId(list, id)) {
                            System.out.println("Id iinvalido! tente novamente: ");
                            id = sc.nextInt();
                    }

                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Salario: ");
                    Double salary = sc.nextDouble();

                    Dados emp = new Dados(id, nome, salary);

                    list.add(emp);
            }

            System.out.println();
            System.out.print("Digite o Id de quem deseja almentar o salario: ");
            int idsalary = sc.nextInt();

            // Integer pos = position(list, idsalary);

            Dados emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

            // if (pos == null) {
            if (emp == null) {
                    System.out.println("ID nao encontrado!");
            }
            else {
                    System.out.print("Digite a porcentagem: ");
                    double percent = sc.nextDouble();
                    //list.get(pos).increaseSalary(percent);
                    emp.almentaSalario(percent);
            }

            System.out.println();
            System.out.println("List of employees:");
            for (Dados e : list) {
                    System.out.println(e);
            }		

            sc.close();
    }

    public static Integer position(List<Dados> list, int id) {
            for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId() == id) {
                            return i;
                    }
            }
            return null;
    }

    public static boolean hasId(List<Dados> list, int id) {
            Dados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;
    }
}