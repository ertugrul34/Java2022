package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name ="Laptop";
		product.id=1;
		product.description ="Asus Laptop";
		product.price =5000;
		product.stockAmount =3;
		System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
	// Her bir class tek iş yapmalı. Ürünle ilgili özellikler product classında tutulmuştur.
	//ürünle ilgili operasyonlar için ayrı productmanager classı oluşturulmuştur.
		
	// Single responsibility Bir class bir amaç için oluşturulmalıdır. Birden fazla amaç yüklenirse karışıklık olur.
		

	}

}
