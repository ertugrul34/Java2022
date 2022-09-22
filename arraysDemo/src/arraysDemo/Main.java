package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Erol";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Erol";
		ogrenciler[3] = "Ahmet";

		// ogrenciler dizisi içerisindeki elemanların for döngüsü ve i değişkeni ile yazdırılması
		
		for (int i = 0; i < 4; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("------------------");
		
		// ogrenciler dizisi içerisindeki elemanların ogrenci değişkeni ile yazılması
		// en çok kullanılan yöntem. i değişkeni kullanmadan 
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
