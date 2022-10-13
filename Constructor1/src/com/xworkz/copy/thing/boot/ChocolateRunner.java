package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate copy=new Chocolate();
		copy.brand="Cadbury";
		copy.name="DairyMilk";
		copy.flavour="Chacolate";
		copy.price=50;
		System.out.println(copy.brand);
		System.out.println(copy.name);
		System.out.println(copy.flavour);
		System.out.println(copy.price);
		
	
	

	}

}
