package RPSgame;

import java.util.Random;
import java.util.Scanner;

public class Startgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     Random random=new Random();
     String rock="ROCK";
     String paper="PAPER";
     String sciscors="SCISCORS";
     System.out.println("[WELCOME TO ROCK....PAPER.....SCISCORS]");
     
     System.out.println("Enter Username :");
      String Username=scan.next();
      System.out.println("\nEnter Age:");
      int Age=scan.nextInt();
      
      if(Age>=18) {
    	  User user1=new User(Username,Age);
    	  user1.welcomename(Username);
    	  
    	  System.out.println("-----------------------------------START GAME---------------------------------------------");
    	  System.out.println("CHOOSE ONLY 1 OPTION BY TYPING OPTION WORD IN FULL\n1.ROCK\n2.PAPER\n3.SCISCORS ");
    	  System.out.println("ENTER YOUR OPTION HERE...");
    	  String userOption=scan.next();
    	  
    	  System.out.println(Username + ",You chose :"+userOption);
    	
    	  gameOperations[] gameOps=gameOperations.values();
    	  gameOperations computerRandomGenerated=gameOps[random.nextInt(gameOps.length)];
    	  gameOperations crg=computerRandomGenerated;
    	  System.out.println("COMPUTER GENERATED RPS :"+crg);
    	
    	/*  if(userOption.equals(crg)) {
    		System.out.println("DRAW");
    	  }
    	  else if((userOption.equals(rock)) && (crg.equals(sciscors))) {
    		  System.out.println(Username + "WON");
    	  }
    		  
    	  else if((userOption.equals(paper)) && (crg.equals(sciscors))) {
    		  System.out.println( " COMPUTER WON");
    	  }
    	  else if((userOption.equals(sciscors)) && (crg.equals(paper))) {
    		  System.out.println(Username + "WON");
    	  }
    	  else if((userOption.equals(sciscors)) && (crg.equals(rock))) {
    		  System.out.println( " COMPUTER WON");
    	  }
    	  else if((userOption.equals(rock)) && (crg.equals(paper))) {
    		  System.out.println( " COMPUTER WON");
    	  }
    	  
    	  else if((userOption.equals(paper)) && (crg.equals(rock))) {
    		  System.out.println(Username + "WON");
    	  }
    	  else
    		System.out.println("HAHAHA ");*/
    	  
      }
      else
    	  System.out.println("Not kids game");
      
	}

}
