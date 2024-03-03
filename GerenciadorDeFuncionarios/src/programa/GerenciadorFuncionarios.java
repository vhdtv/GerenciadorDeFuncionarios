package programa;

import java.util.Scanner;

import entidades.Cargo;
import entidades.Desenvolvedor;
import entidades.Empresa;
import entidades.Funcionario;
import entidades.Gerente;
import entidades.Suporte;

public class GerenciadorFuncionarios {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Empresa emp = new Empresa();
			System.out.println("Digite o ID do funcionário: ");
			int id = sc.nextInt();
			System.out.println("Digite o salário base do funcionário: ");
			double salarioBase = sc.nextDouble();
			System.out.println("Digite o nome do funcionario");
			String nome = sc.nextLine();
			Funcionario func = GerenciadorFuncionarios.lerDadosFuncionario(id, salarioBase, nome, sc);
			emp.addFuncionario(func);
			System.out.println(emp.calcularFolhaSalarialTotal());
		}
	}

	public static Funcionario lerDadosFuncionario(int id, double salarioBase, String nome, Scanner sc) {
		System.out.println("Digite o cargo (DESENVOLVEDOR, GERENTE, SUPORTE): ");
		String cargoString = sc.next();
		Cargo c = Cargo.valueOf(cargoString.toUpperCase());

		Funcionario novoFuncionario = null;
		switch (c) {
		case DESENVOLVEDOR:
			novoFuncionario = new Desenvolvedor(nome, id, salarioBase);
			break;
		case GERENTE:
			novoFuncionario = new Gerente(nome, id, salarioBase);
			break;
		case SUPORTE:
			novoFuncionario = new Suporte(nome, id, salarioBase);
			break;
		default:
			throw new IllegalArgumentException("Cargo inválido.");
		}
		novoFuncionario.calcularSalario(salarioBase);
		novoFuncionario.setId(id);
		return novoFuncionario;
	}
}
