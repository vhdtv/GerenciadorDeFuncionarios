package entidades;

public class Suporte extends Funcionario {

	public Suporte(String nome, int id, double salario) {
		super(nome, id, salario);
	}

	@Override
	public void calcularSalario(double salarioBase) {
		this.setSalario(salarioBase * 1.05);
	}

}
