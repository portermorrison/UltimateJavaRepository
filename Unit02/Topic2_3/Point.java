package Unit02.Topic2_3;

public class Point {
    // instance variables
    private double x;
    private double y;

    // constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // instance methods
    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveUp() {
        y++;
    }
    
    public void moveDown() {
        y--;
    }

    public void moveToRandomPlace() {
        x = Math.random();
        y = Math.random();
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.moveRight();

        
    }
}
