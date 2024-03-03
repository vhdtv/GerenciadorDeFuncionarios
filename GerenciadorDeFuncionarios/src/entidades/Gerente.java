package entidades;

public class Gerente extends Funcionario {

	public Gerente(String nome, int id, double salario) {
		super(nome, id, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSalario(double salarioBase) {
		// TODO Auto-generated method stub
		this.setSalario(salarioBase * 1.2 + 1000);
	}

}
