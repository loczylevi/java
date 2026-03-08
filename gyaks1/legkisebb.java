package helyo;

import java.util.Scanner;

public class legkisebb {
	 /*Feladat:
	Írj egy függvényt (mondjuk legkisebbIndex), ami visszaadja a 
	tömbben található legkisebb szám sorszámát (indexét)!
	Segítség: Indulj ki abból, hogy a 0. indexen van a legkisebb, 
	aztán hasonlítsd össze a többivel!
	Szeretnéd megpróbálni megírni ezt a negyedik osztályon belül?*/
	
	public static int legkisebbIndex(int[] tomb) {
		int legkisebb = tomb[0];
		int index = 0;
		for (int n = 0 ; n < tomb.length; n++) {
			if (tomb[n] < legkisebb) {
				index = n;
				legkisebb = tomb[n];
			}
			
			
		}
		return index;
		
	}
	/*Mi lenne, ha megpróbálnánk egy "Keresés" feladatot?
	Írj egy függvényt, ami:

	Kap egy tömböt és egy keresett számot.

	Megmondja (visszaadja), hogy a szám benne van-e a tömbben 
	(igaz/hamis), vagy visszaadja az indexét.*/
	
	public static boolean kereso(int[] tomb, int keresendo) {
		for (int n : tomb) {
			if (n == keresendo) {
				return true;
				
			}
		}
		return false;
		
		
		
	}
	
	public static void main(String[] args) {
			 Scanner input = new Scanner(System.in);
			 int[] lista = new int[10];
			 for (int x = 0; x < 10; x++) {
				 System.out.println("kérek egy szamot: ");
				 int beker = input.nextInt();
				 lista[x] = beker;
			 }
			 System.out.println(legkisebbIndex(lista));
			 

}
}