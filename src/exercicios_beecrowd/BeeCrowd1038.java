package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int codigoItem = sc.nextInt();
		int quantidadeItem = sc.nextInt();

		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;
		double total;

		if (codigoItem == 1) {
			total = quantidadeItem * cachorroQuente;
		} else if (codigoItem == 2) {
			total = quantidadeItem * xSalada;
		} else if (codigoItem == 3) {
			total = quantidadeItem * xBacon;
		} else if (codigoItem == 4) {
			total = quantidadeItem * torradaSimples;
		} else {
			total = quantidadeItem * refrigerante;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}
}