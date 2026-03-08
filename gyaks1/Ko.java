package helyo;

import java.util.Scanner;
import java.util.ArrayList;;

public class Ko {
	
	private double valos, imagine;
	
	public Ko(double x, double yi) { // konsruktor
		this.valos = x;
		this.imagine = yi;
		
	}
	@Override // annotáció (jelzés)
	public String toString() {  // értsük is mit látunk
		String s = (this.valos+"+"+this.imagine+"i");
		return s;
		
	}
	
	public double abs() {
	    return Math.pow(Math.pow(valos, 2) + Math.pow(imagine, 2), 0.5);
	}
	
	// Üres konstruktor, ami delegál (meghívja a fenti konstruktort 0,0-val)
	public Ko() {
	    this(0.0, 0.0); 
	}

	public void setVa(double x) {
	 this.valos = x;
	}
	public void setIm(double yi) {
	 this.imagine = yi;
	}
	
	public Ko add(Ko masik) {
		Ko ret = new Ko(this.valos + masik.valos, this.imagine + masik.imagine);
	    return ret; // Az új komplex számot adjuk vissza
	}
	
	public Ko osszead(Ko masik) {
		Ko add = new Ko(this.valos + masik.valos, this.imagine + masik.imagine);
		return add;
	}
	
	public Ko pow(Ko masik) {
		Ko szorzas = new Ko(this.valos + masik.valos, this.imagine + masik.imagine);
		return szorzas;
	}
	
	public Ko diff(Ko masik) {
		Ko kivon = new Ko(this.valos - masik.valos, this.imagine - masik.imagine);
		return kivon;
	}
	
	public Ko div(Ko masik) {
		Ko oszt = new Ko(this.valos / masik.valos, this.imagine / masik.imagine);
		return oszt;
	}
	
	

	
	
	/*Írjunk programot, ami beolvas 3 komplex
		számot, és kiírja a legnagyobb abszolút 
		értékűt!
		- Mire van szükségünk?
		- komplex szám tárolása
		- beolvasás
		- abszolút érték számítása
		- maximumkiválasztás
		- kiíratás */

	public static void main(String[] args) {
		
		ArrayList<Ko> lista = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		input.useLocale(java.util.Locale.ENGLISH);
		
		// Ko peldany = new Ko(7.2, 8.4);
		// System.out.println(peldany);
		
		for (int x = 0; x < 3; x++) {
			Ko uj = new Ko();
			//double val = 0.0;
			//uj.setVa(0.0);
			//double imaginarius = 0.0;
			// uj.setIm(0.0);
			System.out.println(x+1+". Kérek egy  valós szamot: ");
			if (input.hasNextDouble()) {
				//val = input.nextDouble(); // hasznaljunk settert
				uj.setVa(input.nextDouble());
			}
			else {
				System.out.println("Nop");
				input.next();
			}
			
			System.out.println(x+1+". Kérek egy  imaginárius szamot: ");
			if (input.hasNextDouble()) {
				// imaginarius = input.nextDouble();
				uj.setIm(input.nextDouble());
			}
			else {
				System.out.println("Nop");
				input.next();
			}
			// Ko kopmx_nums = new Ko(val, imaginarius);
			lista.add(uj);
			
			
			
		}
		Ko nagy = lista.get(0);
		Ko sum = new Ko(0,0);
		for (int x = 0; x < lista.size(); x++) {
			if (nagy.abs() < lista.get(x).abs()) {
				nagy = lista.get(x);
			}
			sum = sum.add(lista.get(x));
			
		}
		
		
		Ko uj2 = new Ko();
		System.out.println("nagy: "+nagy);
		uj2.setVa(7.4);
		uj2.setIm(8.4);
		
		Ko osszead = nagy.add(uj2);
		System.out.println("nagy+ uj2: "+ osszead);
		System.out.println("summa: "+ sum);
		input.close();
		
		
		

	}

}
