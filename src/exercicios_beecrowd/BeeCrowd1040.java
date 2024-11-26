package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1040 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1, n2, n3, n4, notaExame, p1 = 2, p2 = 3, p3 = 4, p4 = 1, media;

		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();

		media = ((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) / (p1 + p2 + p3 + p4);

		System.out.printf("Media: %.1f%n", media);

		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5) {
			System.out.println("Aluno reprovado.");
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			notaExame = sc.nextFloat();
			System.out.println("Nota do exame: " + notaExame);
			media = (media + notaExame) / 2;
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", media);
		}

		sc.close();
	}
}