package practice.Task_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex","sheepdog","Gaf! Gaf!");
        Cat cat = new Cat("Vasya","siamese","Myau! Myau!");
        dog.sound();
        dog.show();
        dog.type();
        cat.sound();
        cat.show();
        cat.type();
    }
}
