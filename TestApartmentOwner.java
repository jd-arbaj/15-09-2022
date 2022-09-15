package com.exercise.pll;
import com.exercise.bll.ApartmentOwner;
public class TestApartmentOwner {
public static void main(String[] args) {
		
	ApartmentOwner ap1 = new ApartmentOwner();
	ApartmentOwner ap2 = new ApartmentOwner("Arbaj Sheikh");
		
		
		System.out.println(ap1);
		System.out.println("*****************************************");
		System.out.println("Owner : "+ap2.getOwner());
		
		//System.out.println("Apartment : "+ap2.getApartment(1));
		
		ap2.setApartment("Banglore", 2);
		ap2.setApartment("Indore", 3);
		ap2.setApartment("Harda", 5);
		ap2.setApartment("jhansi", 7);
		ap2.setApartment("Azad nagar indore", 9);
		
		System.out.println("Apartment : "+ap2.getApartment(2));
		
		System.out.println("Total Apartment : "+ap2.countApartments());
		
		System.out.println("******************************************");
		ap2.reorganizeApartments();//reorganize apartment
		System.out.println("Apartment : "+ap2.getApartment(2));
		System.out.println(ap2);
		
		//System.out.println("Apartment : "+ap2.getApartment(5));
	}
}
