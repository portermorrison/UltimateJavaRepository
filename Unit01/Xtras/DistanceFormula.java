package Unit01.Xtras;

public class DistanceFormula {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);

        double result = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
        System.out.println(result);

        
    } 
}

// javac Unit01\Xtras\DistanceFormula.java
// java Unit01.Xtras.DistanceFormula 0 0 3 4
