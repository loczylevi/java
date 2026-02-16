package gyaks2;

import java.util.Scanner;
import java.math.*;

public class masodfoku {
	public static void main(String[] args) {
		System.out.println("ax**2+bx+c=0");
		System.out.println("Kérem az a,b és c változókat!");
		Scanner input = new Scanner(System.in);
		System.out.println("a: ");
		int a = input.nextInt();
		System.out.println("b: ");
		int b = input.nextInt();
		System.out.println("c: ");
		int c = input.nextInt();
		System.out.println("Megoldandó másodfokú:\t\t"+a+"x**2+"+b+"x+"+c+"=0");
		
		
		
		
		
		
		double diszkriminans = Math.pow(b,2)-4*a*c;
		
		if (diszkriminans > 0) {
			double masodfoku_p = (((-1* b) + Math.pow(diszkriminans, 0.5))/(2*a));
			double masodfoku_m = (((-1* b) - Math.pow(diszkriminans, 0.5))/(2*a));
			System.out.println("x1: "+masodfoku_p+"\t\tx2: "+masodfoku_m);
			
		}
		else if (diszkriminans == 0) {
			double masodfoku_p = (((-1* b) + Math.pow(diszkriminans, 0.5))/(2*a));
			System.out.println("x1: "+masodfoku_p);
			
		}
		
		
		else {
			System.out.println("nincsen valós megoldás mert nem lehet negatív számból gyököt vonni");
			
		}
		
		
		/* Ehhez a diszkriminánst kell megvizsgálni, ami a gyökjel
		alatti rész. Például ha ott negatív szám van, nincsen valós megoldás, 
		mert nem lehet negatív számból
		gyököt vonni */
		
		
		
		
		
		
	}

}
