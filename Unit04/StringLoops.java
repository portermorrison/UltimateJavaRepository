package Unit04;

public class StringLoops {

    public static boolean xyzThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {
            // found an "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // if it's a ".xyz"
                if (i > 0 && str.substring(i - 1, i).equals(".")) {
                    // do nothing
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            // if I find zip, zap, zsp, etc
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        if (str.length() < 3) {
            result += str;
        } else if (str.substring(str.length() - 3, str.length() - 2).equals("z") &&
                str.substring(str.length() - 1).equals("p")) {
            // do nothing
        } else {
            result += str.substring(str.length() - 2);
        }

        return result;
    }

    public static String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String currentLetter = str.substring(i, i + 1);
            result += currentLetter;
            result += currentLetter;
        }

        return result;
    }

    public static int countCode(String word) {
        int count = 0;
        for (int i = 0; i < word.length() - 3; i++) {
            String part1 = word.substring(i, i + 2);
            String part2 = word.substring(i+ 3, i + 4 );
            if (part1.equals("co") && part2.equals("e")) {
                System.out.println("found one");
            }
        }
        return count;

    }

    public static boolean bobThere(String str) {\
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
    
        return false;
    }

    public static boolean prefixAgain(String str, int n) {
        return false;
    }

    public static boolean sameStarChar(String str) {
        return false;
    }

    public static String starOut(String str) {
        return "";
    }

    public static int countHi(String str) {
        return 0;
    }

    public static boolean endOther(String a, String b) {
        return false;
    }

    public static boolean xyBalance(String str) {
        return false;
    }

    public static String plusOut(String str, String word) {
        return "";
    }

    public static boolean catDog(String str) {
        return false;
    }

    public static String mixString(String a, String b) {
        return "";
    }

    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }

    public static void main(String[] args) {
        // System.out.println(doubleChar("abc"));
        System.out.println(countCode("coffeecodecoffee"));

    }
}
