package library;

public class Library {

	public static void main(String[] args) {
	
		CardHolder ch = new CardHolder(18,false,true);
		
		System.out.println(ch.canCheckOut());
		
		// Loanable Interface
		Publisher test = new Publisher("SCHOLASTIC");
		Author test2 = new Author("JK", "ROWLING", test);
		
		Loanable b = new Book(test2, 700, 1999,27, 20,"Harry Potter","Fiction");
		
		
		
		
		
			System.out.print(b.isLoanable());
		
		
		

	}

}
