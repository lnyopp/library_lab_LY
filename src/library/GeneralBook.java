package library;

public class GeneralBook extends Book {
	
	private boolean avaliable;
	private boolean top100;
	
	public GeneralBook(Author author,int numPages, int pubDate,int numCopies, int numLoaned,String name, String genre,boolean avaliable,boolean top100) {
		
		super(author,numPages,pubDate,numCopies,numLoaned,name,genre);
		this.avaliable = avaliable;
		this.top100 = top100;
			
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public boolean isTop100() {
		return top100;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}

	public void setTop100(boolean top100) {
		this.top100 = top100;
	}

}
