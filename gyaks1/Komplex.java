package helyo;

import java.util.Scanner;
import java.util.ArrayList;
public class Komplex { // tervrajz
	
	double valos, imagine;
	
	public Komplex(double x, double yi) {//Konstruktor 
		this.valos = x;
		this.imagine = yi;
	}
	
	public String toString() { // emberi szemmel is értsük a megépitett házainkat XD
	    return valos + " + " + imagine + "i";
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useLocale(java.util.Locale.UK); // Ez kényszeríti a pont használatát!
		
		//Komplex komx_nums = new Komplex(4.2, 8.5);
		ArrayList<Komplex> lista = new ArrayList<>();
				
		for (int db = 0; db < 3; db++) {
			System.out.println((db+1)+". kérek egy szamot: ");
			double num = input.nextDouble();
			System.out.println((db+1)+". kérek egy masik szamot: ");
			double num2 = input.nextDouble();
			
			Komplex komx_num = new Komplex(num, num2); //pédányositás Itt készül el a tervrajz alapján a kádár kocka/ház amit épiteni akarunk 
			//pédányositás Itt készül el a tervrajz :3
			
			lista.add(komx_num);
			
			
			
		}
		for (int db = 0; db < lista.size(); db++) {
			System.out.println(lista.get(db));
		}
		
		
		
		
		
		


	}

}
