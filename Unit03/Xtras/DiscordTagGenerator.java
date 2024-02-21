package Unit03.Xtras;

import java.util.Scanner;

public class DiscordTagGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Please input username");
        String username = scan.nextLine();

        String tag = "";
        tag += (int) (Math.random()* 9);
        tag += (int) (Math.random()* 9);
        tag += (int) (Math.random()* 9);
        tag += (int) (Math.random()* 9);
    
        System.out.println(username + tag);
    
        




    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator