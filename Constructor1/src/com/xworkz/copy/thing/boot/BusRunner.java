package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.Bus;

public class BusRunner {

	public static void main(String[] args) {
	 Bus copy=new Bus();
	
	 copy.no=21;
	 copy.source="bangalore";
	 copy.destination="Mysore";
	 System.out.println(copy.no);
	 System.out.println(copy.source);
	 System.out.println(copy.destination);
	 
	 Bus copy1=new Bus();
		
	 copy.no=23;
	 copy.source="Mysore";
	 copy.destination="bangalore";
	 System.out.println(copy.no);
	 System.out.println(copy.source);
	 System.out.println(copy.destination);
	 

	}

}
