package gep;

public class Main {
	/*c) Főprogram (Main osztályban)
i. hozzunk létre 2 autót és 2 személyt, írassuk ki őket 
a szabványos kimeneten!*/
	
	
	// int year, String ID, String type
	public static void main(String[] args) {
		Vehicle das_auto = new Vehicle();
		Vehicle das_auto2 = new Vehicle(2010, "DAD-101", "Toyota");
		Vehicle das_auto3 = new Vehicle(2020, "LOL-699", "Skoda simply balanced");
		
		// int yob, String name, String address)
		Person student = new Person();
		Person student2 = new Person(1972, "Kukor Ica", "Cicz Imre utca 44");
		Person student3 = new Person(2033, "Cicz Imre", "Bac Ilus utca 55");
		Person student4 = new Person(2033, "Remek Elek", "Vég Béla utca 55");
		
		student.addCar(das_auto); 
		student.addCar(das_auto2);
		student.addCar(das_auto3);
		student.addCar(das_auto3);
	    student2.addCar(das_auto2);
	    
	    System.out.println(student);
	    System.out.println(das_auto);
		
		das_auto.SetOwner(student);
		//System.out.println(das_auto.toString());
		System.out.println(das_auto);
		System.out.println(das_auto2);
		System.out.println(das_auto3);
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		
		
		// hiba elkapás
		try {
			student.RemoveCar("GUGU-777");
			student.RemoveCar("AAA-000");
		} catch (Exception error) {
	    System.out.println(error.getMessage());
		}
		
		student.listCars();
		
		if (das_auto.getOwner() != null) {
            System.out.println("Az autó gazdája: " + das_auto.getOwner().getNev());
        }
		
		
		
	}
	
	
	
}