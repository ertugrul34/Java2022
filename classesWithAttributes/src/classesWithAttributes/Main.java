package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		System.out.println(product.getName());

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());

		// Her bir class tek iş yapmalı. Ürünle ilgili özellikler product classında
		// tutulmuştur.
		// ürünle ilgili operasyonlar için ayrı productmanager classı oluşturulmuştur.

		// Single responsibility Bir class bir amaç için oluşturulmalıdır. Birden fazla
		// amaç yüklenirse karışıklık olur.

	}

}
