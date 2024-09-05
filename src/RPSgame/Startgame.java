package RPSgame;

import java.util.Random;
import java.util.Scanner;

public class Startgame {

	public static void main(String[] args) {
		//User Input
     Scanner scanner = new Scanner(System.in);

	 //Game Instance Variables
     String rock = "ROCK";
     String paper = "PAPER";
     String scissors = "SCISSORS";

	 //Game Welcome Message
     System.out.println("[WELCOME TO ROCK....PAPER.....SCISCORS]");

	 //User Information
     System.out.println("Enter Username : ");
      String username = scanner.next();

	  //Age input and validation
      System.out.println("\nEnter Age:");
      int age = scanner.nextInt();
      
      if(age>=18) {
    	  User user = new User(username,age);
    	  user.welcomeName(username);

    	  System.out.println("--------------------------START GAME-------------------------------------");
    	  System.out.println("CHOOSE ONLY 1 OPTION BY TYPING OPTION WORD IN FULL\n1.ROCK\n2.PAPER\n3.SCISCORS ");
    	  System.out.println("ENTER YOUR OPTION HERE...");
    	  String userOption = scanner.next();
    	  
    	  System.out.println(username + ",You chose :"+userOption);
    	
    	  gameOperations[] gameOps = gameOperations.values();
    	  gameOperations computerRandomGenerated = gameOps[random.nextInt(gameOps.length)];
    	  gameOperations crg = computerRandomGenerated;
    	  System.out.println("COMPUTER GENERATED RPS :"+crg);

		 /* userOption = userOption.toLowerCase();
		  crg = crg.toLowerCase();

// Define a variable to store the result
		  String result = switch (userOption) {
			  case rock -> switch (crg) {
				  case "rock" -> "DRAW";
				  case "scissors" -> Username + " WON";
				  case "paper" -> "COMPUTER WON";
				  default -> "Invalid computer option";
			  };
			  case "paper" -> switch (crg) {
				  case "rock" -> Username + " WON";
				  case "scissors" -> "COMPUTER WON";
				  case "paper" -> "DRAW";
				  default -> "Invalid computer option";
			  };
			  case "scissors" -> switch (crg) {
				  case "rock" -> "COMPUTER WON";
				  case "paper" -> Username + " WON";
				  case "scissors" -> "DRAW";
				  default -> "Invalid computer option";
			  };
			  default -> "Invalid user option"; // Handles any unexpected input
		  };

// Print the result
		  System.out.println(result);
      */
	}

}
