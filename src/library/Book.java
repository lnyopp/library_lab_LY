package library;



public class Book extends LibraryItems {
	private String author;

	public Book(String author, int numPages,int pubDate,String name, String genre) {
		
		super(numPages, pubDate, name, genre);
		this.setAuthor(author);
		
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

// am thinking about updating this at a later point and adding an id to each book.
