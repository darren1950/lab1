package bcit.comp1451.lab1a;

public class Date {
	
	private int year;
	private int month;
	private int day;
	private String dates;
	
	//---------------------------------------------------------
	
	/**
	 * @param year
	 * @param month
	 * @param day
	 */
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//---------------------------------------------------------
	
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	//---------------------------------------------------------
	
	public String getDate()
	{
		
		this.dates = year + "-" + month + "-" + day;
		return dates;
	}
	

	
}
