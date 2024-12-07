
package company.banco;

public class Cliente {
    
    private String conta;
    private String nome;
    private double deposito;
    
    public Cliente( String conta, String nome) {
    this.conta=conta;
    this.nome=nome;        
    }
    
    public Cliente( String conta, String nome, double depositoInicial) {
        this.conta=conta;
        this.nome=nome;
        addDeposito(depositoInicial);
    }

            
    public String getConta(){
        return conta;      
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public double getDeposito(){
       return deposito;
    }
    
    public double addDeposito(double deposito){
        return this.deposito+=deposito;
    }
    public double delDeposito( double deposito){
       return this.deposito-=deposito+5;
    } 

    public String toString() {
	return "Conta "
            + conta
            + ", Nome: "
            + nome
            + ", Extrato: $ "
            + String.format("%.2f", deposito);
	}
}

///////////////////////////////////////