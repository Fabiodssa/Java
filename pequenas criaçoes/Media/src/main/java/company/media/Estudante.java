package company.media;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    double media;
    double falta;
    public double media(){
        return media=(nota1+nota2+nota3)/3;
    }

    public String toString(){ 
        if (media()>=6){
            System.out.println("APROVADO");
        } else{
            if ((media()<6) && (media()>=4)){
                System.out.println("RECUMPERACAO");
                 falta=(media()-6)*-1;
            }       else{
                         System.out.println("REPROVADO");
                    }
          }
        return "Nome: "+ nome + 
               "\nMedia: "+ String.format("%.2f",(nota1+nota2+nota3)/3)+
               "\nFalta: "+ String.format("%.2f", falta);
    }
}
