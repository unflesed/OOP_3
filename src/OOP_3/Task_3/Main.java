package OOP_3.Task_3;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane(100000, 1000, 1999, 200, 10000);
        Vehicle car = new Car(10000, 200, 2020);
        Vehicle ship = new Ship(200000, 55, 1990, 1000, "New York");
        plane.show();
        car.show();
        ship.show();
    }
}
