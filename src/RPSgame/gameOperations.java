package RPSgame;

public enum gameOperations {
	
   ROCK("R"),PAPER("P"),SCISCORS("S");
	
	String value;

   gameOperations(String value) {
		this.value = value;
	}
   
   public void getValue(gameOperations value) {
	   System.out.println("Values:"+value);
   }
	
	

}
