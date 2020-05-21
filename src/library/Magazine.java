package library;

public class Magazine extends Periodical {

	String theme,frequency;
	int issueNum;
	
	public Magazine(int numPages, int pubDate, String name, String genre, String theme, String frequency, int issueNum) {

		super(numPages,pubDate,name,genre);
		this.theme = theme;
		this.frequency = frequency;
		this.issueNum = issueNum;
	
	}

}
