package bcit.comp1451.lab1a;

public class Book {
	private String title;
	private Date datePublished;
	
	//---------------------------------------------------------
	
	/**
	 * @param title
	 * @param datePublished
	 */
	public Book(String title, Date datePublished) {
		this.title = title;
		this.datePublished = datePublished;
	}
	
	public Book (String title, int year, int month, int day)
	{
		this.title = title;
		this.datePublished = new Date(year, month, day);
	}

	//---------------------------------------------------------	
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the datePublished
	 */
	public Date getDatePublished() {
		return datePublished;
	}

	/**
	 * @param datePublished the datePublished to set
	 */
	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
	}
	
	//---------------------------------------------------------
	
}
