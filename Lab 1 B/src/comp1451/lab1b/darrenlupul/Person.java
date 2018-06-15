package comp1451.lab1b.darrenlupul;

public class Person {
	
	private String 	firstName;
	private String 	lastName;
	private int		yearOfBirth;
	
			double	x;
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param yearOfBirth
	 */
	public Person(String firstName, String lastName, int yearOfBirth) {
		
		setpFirstName(firstName);
		setpLastName(lastName);
		setpYearOfBirth(yearOfBirth);
		
	}
	
	//methods for constructor
	
	private void setpFirstName(String firstName) {
		if (firstName == "" || firstName == null) {
			System.out.println("invalid entry");
			System.exit(0);
		} else
		this.firstName = firstName;
	}
	
	private void setpLastName(String lastName) {
		if (lastName == "" || lastName == null) {
			System.out.println("invalid entry");
			System.exit(0);
		} else
		this.lastName = lastName;
	}
	
	private void setpYearOfBirth(int yearOfBirth) {
		if (yearOfBirth == 0 || yearOfBirth > 2018) {
				System.out.println("invalid year");
				System.exit(0);
		} else
		this.yearOfBirth = yearOfBirth;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the yearOfBirth
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}


	/**
	 * @param yearOfBirth the yearOfBirth to set
	 */
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	/**
	 * @param x the double package private variable
	 */
	public double getX() {
		return x;
	}
	
	
	
	

}
