package exercicios_beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class BeeCrowd1061 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
		String s;

		//s = sc.next();
		W1 = sc.nextInt();
		X1 = sc.nextInt();
		//s = sc.next();
		Y1 = sc.nextInt();
		//s = sc.next();
		Z1 = sc.nextInt();
		//s = sc.next();
		W2 = sc.nextInt();
		X2 = sc.nextInt();
		//s = sc.next();
		Y2 = sc.nextInt();
		//s = sc.next();
		Z2 = sc.nextInt();
		
		inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
		fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
		duracao = fim - inicio;
		
		W = duracao / (24*60*60); // 86400
		resto = duracao % (24*60*60); // resto que sobrou da divisao entre duracao e dia, esse é os segundos 
		// das horas
		X = resto / (60*60); // resto da duracao da divisao entre duracao e dia divido por segundos das horas
		resto = resto % (60*60); // pegamos o resto dessa divisao de X que é horas
		Y = resto / 60; // descobrimos entao os minutos dividindo resto da divisao de X por 60
		Z = resto % 60; // e o resto da divisao de Y é os segundos
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");		
		
		sc.close();
	}
}