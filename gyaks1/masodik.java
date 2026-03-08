package helyo;

import java.util.Scanner;

/*
2 Tömbök feltöltése
Tömbök (nem listák!) használatával írjunk programot,
amely beolvas 10 egész számot és kiírja az
átlagnál nagyobbakat!
*/



public class masodik {
	

	public static void main(String[] args) {
		
		int[] l1 = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int x = 0;x<10;x++) {
			System.out.println(x+ ". Kérek egy számot: ");
			int beker = input.nextInt();
			l1[x] = beker;
			
		}
		double ossz = 0;
		for (int x = 0; x < l1.length; x++) {
			ossz = ossz + l1[x];
			
		}
		
		double atlag = ossz / l1.length;

		
		
		for (int x = 0; x < l1.length; x++) {
			if (l1[x] > atlag) {
				System.out.println(l1[x]);


				
			}
			
		}
			
			
		
		
		


		
		
		
	}
	
	


}



