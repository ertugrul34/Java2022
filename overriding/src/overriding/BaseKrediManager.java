package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}

}


// final keyword kullanılırsa inherit eden classlar tarafından ana class override edilemez