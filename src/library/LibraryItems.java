package library;

public class LibraryItems implements Loanable {

	// All Library items have a name, genres, number of pages and publish date

	private int numPages, pubDate,numCopies,numLoaned;
	private String name, genre;
	Author author;
	
	


	public LibraryItems(Author author,int numPages, int pubDate,int numCopies, int numLoaned,String name, String genre) {
		this.author = author;
		this.numPages = numPages;
		this.numCopies = numCopies;
		this.numLoaned = numLoaned;
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
	
	public int getNumLoaned() {
		return numLoaned;
	}

	public int getNumCopies() {
		return numCopies;
		
	}
	
	public Author getAuthor() {
		return author;
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

	

	public void setNumLoaned(int numLoaned) {
		this.numLoaned = numLoaned;
	}

	

	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	
	

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public boolean isLoanable() {
		
		if(this.numCopies > this.numLoaned) {
			return true;
		}else {
			return false;
		}
		
		
		
	}

	@Override
	public int getLoanTerm() {
		
		return 14;
	}

	@Override
	public boolean canBeExtended() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getExtendedTerm() {
		// TODO Auto-generated method stub
		return 7;
	}
	
	
}


