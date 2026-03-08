package helyo;
import java.util.ArrayList;
import java.util.Scanner;
public class dynamic_tomb {
	/*a) Írjunk függvényt (tombKi), 
	 * amely egy paraméterül kapott egész tömb tartalmát
	 *  kiírja a
		szabványos kimenetre! */
	
	public static void tombKi(ArrayList<Integer> lista) {
		for (int n : lista) {
			System.out.print(n+ " ");
		}
		
		System.out.println();
	}
	
	/*b) Írjunk függvényt (tombPoz), amely egy paraméterként
	 *  kapott egész tömb elemein
	végigmenve a negatív számokat lecseréli az abszolút-értékükre!
 	Pl. az [1,-2,3,-4,0,-3]
	tartalmú tömbben az új tartalom legyen [1,2,3,4,0,3]! Az 
	eredményt
 	írassuk ki a tombKi
	függvény segítségével!*/
	
	public static void tombPoz(ArrayList<Integer> lista) {
		int meddig = lista.size();
		for (int x = 0; x < meddig; x++) {
			if (lista.get(x) < 0) {
				int uj = lista.get(x);
				lista.set(x, (uj*-1));
				
			}
		}
		
	}
	
	/*c) A főprogramban olvassunk be 10 egész számot egy tömbbe,
	 *  majd hívjuk meg rendre a
	tombKi, tombPoz és tombKi függvényeket! Mit tapasztalunk?
	 Miért?*/
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int x = 0;
		while (x < 10) {
			System.out.println("num: ");
			int beker = input.nextInt();
			lista.add(beker);
			x++;
			
		}
		tombKi(lista);
		tombPoz(lista);
		tombKi(lista);
		
		
	}
	
	
	
	

}
