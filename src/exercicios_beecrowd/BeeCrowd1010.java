package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoDePeca1;
		int numeroDePecas1;
		double valorUnitarioPeca1;

		int codigoDePeca2;
		int numeroDePecas2;
		double valorUnitarioPeca2;

		double valorParaSerPago;

		codigoDePeca1 = sc.nextInt();
		numeroDePecas1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();

		codigoDePeca2 = sc.nextInt();
		numeroDePecas2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();

		valorParaSerPago = (numeroDePecas1 * valorUnitarioPeca1) + (numeroDePecas2 * valorUnitarioPeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorParaSerPago);

		sc.close();
	}
}