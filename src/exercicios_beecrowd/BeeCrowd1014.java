package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1014 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		double media, y;

		x = sc.nextInt();
		y = sc.nextDouble();

		media = x / y;

		System.out.printf("%.3f km/l%n", media);

		sc.close();
	}
}