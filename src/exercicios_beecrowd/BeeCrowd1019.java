package exercicios_beecrowd;

import java.util.Scanner;

public class BeeCrowd1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas, minutos, segundos, resto; // sobra, restante, decomposto

		int N = sc.nextInt();

		horas = N / 3600;
		resto = N % 3600;

		minutos = resto / 60;

		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}
}