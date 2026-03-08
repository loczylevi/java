package registry;

public class oop_gyaks {
	
	private int min;
	
	public oop_gyaks(int hh, int mm) {
		this.min = 60*hh+mm;
		
	}
	
	public oop_gyaks() {
		this.min = 0;
		
	}
	
	public oop_gyaks(int hh) {
		this.min = hh*60;
		
	}
	
	
	
	
	public int getMins() {
		return this.min % 60;
		
	}
	
	public int getHours() {
		return (this.min / 60) % 24;
		
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d", getHours(), getMins());
	}
	
	// getMinsOnly: visszaadja min attribútum értékét
	
	public int getMinsOnly() {
		return this.min;
	}
	
	/*alapműveletek: összeadás (add), kivonás (sub). 
	 * Az eredmény a this objektum és a
	paraméter összege, különbsége. Pl 2:10+3:14 eredménye
 	5:24; 2:10-1:34 eredménye
	1:36. Negatív értéknél 24 órás maradékkal számoljunk: 
	2:10-4:10 eredménye 22:00.*/
	public oop_gyaks add(oop_gyaks masik) {
		int ossz_percek = this.min + masik.min;
		int h = (ossz_percek / 60) % 24 ;
		int m = (ossz_percek % 60);
		
		return new oop_gyaks(h,m);
		
	}
	
	public oop_gyaks sub(oop_gyaks masik) {
		int ossz_percek = Math.abs(this.min - masik.min);
		int h = (ossz_percek / 60) % 24 ;
		int m = (ossz_percek % 60);
		return new oop_gyaks(h,m);
		
	}
	
	public oop_gyaks addMins(int min) {
		int percek = this.min + min;
		int h = (percek / 60) % 24 ;
		int m = (percek % 60);
		return new oop_gyaks(h,m);
		
		
		
	}
	
	public boolean greaterThan(oop_gyaks t) {
		int egyik = this.min;
		int masik = t.min;
		boolean g = (egyik > masik) ? true :  false;
		return g;
	}
	
	public boolean lessThan(oop_gyaks t) {
		int egyik = this.min;
		int masik = t.min;
		boolean g = (egyik < masik) ? true :  false;
		return g;
	}
	
	public int compareTo(oop_gyaks t) {
		int egyik = this.min;
		int masik = t.min;
		if (egyik == masik) {
			return 0;
			
		}
		else if (egyik < masik) {
			return -1;
			
		}
		else {
			return 1;
		}
	}
	
	
	

	public static void main(String[] args) {
		oop_gyaks t1 = new oop_gyaks(2,21);
		oop_gyaks t2 = new oop_gyaks(3,14);
		oop_gyaks t3 = new oop_gyaks(15,0);
		oop_gyaks t4 = new oop_gyaks(12);  // getter?
		oop_gyaks t5 = new oop_gyaks();
		oop_gyaks ossz = t1.add(t2);
		// 2:10+3:14
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(ossz);
	}

}
