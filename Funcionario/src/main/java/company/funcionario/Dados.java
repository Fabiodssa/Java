
package company.funcionario;

public class Dados {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Dados() {
	}

	public Dados(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salario;
	}

	public void setSalary(Double salary) {
		this.salario = salario;
	}
	
	public void almentaSalario(double percentage) {
		salario += salario * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}