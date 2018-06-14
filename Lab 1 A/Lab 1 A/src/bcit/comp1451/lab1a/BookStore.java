package bcit.comp1451.lab1a;

import java.util.Iterator;
import java.util.ArrayList;

public class BookStore {
	private ArrayList<Book> bookList;
	private Book[] bookListArray;
	
	//---------------------------------------------------------
	
	/**
	 * @param bookList
	 */
	
	public BookStore() {
		
		bookList = new ArrayList<Book>(5);
		
		bookList.add(new Book("Harry Potter", new Date(1997, 10, 31)));
		bookList.add(new Book(null, null));
		bookList.add(new Book(null, new Date(1987, 8, 23)));
		bookList.add(new Book("The Amazing Spiderman", null));
		bookList.add(new Book("Lord of the Rings", 1985, 6, 9));		
		
		
		bookListArray = new Book[5];
		
		bookListArray[0] = new Book("Harry Potter", new Date(1997, 10, 31));
		bookListArray[1] = new Book(null, null);
		bookListArray[2] = new Book(null, new Date(1987, 8, 23));
		bookListArray[3] = new Book("The Amazing Spiderman", null);
		bookListArray[4] = new Book("Lord of the Rings", 1985, 6, 9);	
		
	}

	

	//---------------------------------------------------------
	
	

	//---------------------------------------------------------
	
	public void displayBooks()
	{
		
		System.out.println();
		
		if ((bookList == null || bookList.size() == 0))
		{
			System.out.println("no books");
			return;
		}
		
		
		Iterator<Book> it = bookList.iterator();
		
		while (it.hasNext())
		{
			Book a = it.next();
			if (a == null)
			{
				System.out.println("no book here");				
			}
			
			else if(a.getTitle() == null && a.getDatePublished() == null) 
			{
				System.out.println("no title & no date");
			}
			else if(a.getTitle() == null ) 
			{
				System.out.println("no title" + " " + a.getDatePublished().getDate());
			}
			
			else if (a.getDatePublished() == null)
			{
				System.out.println(a.getTitle() + " no date" );
			}
			else
			{
				System.out.println(a.getTitle() + " " + a.getDatePublished().getDate());
			}
				
		}
		
		//---------------------------------------------------------
		
		System.out.println();

		if (bookListArray == null)
		{
			System.out.println("no book");
			return;
		}
		
		for (Book book : bookListArray)
		{
			if (book == null)
			{
				System.out.println("no book");

			}
			else if (book.getTitle() == null && book.getDatePublished() != null)
			{
				System.out.println("no title" + " " + book.getDatePublished().getDate() );
			}
			else if (book.getTitle() == null && book.getDatePublished() == null )
			{
				System.out.println("no title & no date" );
			}
			else if (book.getDatePublished() == null )
			{
				System.out.println(book.getTitle() + " no date" );
			}
			else
			{
				System.out.println(book.getTitle() + " " + book.getDatePublished().getDate());

				
			}
			
		}
		
		
		
			
		
	}
	
	
}

