
package company.estoquemelhorado;


public class Produto {
    
    public String nome;
    public double preco;
    public int estoque;
    
    public Produto(String nome, double preco, int estoque){
        this.nome=nome;
        this.preco=preco;
        this.estoque=estoque;
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
