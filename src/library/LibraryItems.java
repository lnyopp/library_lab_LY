package library;

public class LibraryItems {

	// All Library items have a name, genres, number of pages and publish date

	private int numPages, pubDate;
	private String name, genre;
	
	
	public LibraryItems(int numPages, int pubDate, String name, String genre) {
		
		this.numPages = numPages;
		this.pubDate = pubDate;
		this.name = name;
		this.genre = genre;
	}

//getters
	public int getNumPages() {
		return numPages;
	}


	public int getPubDate() {
		return pubDate;
	}


	public String getName() {
		return name;
	}


	public String getGenre() {
		return genre;
	}

//setters
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}


	public void setPubDate(int pubDate) {
		this.pubDate = pubDate;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}


