package library;


public class NewsPaper extends Periodical {

	String location;
	boolean comics;
	
	public NewsPaper(String location, boolean comics,int numPages, int pubDate, String name, String genre) {
		
		super(numPages,pubDate,name,genre);
		this.location = location;
		this.comics = comics;
		
		
	}
}