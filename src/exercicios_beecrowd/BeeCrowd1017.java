package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1017 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempoViagem, velocidadeMedia;
		double distanciaPercorrida, quantidadeLitrosNecessarios;

		tempoViagem = sc.nextInt();
		velocidadeMedia = sc.nextInt();

		distanciaPercorrida = tempoViagem * velocidadeMedia;
		
		quantidadeLitrosNecessarios = distanciaPercorrida / 12;

		System.out.printf("%.3f%n", quantidadeLitrosNecessarios);

		sc.close();

	}
}