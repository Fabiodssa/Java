
package company.condcase;
import java.util.Scanner;
public class Condcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ms;
        System.out.println("DIGITE O NUMERO DO MES: ");
        int nmes= sc.nextInt();
        switch(nmes){
            case 1:
                ms= "JANEIRO";
                break;
            case 2:
                ms="FEVEREIRO";
                break;
            case 3:
                ms="MARÇO";
                break;
            case 4:
                ms="ABRIL";
                break;
            case 5:
                ms="MAIO";
                break;
            case 6:
                ms="JUNHO";
                break;
            default:
                ms="MES INVALIDO";
                break;
               
        }
            System.out.println(ms);
    
    } 
}