package gep;

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
	
	//konstruktor
	public Person(int yob, String name, String address) {
		this.szul_ev = yob;
		this.nev = name;
		this.lakcim = address;
		
	}
	public Person() {
		this.szul_ev = 2003;
		this.nev = "Gipsz Jakab";
		this.lakcim = "Nefeljtsd utca 14";
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
	
	@Override
	public String toString() {
		return "Születési év: " + this.szul_ev + " Név: " + this.nev +  " lakcim: "+ this.lakcim;
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
