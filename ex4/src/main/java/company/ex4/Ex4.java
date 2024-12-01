package company.ex4;

public class Ex4 {

    public static void main(String[] args) {
        String nome = "        Fabio DOS SAntos de JESus    ";
        String nomeMax = nome.toLowerCase();
        String nomeMin = nome.toUpperCase();
        String apagaEspaco = nome.trim();
        String selcInicio = nome.substring(2);
        String selcInicio_fim = nome.substring(2,10);
        String substitui = nome.replace('o', 'X');
        int pri_ocorrencia = nome.indexOf('D');
        int ult_ocorrencia = nome.lastIndexOf('u');
        
        String p = "cabeca de martelo e marreta";  // "split" a frase é separada e armazenada em vetor
        String[] separa = p.split(" ");
        
        System.out.println("Original: "+nome);
        System.out.println("toLowerCase: "+nomeMax);
        System.out.println("toUpperCase: "+nomeMin);
        System.out.println("trim: "+apagaEspaco);
        System.out.println("substring: "+selcInicio);
        System.out.println("substring: "+selcInicio_fim);
        System.out.println("replace: "+substitui);
        System.out.println("indexOf: "+pri_ocorrencia);
        System.out.println("lastIndexOf: "+ult_ocorrencia);
        
        System.out.println("split: "+ separa[2]);
        System.out.println("split: "+ separa[1]);
        System.out.println("split: "+ separa[3]);
        
        
    }
}
