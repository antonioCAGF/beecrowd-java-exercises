package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1009 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double salario;
		double totalDeVendas;
		double totalReceber;

		nome = sc.nextLine();
		salario = sc.nextDouble();
		totalDeVendas = sc.nextDouble();

		totalReceber = salario + (totalDeVendas * 0.15);

		System.out.printf("TOTAL = R$ %.2f%n", totalReceber);

		sc.close();
	}
}