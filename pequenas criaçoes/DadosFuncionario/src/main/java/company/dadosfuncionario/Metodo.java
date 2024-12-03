package company.dadosfuncionario;

public class Metodo {
    
    String nome;
    double salario;
    double desconto;
    
    double x;
    public double aumento(double x){
        return ((x/100)*(salario-desconto))+(salario-desconto);
    }
    
}
