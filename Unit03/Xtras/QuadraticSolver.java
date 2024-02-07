package Unit03.Xtras;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input quadratic equation... first enter a");
        int a  = scan.nextInt();
        System.out.println("now enter b");
        int b = scan.nextInt();
        System.out.println("now enter c");
        int c = scan.nextInt();

        scan.close();

        System.out.println("equation: a + b + c = 0");

        double discrimnent = Math.pow(b,2) - 4 * a * c;

        if (discrimnent < 0) {
            System.out.println("No Solutions");
        } else {
            double quadraticFormPlus = (Math.pow(b,2) + Math.sqrt(discrimnent)) / (2 * a);
            double quadraticFormMinus = (Math.pow(b,2) - Math.sqrt(discrimnent)) / (2 * a);

        }


    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver