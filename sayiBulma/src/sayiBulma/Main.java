package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int sayilar [] = new int [] {1,2,5,7,9,0,};
		int aranacak = 3;
		boolean test=false;
		
		for (int i=1;i<sayilar.length;i++) {
			if (sayilar[i]==aranacak) {
				test=true;
				break;
			}
		}
		
		if (test) {
			System.out.println(aranacak + " sayısı dizi içinde mevcuttur.");
		}else {
			System.out.println(aranacak + " sayısı dizi içinde mevcut değildir.");
		}
		

	}

}
