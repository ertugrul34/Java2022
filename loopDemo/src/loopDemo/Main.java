package loopDemo;

public class Main {

	public static void main(String[] args) {

		// for
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");

		// while Döngüsü

		int i = 2;

		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü Bitti.");

		// Do-While Döngüsü

		int j = 1;

		do {

			// System.out.println("Loglandı.");
			// Sisteme log atmak için
			System.out.println(j);
			j += 2;

		} while (j < 10);

		System.out.println("Do-While Döngü Bitti.");

	}

}
