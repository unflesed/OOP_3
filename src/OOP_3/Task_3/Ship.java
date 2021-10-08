package OOP_3.Task_3;

public class Ship extends Vehicle{
    private int numberOfPassengers;
    private String port;
    public Ship(){}
    public Ship(int price, int speed, int year, int numberOfPassengers, String port){
        super(price, speed, year);
        this.numberOfPassengers = numberOfPassengers;
        this.port = port;
    }
    @Override
    void show(){
        System.out.println("Цена корабля: " + getPrice());
        System.out.println("Скорость корабля: " + getSpeed());
        System.out.println("Год выпуска корабля: " + getYear());
        System.out.println("Количество пассажиров: " + getNumberOfPassengers());
        System.out.println("Порт приписки: " + getPort());
    }
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
}
