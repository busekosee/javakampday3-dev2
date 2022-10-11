package day3ödev3;

public class ProductValidator {
	public  static boolean isvalid(Product product) {
		if(product.id>0 && ! product.name.isEmpty()) {
			return true;
		}
		else {
		return false;

		
	}

}}
