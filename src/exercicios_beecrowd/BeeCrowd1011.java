package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1011 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;

		double raio = sc.nextDouble();

		double divisao = 4.0 / 3.0;

		double volume = divisao * pi * raio * raio * raio;

		System.out.printf("VOLUME = %.3f%n", volume);

		sc.close();
	}
}