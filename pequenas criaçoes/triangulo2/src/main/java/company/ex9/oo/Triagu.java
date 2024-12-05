package company.ex9.oo;


public class Triagu {
    public double a;
    public double b;
    public double c;
    
    public double area(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}