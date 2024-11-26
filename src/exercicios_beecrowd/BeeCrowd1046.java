package exercicios_beecrowd;

import java.util.Scanner;

public class BeeCrowd1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracao, maximoHoras = 24;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		if (horaInicial > horaFinal) {
			duracao = (maximoHoras - horaInicial) + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		} else if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", maximoHoras);
		}

		sc.close();
	}
}