package helyo;

import java.util.Scanner;
public class negyedik {
	
	/*a) Írjunk függvényt (tombKi), amely egy paraméterül 
	 * kapott egész tömb tartalmát kiírja a
szabványos kimenetre! */
	
	public static void tombKi(int[] tomb) {
		
		for (int n : tomb) {
			System.out.print(n+ " " );
			
		}
		System.out.println();
		
		
	}
	/*b) Írjunk függvényt (tombPoz), amely egy paraméterként kapott
	    egész tömb elemein
		végigmenve a negatív számokat lecseréli az 
		abszolút-értékükre! Pl.
 		az [1,-2,3,-4,0,-3]
		tartalmú tömbben az új tartalom legyen [1,2,3,4,0,3]!
		 Az eredményt
 		írassuk ki a tombKi
		függvény segítségével!*/
	
	 public static void tombPoz(int[] tomb) {
		 
		 for (int n = 0;n < tomb.length; n++) {
			 if (tomb[n] < 0) {
				 tomb[n] = tomb[n]*-1;
			 }
			 
		 }

		 
		 
	 }
	 
	 /*c) A főprogramban olvassunk be 10 egész számot egy tömbbe,
	  *  majd hívjuk meg rendre a
      tombKi, tombPoz és tombKi függvényeket! Mit tapasztalunk?
       Miért?*/
	
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
		 int[] lista = new int[10];
		 for (int x = 0; x < 10; x++) {
			 System.out.println("kérek egy szamot: ");
			 int beker = input.nextInt();
			 lista[x] = beker;
			
			 
			 
		 }
		 System.out.print("sima_________________________\n");
		 tombKi(lista);
		 tombPoz(lista);
		 System.out.print("atlalakitott_________________________\n");
		 tombKi(lista);
		 
		 
	 }
	 
	 
	
	
	
	
	

}
