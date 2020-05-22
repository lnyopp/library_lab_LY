package library;

public class Author {

	private String firstName;
	private String lastName;
	Publisher publisher;
	
	
	
	
	public Author(String firstName, String lastName, Publisher publisher) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.publisher = publisher;
	}
	
	

	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Publisher getPublisher() {
		return publisher;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	
	

}
