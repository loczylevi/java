package helyo;

import java.util.ArrayList;
import java.util.Scanner;

public class harmadik {
	/*3 Listák feltöltése
Lista (ArrayList) használatával írjunk programot, 
amely beolvas 10 egész számot és kiírja az átlagnál
nagyobbakat!*/
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		for (int x = 0; x < 10; x++) {
			System.out.println("Kérek egy számot: ");
			int beker = input.nextInt();
			lista.add(beker);
					}
		double ossz = 0;
		for (int x = 0; x < lista.size(); x++) {
			ossz = ossz + lista.get(x);
			
		}
		double atlag = ossz / lista.size();
		
		for (int x : lista) {
			if (x > atlag) {
				System.out.println(x);
				
			}
			
		}
		
		}
	
}

		
				
				

		
		
		
		
		
		
	

	
	
	


