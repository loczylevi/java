package helyo;

public class elso {
	
	public static int OsztokSzama(int num) {
		int db = 0;
		for (int x = 1; x <= num;x++) {
			if (num % x == 0) {
				db++;	
			}
		}
		return db;
	}
	public static boolean prim_e(int szam) {
		if (OsztokSzama(szam) == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		/* a főprogramban egy ciklusban vegyük sorra 
		a számokat 2-től, és amelyik prím, írjuk ki. A 100.
		kiírt szám után a ciklus álljon le! */
		
		
		int szam = 2;
		int db = 0;
		
		
		while (db < 100) {
			if (prim_e(szam) == true) {
				System.out.print(szam+ " ");
				// System.out.println("db."+db);
				db ++;
			}
			szam ++;
		}
	}
	
	
	
	
	

}
