package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
		
		// Yazılım katmanları arasındaki geçişleri bağımlılığı önlemek için Interface ler ile yapmamız gerekir.
		
		// classlar birden fazla interface i implimente edeilir.
		// sadece bir classı inherit edebilir.
		
		// interface lerinde referans tutucu özelliği vardır.

	}

}
