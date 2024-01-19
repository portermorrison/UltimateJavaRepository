package Unit02.Topic2_3;

public class Car {
    // instance variable
    private int year;
    private String make;
    private String model;
    private int mileage;

    // constructor
    public Car(String ma, String mo) {
        make = ma;
        model = mo;
        year = 2024;
        mileage = 0;
    }

    // instance methods
    public void driveMiles(int miles) {
        mileage = mileage + miles;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Honda", "Civic");
        Car c2 = new Car("Ford", "F150");

        Point p1 = new Point();

        c1.driveMiles(50);
        p1.moveLeft();
    }
    
}
