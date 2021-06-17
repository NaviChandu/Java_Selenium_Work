package EncapsulationConcept;

import java.lang.reflect.GenericArrayType;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String prodNameActial = "Apple MAC boook Pro";
		
		Product p = new Product();

		// p. cannot access any privates variables outside the class
		p.setProductName("Apple MAC boook Pro");
		System.out.println(p.getProductName());
		
		p.setProductBrand("Apple");
		System.out.println(p.getProductBrand());
		
		p.setProductDescription("16 inch white color laptop");
		System.out.println(p.getProductDescription());
		
		p.setProductPrice(22.00);
		System.out.println(p.getProductPrice());
		
		p.setSellerName("Xeon enterprice : New Delhi");
		System.out.println(p.getSellerName());
		
		if(p.getProductName().equals(prodNameActial)) {
			System.out.println("Correct Product Name : "+p.getProductName());
			
		}
	}

}
