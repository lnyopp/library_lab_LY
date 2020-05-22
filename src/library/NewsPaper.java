package library;

public class NewsPaper extends Periodical {

	String location;
	boolean comics;

	public NewsPaper(Author author, int numPages, int pubDate, int numCopies, int numLoaned, String name, String genre,
			String location, boolean comics) {

		super(author, numPages, pubDate, numCopies, numLoaned, name, genre);
		this.location = location;
		this.comics = comics;

	}
}