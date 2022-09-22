package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 30;
		int sayi3 = 100;
		
		int enBuyuk = sayi1;
		
		if (sayi1<sayi2) {
			enBuyuk=sayi2;
		}
		
		if (sayi1<sayi3) {
			enBuyuk=sayi3;
		}
		
		
	System.out.println("En Büyük Sayı :" + enBuyuk);
		
	}

}
