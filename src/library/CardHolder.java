package library;

	
//	import java.util.List;

	public  class CardHolder {
	    
		private int age;
	    private boolean outstandingFees;
	    private boolean livesInThisCounty;
		
	    public CardHolder(int age, boolean outstandingFees, boolean livesInThisCounty) {

			this.age = age;
			this.outstandingFees = outstandingFees;
			this.livesInThisCounty = livesInThisCounty;
		}

	    
	    
	    public boolean canCheckOut() {
	    	if(age >= 18 && !outstandingFees && livesInThisCounty){
	    		return true;
	    	}else {
	    		return false;
	    	}
	    }



		public int getAge() {
			return age;
		}



		public boolean isOutstandingFees() {
			return outstandingFees;
		}



		public boolean isLivesInThisCounty() {
			return livesInThisCounty;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public void setOutstandingFees(boolean outstandingFees) {
			this.outstandingFees = outstandingFees;
		}



		public void setLivesInThisCounty(boolean livesInThisCounty) {
			this.livesInThisCounty = livesInThisCounty;
		}
	    
	
	    
	    
	    
	    
	    
	    	
	    
	    
	};
	

	


