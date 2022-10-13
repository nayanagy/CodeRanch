package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.DustBin;

public class DustBinRunner {

	public static void main(String[] args) {
		DustBin  copy= new DustBin();
		copy.color="Black";
		copy.design="Cylindrical";
		copy.export="ALL over world";
		copy.owner="Ingvar Kamprad";
		copy.chemicals="Bromide";
		copy.productionQuality="Standard ";
		copy.originatedPlace="Netherlands";
		copy.brandAmbassader="Amitabh Pande";
		copy.discount=50;
		System.out.println(copy.type);
		System.out.println(copy.brand);
		System.out.println(copy.company);
		System.out.println(copy.logo);
		System.out.println(copy.location);
		System.out.println(copy.price);
		System.out.println(copy.capacity);
		System.out.println(copy.quality);
		System.out.println(copy.gst);
	    System.out.println (copy.owner);
	    System.out.println (copy.chemicals);
	    System.out.println (copy.productionQuality);
	    System.out.println (copy.export);
	    System.out.println (copy.originatedPlace);
	    System.out.println (copy.brandAmbassader);
	    System.out.println (copy.discount);
	    System.out.println (copy.color);
	    System.out.println (copy.design);

	}

}
