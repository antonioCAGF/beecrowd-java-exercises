package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1048 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// fazer com switch case depois

		double salario, novoSalario, reajusteSalario, porcentagem;
		int percentualAjustado;

		salario = sc.nextDouble();
		novoSalario = salario;

		if (salario <= 400.00) {
			porcentagem = 15.0 / 100.0;
			reajusteSalario = salario * porcentagem;
			novoSalario += reajusteSalario;
			percentualAjustado = 15;
		} else if (salario >= 400.01 && salario <= 800.00) {
			porcentagem = 12.0 / 100.0;
			reajusteSalario = salario * porcentagem;
			novoSalario += reajusteSalario;
			percentualAjustado = 12;

		} else if (salario >= 800.01 && salario <= 1200.00) {
			porcentagem = 10.0 / 100.0;
			reajusteSalario = salario * porcentagem;
			novoSalario += reajusteSalario;
			percentualAjustado = 10;
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			porcentagem = 7.0 / 100.0;
			reajusteSalario = salario * porcentagem;
			novoSalario += reajusteSalario;
			percentualAjustado = 7;
		} else {
			porcentagem = 4.0 / 100;
			reajusteSalario = salario * porcentagem;
			novoSalario += reajusteSalario;
			percentualAjustado = 4;
		}

		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajusteSalario);
		System.out.println("Em percentual: " + percentualAjustado + " %");

		sc.close();
	}
}