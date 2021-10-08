package OOP_3.Task_3;

public class Plane extends Vehicle {
    private int numberOfPassengers;
    private int height;
    public Plane(){}
    public Plane(int price, int speed, int year, int numberOfPassengers, int height){
        super(price, speed, year);
        this.numberOfPassengers = numberOfPassengers;
        this.height = height;
    }
    @Override
    public void show(){
        System.out.println("Цена самолёта: " + getPrice());
        System.out.println("Скорость самолёта: " + getSpeed());
        System.out.println("Год выпуска самолёта: " + getYear());
        System.out.println("Количество пассажиров: " + getNumberOfPassengers());
        System.out.println("Высота полёта: " + getHeight());
    }
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
