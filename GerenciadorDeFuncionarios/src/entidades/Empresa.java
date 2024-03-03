package entidades;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario> funcionarios;

	public Empresa() {
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void addFuncionario(Funcionario i) {
		funcionarios.add(i);
	}

	public void removeFuncionario(Funcionario j) {
		funcionarios.remove(j);
	}

	public double calcularFolhaSalarialTotal() {
		double folhaSalarialTotal = 0;
		for (Funcionario func : funcionarios) {
			folhaSalarialTotal = folhaSalarialTotal + func.getSalario();
		}
		return folhaSalarialTotal;
	}
}
