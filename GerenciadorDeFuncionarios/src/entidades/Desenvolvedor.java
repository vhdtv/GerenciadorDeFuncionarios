package entidades;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, int id, double salario) {
		super(nome, id, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularSalario(double salarioBase) {
		// TODO Auto-generated method stub
		this.setSalario(salarioBase * 1.1);
	}

}
