package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		DistrictCollector copy=new DistrictCollector();
		copy.name="Anusha";
		copy.age=26;
		copy.district="Chitradurga";
		copy.batchNo=23;
		System.out.println(copy.name);
		System.out.println(copy.age);
		System.out.println(copy.district);
		System.out.println(copy.batchNo);
		
	}

}
