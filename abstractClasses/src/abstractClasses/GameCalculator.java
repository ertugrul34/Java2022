package abstractClasses;

	//abstract kullanıldığında işlemin mutlaka override edilmesi lazım
	//abstract 

public abstract class GameCalculator {
	public abstract void hesapla();
	
	//
	
	public final void gameOver() {
		System.out.println("Oyun Bitti !");
	}

}
