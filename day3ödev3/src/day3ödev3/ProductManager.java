package day3ödev3;

public class ProductManager {
	
	public void add(Product product) {
		
		if(ProductValidator.isvalid(product)) {
			System.out.println("eklendi");
			
		}
		else {
			System.out.println("kişi bilgileri geçersiz");
		}
	}

}
