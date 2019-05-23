package demo;

import java.io.IOException;
import java.util.Scanner;

public class DemoTranslation {
	public final static int MAX_NOTAS = 10;

	public static void main(String[] args) throws IOException, InterruptedException {
		int i;
		float[] notas = new float[MAX_NOTAS];
		float soma, media;
		soma = 0;
		System.out.println("Digite as notas:");
		for(int i2 = 0; i2 < MAX_NOTAS; i2++) {
			notas[i2] = STDIN_SCANNER.nextFloat();
			soma = soma + notas[i2];
		}
		media = soma / MAX_NOTAS;
		System.out.printf("\nMedia: %.1f", media);
		System.out.print("\nNotas maiores do que a media: ");
		for(int i2 = 0; i2 < MAX_NOTAS; i2++) {
			if(notas[i2] > media) {
				System.out.printf("%.1f  ", notas[i2]);
			}
		}

		System.out.println("\n\n");
		new ProcessBuilder("pause").inheritIO().start().waitFor();
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
