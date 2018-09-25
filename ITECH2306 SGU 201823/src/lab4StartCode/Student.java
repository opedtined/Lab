package lab4StartCode;

/**
 * @author kkeogh
 * @version 1.0
 * @created 21-Sep-2018 4:55:46 PM
 * Add in additional author details here
 * 
 */
public class Student  {

	private String name;  // name of person
	private String address; // address of person
	private String postcode; // postcode of person's address
	private String studentID; // unique student ID
	private String city;
	private Course courseEnrolledIn; // course this student is enrolled in
	private Vehicle myVehicle;  // vehicle owned by this student
	private static int nextAvailStudentID=0;
	/**
	 * 
	 * @param _name
	 * @param _address
	 * @param _postcode
	 * @param _courseEnrolledIn
	 * @param _phoneNo
	 * @param _myRatePayer
	 */	
	public Student(String _name, String _address, String _postcode, Course _courseEnrolledIn, Vehicle _myVehicle ){
		this.setName(_name);
		this.setAddress(_address);
		this.setPostcode(_postcode);
		this.enrolInCourse(_courseEnrolledIn);
		this.city = "MyCITY";
		this.myVehicle = _myVehicle;
		this.generateStudentID();
	}

	

	/**
	 * 
	 * @param _name
	 * @param _address
	 * @param _postcode
	 * @param _phoneNo
	 * @param _myRatePayer
	 * @param _myVehicle
	 */

	//TODO add new overloaded constructor here to allow to create a student with the optional phone number
	
	/**
	 * 
	 * @param _name
	 * @param _address
	 * @param _postcode
	 * @param _phoneNo
	 * @param _myRatePayer
	 */
	public Student(String _name, String _address, String _postcode, String _phoneNo){
		this.setName(_name);
		this.setAddress(_address);
		this.setPostcode(_postcode);
		this.courseEnrolledIn = null;
		this.myVehicle = null;
		this.city = "MyCITY";
		this.generateStudentID();
	}
	

	private void generateStudentID() {
		// TODO put code here to automatically generate a new student ID
		
	}



	private void setPostcode(String _postcode) {
		// save _postcode to the postcode attribute on this Student
		
	}


	private void setAddress(String _address) {
		// save _address to the address attribute on this Student
		
	}


	private void setName(String _name) {
		// save _name to the name attribute on this Student
		
	}

	public String getName() {
		// get the name of this student
		return " ";
	}
	
	public void enrolInCourse(Course _aCourse){
		// This method will enrol this student in the given course: _aCourse
		// tell the course object to add this student to the student list
		
		// if all was fine with enrolment in the course,
		// save the course object in this student's courseEnrolledIn attribute

	}

	public String generateCourseInvoice(){  // create a String with details of the invoice for this student based on course enrolled in
		return "";
	}

	
	private boolean hasRegisteredVehicle() {
		return (this.myVehicle!=null);
	}
	
	boolean registerVehicle(Vehicle _vehicle) {
		if (_vehicle.isValid()) { // validate if this vehicle is permitted to be registered
			this.myVehicle = _vehicle;
			return true;
			}
		else return false;
	
	}



	public String generateRegistrationInvoice() {
		// TODO complete this method - calculate the fees and create an invoice as a string
		return " Invoice for parking registration : \n currently empty ";
	}

	public String toString() {
		return "Student "; // put more useful information in this string
	}


	
	
	
}//end Student