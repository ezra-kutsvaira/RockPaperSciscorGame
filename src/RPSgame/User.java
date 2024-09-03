package RPSgame;

public class User {
  private String Username;
  private int Age;
  
  public User(String Username,int Age) {
	  this.Username=Username;
	  this.Age=Age;
  }

public String getUsername() {
	return Username;
}

public void setUsername(String username) {
	Username = username;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}


public void welcomename(String Username) {
	System.out.println("User [Welcome " + Username + "]" + " YOU ARE PLAYING AGAINST THE COMPUTER");
}
  
}
