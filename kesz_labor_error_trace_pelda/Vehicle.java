package gep;
import java.util.ArrayList;


public class Vehicle {
//i. attribútumok: gyártás éve (int), rendszám (String),
//típus (String)
//ii. metódusok: konstruktorok az attribútumokhoz, getter
//függvények, toString
	
	// 1. attributomok
	private int ev;
	private String rendszam;
	private String tipus;
	
	private Person owner;
	
	// konstruktorok "tervrajz"
	public Vehicle(int year, String ID, String type) {
		this.ev = year;
		this.rendszam = ID;
		this.tipus = type;
	}
	
	public Vehicle() {
		this.ev = 2026;
		this.rendszam = "AAA-000";
		this.tipus = "Volkswagen Bogár";
	}
	
	// getterek
	public int getEv() {
		return this.ev;
	}
	
	public String getRendszam() {
		return this.rendszam;
	}
	
	
	public String getTipus() {
		return this.tipus;
	}
	
	public Person getOwner() {
		return this.owner;
		
	}
	
	public void SetOwner(Person own) {
		this.owner = own;
		
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		String s = "rendszám: " + this.rendszam + " tipus: " +  this.tipus + " év: "+ this.ev;
		return s;
		
	}
	
	
	
	
	
	
	
	
	

}