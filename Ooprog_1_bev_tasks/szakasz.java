package gyaks2;
import java.lang.Math;
/*
 * 2 Szakasz hossza
Írjunk programot, amely a felhasználótól bekéri két síkbeli pont x és y koordinátáit, 
és kiírja a közéjük
húzott egyenes szakasz hosszát (Pitagorasz tételével)!
*/

import java.util.Scanner;
public class szakasz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Szakasz: 1");
		System.out.println("X: ");
		int x_1 = input.nextInt();
		System.out.println("Y: ");
		int y_1 = input.nextInt();
		
		System.out.println("Szakasz: 2");
		System.out.println("X: ");
		int x_2 = input.nextInt();
		System.out.println("Y: ");
		int y_2 = input.nextInt();
		
		double hossz = Math.pow(Math.pow((x_2-x_1), 2) +  Math.pow((y_2-y_1), 2), 0.5);
		System.out.println(hossz);
		
		
		
	}

}
