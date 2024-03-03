package entidades;

public abstract class Funcionario {
	private String nome;
	private int id;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, int id, double salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract void calcularSalario(double salarioBase);
}
