package library;

public class ReferenceBook extends Book {

	private int edition;
	private String referenceType;

	public ReferenceBook(Author author, int numPages, int pubDate, int numCopies, int numLoaned, String name,
			String genre, int edition, String referenceType) {

		super(author, numPages, pubDate, numCopies, numLoaned, name, genre);
		this.edition = edition;
		this.referenceType = referenceType;

	}

	public int getEdition() {
		return edition;
	}

	public String getReferenceType() {
		return referenceType;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public void setReferenceType(String referenceType) {
		this.referenceType = referenceType;
	}

}