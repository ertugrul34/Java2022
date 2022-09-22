
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		// değişken isimlendirmeleri java'da camalCase yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";

		System.out.println(ortaMetin);

		// integer tam sayı için yani int kullanılır
		int vade = 12;
		
		// ondalıklı veri için double, decimal
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		// şartlı veri tipleri için boolean kullanılır. Ya true ya da false alır.
		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		// array - bir sürü veri var liste şeklinde ise kullanılır

		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli" };

		// binlerce veri için hepsini tek tek yazmak yerine döngüleri(for) kullanırız
		// i++ i birer birer artır
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			}
	
	}
	
}
