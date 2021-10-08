package OOP_3.Task_3;

public class Car extends Vehicle{
    public Car(){}
    public Car(int price, int speed, int year){
        super(price, speed, year);
    }
    @Override
    void show(){
        System.out.println("Цена автомобиля: " + getPrice());
        System.out.println("Скорость автомобиля: " + getSpeed());
        System.out.println("Год выпуска автомобиля: " + getYear());
    }
}
