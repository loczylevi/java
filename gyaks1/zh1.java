package helyo;

public class zh1 {
	public static boolean isOdd(int num){
		// boolean g = (num % 2 == 0) ? false : true;
		
		if (num % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static int numOfDivs(int szam) {
		int osztok_db = 0;
		for (int x = 1; x < szam; x++) {
			if (szam % x == 0) {
				osztok_db++;	
			}
		}
		return osztok_db;
	}
	
	public static boolean isPerfect(int szam) {
		int ossz = 0;
		for (int i = 1; i < szam; i++) {
			if (szam % i == 0) {
				ossz+= i;
			}
		}
		if (ossz == szam) {
			return true;
		}
		else {
			return false;
		}
			
		
		
		
	
		
	}
	public static boolean isPrime(int szam) {
		if (szam == 1) {
			return false;
		}
		else {
			int db = 0;
			for (int x = 1; x <= szam; x++) {
				if (szam % x == 0) {
					db++;
				}
			}
			if (db == 2) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
	}
	public static void sumOfDivisob() {
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(isOdd(6));
		System.out.println(numOfDivs(6));
		System.out.println(isPerfect(28));
		System.out.println(isPrime(3));
	}
	
}
