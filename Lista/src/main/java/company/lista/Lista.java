
package company.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
        
        list.add("Maria");
        list.add("Anna");
        list.add("Gabriel");
        list.add("Pedro");
        list.add("Claudia");
        list.add("Jose");
        list.add("Andre");
        list.add("Mario");
        list.add(2,"Mario"); // adiciona elemento em posiçao da lista
        
        System.out.println(list.size());
        for(String x :list){
            System.out.println(x);
        }
        System.out.println("----------------");
        
   /////////////////////////////////////////////////////////////////////////////////////   
   
        list.remove("Mario"); //nao remove todos os "Mario"
        list.remove(5);
        list.removeIf(x -> x.charAt(0)== 'M'); // retorna verdadeiro se X.charAt(0) econtar o "M"
                                               // remove todos os nomes q começa com "M"
        
        System.out.println(list.size());
        for(String x :list){
            System.out.println(x);
        }
        System.out.println("----------------");
        
////////////////////////////////////////////////////////////////////
        
        System.out.println("Encontrar Anna: " + list.indexOf("Anna"));  // Econtta a posição
        System.out.println("Econtrar Mario: " + list.indexOf("Mario")); // Retorna -1 se nao encontrar
        System.out.println("-------------------");
  ////////////////////////////////////////////////////////////////////////////////////
  
        //cria uma  nova lista puxando a outra e seleciona so os nomes q começa com A
            
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("-------------------");
    /////////////////////////////////////////////////////////////////////////////////////
    
        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        nome = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
            System.out.println(nome);
    }
}
