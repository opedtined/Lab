package lab4StartCode;
/*
 * @author Kathleen Keogh September 2018
 * @author Add in additional author names here
 * 
 */
public class DriverClass {

		
	public DriverClass() {
		
	}

	public void start() {
		// put code here to create some test objects and test out your system
		Vehicle v = new Vehicle("Toyota", 5);
		Course c = new Course("Cooking", 8); 
		Student s = new Student("Kathleen Keogh", "25 somewhere street someplace", "3321", c, v);
		System.out.println(s.toString());
	}
	
	public static void main(String[] args) {
		DriverClass d = new DriverClass();
		d.start();

	}

}
