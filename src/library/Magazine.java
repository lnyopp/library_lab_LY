package library;

public class Magazine extends Periodical {

	String theme, frequency;
	int issueNum;

	public Magazine(Author author, int numPages, int pubDate, String name, String genre, int numCopies, int numLoaned,
			String theme, String frequency, int issueNum) {

		super(author, numPages, pubDate, numCopies, numLoaned, name, genre);
		this.theme = theme;
		this.frequency = frequency;
		this.issueNum = issueNum;

	}

}
