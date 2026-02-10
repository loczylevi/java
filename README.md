# java

```java

package hu.sajat.helloworld;

import java.util.Scanner;// input() fügvényt be kell importálni wtf man ház ez nem python skullemoji 

public class valtozok {
	public static void main(String[] args) {
		System.out.print("Hell yeah\n xd \t dsad \n");    // legalább a \n itt is létezik na a tab is
		
		//______________________________//
		String nev = "Gipsz Jakab";           // elöre meg kell adni a tipusáát a string az valamiért nagy betű xd
		int magassag = 170; // cm
		double kilo = 90.5;
		boolean szobatiszta = false;
		int f = 0;
		f ++;
		//String beker = "";
		
		//______________________________//
		Scanner input = new Scanner(System.in);
		
		
		System.out.print(nev + " Adatai:\n");
		System.out.println("Magasság: " + magassag);
		System.out.println("súly: " + kilo);
		System.out.println("Szobatiszta: " + szobatiszta);
		System.out.print("Add meg a neved: ");
        String beker = input.nextLine(); 
        System.out.print("Hány éves vagy? ");
        int kora = input.nextInt();
        System.out.print("Hány kiló vagy? ");
        double sulya = input.nextDouble();
        
        
        System.out.println("Az ön neve: " + beker);
        System.out.println(kora + " éves");
        System.out.println(sulya + " kg");
        System.out.println(f);
	}

}
```
