package library;



public class Book extends LibraryItems {
	

	public Book(Author author,int numPages, int pubDate,int numCopies, int numLoaned,String name, String genre) {
		
		super(author,numPages,pubDate,numCopies,numLoaned,name,genre);
	
		
		
	}

}

// am thinking about updating this at a later point and adding an id to each book.
