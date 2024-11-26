package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowdSwitchCase1038 {
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

		switch (codigoItem) {
		case 1:
			total = quantidadeItem * cachorroQuente;
			break;
		case 2:
			total = quantidadeItem * xSalada;
			break;
		case 3:
			total = quantidadeItem * xBacon;
			break;
		case 4:
			total = quantidadeItem * torradaSimples;
			break;
		default:
			total = quantidadeItem * refrigerante;
			break;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}
}