package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int sayilar[] = new int[] { 1, 2, 5, 7, 9, 0, };
		int aranacak = 6;
		boolean test = false;

		for (int i = 1; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				test = true;
				break;
			}
		}

		String mesaj = " ";
		if (test) {
			mesaj = "Sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj){
		System.out.println(mesaj);
	}

}
