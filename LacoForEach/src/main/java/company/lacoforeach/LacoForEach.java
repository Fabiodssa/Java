package company.lacoforeach;

public class LacoForEach {

    public static void main(String[] args) {
        String vet[]=new String[]{"Bob","Alex","Maria"};
        
        for(int i=0; i<vet.length;i++){
            System.out.println(vet[i]);
        }
        
        System.out.println("*****************");
        
        for(String obj:vet){
            System.out.println(obj);
        }
    }
}
