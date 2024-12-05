package company.media;

import java.util.Scanner;
import company.media.Estudante;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante st = new Estudante();
        
        System.out.println("Nome do aluno: ");
        st.nome=sc.nextLine();
        System.out.println("Primeira nota: ");
        st.nota1=sc.nextDouble();
        System.out.println("Segunda nota: ");
        st.nota2=sc.nextDouble();
        System.out.println("Terceira nota: ");
        st.nota3=sc.nextDouble();
        
        System.out.println(st);
    }
}
