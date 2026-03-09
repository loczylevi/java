package gep;

import java.util.ArrayList;

public class Person {
	
	/*Person (személy)
	i. attribútumok: születés éve (int), név (String), lakcím 
	(String)
	ii. metódusok: konstruktorok az attribútumokhoz, getter 
	függvények, toString*/
	
	//attributumok:
	
	private int szul_ev;
	private String nev;
	private String lakcim;
	
	private ArrayList<Vehicle> cars;
	
	//konstruktor
	public Person(int yob, String name, String address) {
		this.szul_ev = yob;
		this.nev = name;
		this.lakcim = address;
		this.cars = new ArrayList<Vehicle>();
		
	}
	public Person() {
		this.szul_ev = 2003;
		this.nev = "Gipsz Jakab";
		this.lakcim = "Nefeljtsd utca 14";
		this.cars = new ArrayList<Vehicle>();
	}
	
	//getterek
	public int getSzulEv() {
		return this.szul_ev;
	}
	
	public String getNev() {
		return this.nev;
	}
	
	public String getLakcim() {
		return this.lakcim;
	}
	
	public void addCar(Vehicle v) {
		if (v != null) {
			cars.add(v);
			
		}
		
	}
		
	public void RemoveCar(Vehicle platenum) {
		
		Vehicle talalat = null;
		
		for (Vehicle kocsi : cars)
			if (kocsi.getRendszam().equals(talalat)) {
				talalat = kocsi;
				
			}
		if (talalat != null) {
			platenum.SetOwner(null);
			cars.remove(talalat);
			
		}

	}
	
	
	
	
	@Override
	public String toString() {
		return "Születési év: " + this.szul_ev + " Név: " + this.nev +  " lakcim: "+ this.lakcim;
		
		
	}
	
	
	
	
	
	
	
	
	
	

}