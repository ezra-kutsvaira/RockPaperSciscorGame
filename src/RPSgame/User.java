package RPSgame;

public class User {
  private String username;
  private int age;
  
  public User(String username,int Age) {
	  this.username = username;
	  this.age = age;
  }

public String getUsername() {
	return Username;
}

public void setUsername(String username) {
	Username = username;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	age = age;
}


public void welcomeName(String username) {
	System.out.println("User [Welcome " + username + "]" + " YOU ARE PLAYING AGAINST THE COMPUTER");
}
  
}
