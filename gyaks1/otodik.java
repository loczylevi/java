package helyo;
import java.util.Scanner;
public class otodik {
	/*a) Írjunk függvényt, amely a kedvenc rendező-algoritmusunkkal
	 *  rendezi egy valósokat (double)
tartalmazó tömb vagy lista tartalmát! Ha nincs kedvencünk, 
implementáljuk a kiválasztásos
rendezést!1*/
	
	public static void rendezo(double[] lista) {
		int meddig = lista.length;
		for (int x = 0; x < meddig; x++) {
			for (int j = 0; j < meddig-x-1; j++) {
				if (lista[j] > lista[j+1]) {
					double temp = lista[j];
					 lista[j] = lista[j+1];
					 lista[j+1] = temp;
				}
				
			}
				
		}
		
	          
		
	}
	public static void gyaks(double[] list) {
		int meddig = list.length;
		for (int i = 0; i < meddig-1; i++) {
			for (int j = 0; j < meddig-i-1; j++) {
				if (list[j] > list[j+1]) {
					double temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					
					
				}
				
				
			}
		}
		
		
		
	}
	public static void kiiro(double[] lista) {
		for (double n: lista) {
			System.out.print(n+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		double[] lista = new double[10];
		Scanner input = new Scanner(System.in);
		for (int n = 0; n < 10; n++) {
			System.out.println("num: ");
			double beker = input.nextDouble();
			lista[n] = beker;
			
		}
		
		
		kiiro(lista);
		gyaks(lista);
		kiiro(lista);
		input.close();
		
	}
	

}
