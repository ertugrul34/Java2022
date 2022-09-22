package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String sehirler[][] = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Kocaeli";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Nevşehir";
		sehirler[1][2] = "Eskişehir";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Elazığ";
		sehirler[2][2] = "Erzurum";

		// iç içe for döngüsü ile iki boyutlu matrisin elemanları i ve j değişkenleri ile ekrana yazdırılmıştır.
		
		for (int i = 0; i < 3; i++) {
			System.out.println("-----------");
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);

			}

		}

	}

}
