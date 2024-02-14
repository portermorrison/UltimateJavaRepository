package Unit04;

public class Topic4_3AlgorithmsUsingStrings {
    public static void main(String[] args) {
        String s = "a black cat";

        for (int i = 0; i < s.length(); i++) {
         System.out.println(s.substring(i, i + 1));
        }
    }
}

// javac Unit04\Topic4_3AlgorithmsUsingStrings.java
// java Unit04.Topic4_3AlgorithmsUsingStrings