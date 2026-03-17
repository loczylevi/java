# java

## Láthatóság hint:

__private__: Csak az adott osztály látja. (A gyerek osztály nem!)

__public__: Mindenki látja. (Nincs adatbiztonság.)

__protected__: Csak az adott osztály ÉS annak leszármazottai (gyerekei) látják.

________________________________________________________________________________
## 1. Az Ősosztály (Vehicle)
```java
public class Vehicle {
    protected String brand; // A 'protected' miatt a gyerekosztály látja!

    // Ős konstruktor
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle konstruktor lefutott: " + brand);
    }

    public void honk() {
        System.out.println("Tütűűű!");
    }
}
```
## 2. A Gyerekosztály (Car)
```java
public class Car extends Vehicle {
    private int horsePower;

    public Car(String brand, int hp) {
        // 1. super() - Mindig az első sor kell legyen! 
        // Meghívja a Vehicle(brand) konstruktorát.
        super(brand); 
        
        this.horsePower = hp;
    }

    public void displayInfo() {
        // Mivel a 'brand' PROTECTED a szülőben, 
        // itt közvetlenül elérem, nem kell getter!
        System.out.println("Ez egy " + brand + ", " + horsePower + " lóerővel.");
    }
}
```

```java
	
// hiba elkapás
try {
	student.RemoveCar("GUGU-777"); //hibás rendszám
	student.RemoveCar("AAA-000");
} catch (Exception error) {
	System.out.println(error.getMessage());
	error.printStackTrace();   // mutatja hol a hiba
}
```
		
```
variable = (condition) ? expressionTrue :  expressionFalse;
```
```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```

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
