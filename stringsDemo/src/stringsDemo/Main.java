package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		System.out.println(mesaj);

		// string ifadedeki eleman sayısını verir
		System.out.println("Eleman Sayısı: " + mesaj.length());
		
		// string ifadenin istenilen karakterini yakalamaya yarar
		System.out.println("5.eleman : " + mesaj.charAt(4));
		
		// string ifadeye ekleme yapar. metinsel toplama gibi
		System.out.println(mesaj.concat("Yaşasın!"));
		
		// string ifadenin seçilen karakterle başlayıp başlamadığını kontrol eder. Boolean tipinde dönüş verir
		System.out.println(mesaj.startsWith("A"));
		
		//string ifadenin seçilen karakterle bitip bitmediğini kontrol eder. Boolean tipinde dönüş verir
		System.out.println(mesaj.endsWith("."));
		//
		//
		char[] karakterler = new char [5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//string ifadede belirlenen karakterin kaçıncı indexte olduğunu baştan başlayarak gösterir.
		System.out.println(mesaj.indexOf('a'));
		
		// string ifadede belirlenen karakterin kaçıncı indexte olduğunu sondan başlayarak tarar. index numarası baştan başlar
		System.out.println(mesaj.lastIndexOf('e'));
		
		// seçilen karakterin yenisiyle değiştirilmesine yarayan metod
		System.out.println(mesaj.replace(' ', '-'));
		
		String yeniMesaj = mesaj.replace(' ', '/');
		System.out.println(yeniMesaj);
		
		// String ifadeyi belirtilen aralıkta kesmek için kullanılır.
		System.out.println(mesaj.substring(2,4));
		
		//
		for (String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		// ifadedeki tüm harfleri küçük yapar
		System.out.println(mesaj.toLowerCase());
		
		//tüm harfleri büyük harf yapar 
		System.out.println(mesaj.toUpperCase());
		
		// ifadedeki boşlukları siler trim yapar.
		System.out.println(mesaj.trim());
		
		
		
	}

}
