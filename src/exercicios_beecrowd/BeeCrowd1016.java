package exercicios_beecrowd;

import java.util.Scanner;

public class BeeCrowd1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int km, tempo, distancia = 2;

		km = sc.nextInt();

		tempo = km * distancia;

		System.out.printf("%d minutos%n", tempo);

		sc.close();
	}
}