package lab4StartCode;
/*
 * @author Kathleen Keogh September 2018
 * @author Add in additional author names here
 * 
 */
public class Vehicle {

	private String model;  // e.g. 
	private int age;
	private String registrationID;
	private double fee;
	private boolean valid;
	
	public Vehicle(String _model, int _age) {
		
		this.setModel(_model); // save model for the vehicle
		this.setAge(_age); // save age of the vehicle 
		this.checkIsValid(); // check if this vehicle is permitted to be registered
		
	}

	/*
	 * Validate if this vehicle is permitted to be registered for parking on campus
	 */
	public boolean isValid() {
		return true;  // add more code here to test if the vehicle model is valid for parking
	}
	
	/*
	 * get the default fee for parking registration for this vehicle
	 */
	protected double getFee() {
		// get the default fee to use for parking registration
		return 0.0;
	}
	
	private void setModel(String _model) {
		this.model = _model;
	}
	
	protected void checkIsValid() {  // valid vehicles must in most cases be younger than 5 years old and not be on restricted vehicle list (car)
		if (this.isValid() && age < 5)
			setValid(true);
		else
			setValid(false);
			
	}
	
	protected void setValid (boolean myswitch) {
		valid = myswitch;
	}
	
	private void setAge(int _age) {
		this.age = _age;
		if (this.age >5) // a car over 5 years in age is not allowed to be registered for parking
			valid = false;
	}

	// the public interface to allow other objects to calculate the registration fee (including any discounts)
	/*
	 * @param yearNo : the number of years that this vehicle has been registered previously 
	 */
	public double calcRegistrationFee(int yearNo){  		/**
		 * The college will apply a discount of 1% for each year of registration. The discount accumulates and is applied to last year's fee.
		 * So, if a vehicle has been registered for 3 years in 2018, the fee is calculated with a discount of 3% of the fee for 2017.
		 *      the fee is 2017 is calculated as a discount of 2% on the fee for 2016 and the fee is 2016 is calculated as 1% discount on the fee in 2015 (init fee)
		 * If first year of registration :
		    fee = INITFEE
		   else : 
		    initialise last year's fee = INITFEE
		    repeat this Loop for each year since first registration :  
		            percentageDiscount = 0.01  (one percent) * number of years registered  (so this increases each year)
		            calculate discount as:  last year's fee * percentageDiscount
		            calculate fee as:  last year's fee less discount
		            update last year's fee to equal fee ready for next iteration through loop
		 */		
		return getFee();
	}
	
	public String getModel() {
		// get the model of this vehicle
		return "";
	}
	
	public int getAge() {
		return 0;  // get the age and return it
	}
	
}
