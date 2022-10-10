package overriding;

//overriding
// extend edilen classın önünde yapılan işlem ana classın operasyonu yerine geçer
//overridable - inherit edilen classın operasyonları ezilebilir

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
	

}
