
package company.encapsulamento;


public class Produto {
    
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque){
        this.nome=nome;
        this.preco=preco;
        this.estoque=estoque;
    }

      public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    
    public String getNome() { // permite mostar a variavel privada
        return nome;
    }
    public void setNome(String nome) { //// permite mudar a variavel privada
        this.nome=nome;
    }
    public double getPrice() {
        return preco;
    }
    public void setPrice(double preco) {
        this.preco=preco;
    }
    public int getQuantity() {
        return estoque;
    }
    
    
    public double precoEstoque(){
        return preco*estoque;
    }
    public void addEstoque( int estoque){
        this.estoque+=estoque;
    }
    public void deletEstoque(int estoque){
        this.estoque-=estoque;
    }
     public String toString(){
         return nome + ", R$" + String.format("%.2f", preco) + ", " + estoque + " unidades, Preco total: R$" + String.format("%.2f", precoEstoque());
     }
}
