package Unit03.Topic3_4;

public class Main {
  public static void main(String[] args) {
    String suggestedPassword = "hey";

    if (suggestedPassword.length() < 8) {
      System.out.println("Password is too short");
    } 
    
    if (suggestedPassword.indexOf("1") == -1) {
      System.out.println("password must contain a number");
    } 
  }

}

// javac Unit03/Topic3_4/Main.java; java Unit03.Topic3_4.Main