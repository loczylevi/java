package helyo;
import java.util.Scanner;
import java.util.ArrayList;
public class gyaks_1 {
	
	
	/*1a. Írjon Java alkalmazást, ami a szabványos bemenetről 
	 * beolvasott egész számról eldönti, hogy a szám tökéletes 
	 * szám-e! A tökéletes számok olyan számok, amelyeknek a 
	 * valódi osztóinak összege azonos a számmal. 
Pl. 6 osztói 1,2,3 és 6 = 1+2+3; 28 osztói 1,2,4,7,14 és
 28=1+2+4+7+14; 10 osztói 1,2,5 és 10 != 1+2+5. Tehát 6 és 28 
 tökéletesek, 10 nem az.*/
	
	public static boolean tokeletes(int szam) {
		ArrayList<Integer> osztok = new ArrayList<>();
	
		// osztok
		for (int x = 1; x < szam; x++) {
			if (szam % x == 0) {
				osztok.add(x);}}
		
		// sum()
		int ossz = 0;
		for (int n : osztok) {
			ossz+= n;}
		
		
		if (szam == ossz) {
			return true;}
		else {
			return false;}	
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kérek egy szamot");
		int beker = input.nextInt();
		
		if (tokeletes(beker)) {
			System.out.println("ez a szám: "+beker+ " Tökéletes szám!");
		}
		else {
			System.out.println("ez a szám: "+beker+ " NEM Tökéletes szám!");
		}
		
		
		
		
		
	}
	

}
