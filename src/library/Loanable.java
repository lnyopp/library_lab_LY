package library;


interface Loanable {
	
	boolean isLoanable();
	
	int getLoanTerm();
	
	boolean canBeExtended();

	int getExtendedTerm();
	
	default double getOverDueFee() {
		 {
			return 4.99;
		}
	};
}
